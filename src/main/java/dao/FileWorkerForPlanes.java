package dao;

import controller.ConsoleWorker;
import model.AirCraftType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Владислав
 * @version 1.0
 *
 * Class worker for planes with Plane.txt
 */
public class FileWorkerForPlanes {
    private File file;
    private ConsoleWorker consoleWorker;


    public FileWorkerForPlanes(File file, ConsoleWorker consoleWorker) {
        this.file = file;
        this.consoleWorker = consoleWorker;


    }

    /***
     * Method writes plane to file.
     * @param airCraftType
     */
    public void writeAirCraftToFile(AirCraftType airCraftType) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(airCraftType.toString() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method reads all planes from file '.txt'
     * @return List of planes.
     */
    public List<AirCraftType> readAllPlanes() {
        List<AirCraftType> airCraftTypeList = new ArrayList<>();
        String[] plane;
        AirCraftType airCraftType;
        boolean b = true;
        String planes;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((planes = bufferedReader.readLine()) != null) {
                if (b) {
                    b = false;
                    continue;
                }
                plane = planes.split("  ");
                airCraftType = new AirCraftType(Integer.valueOf(plane[0]), plane[1], Integer.valueOf(plane[2]), Integer.valueOf(plane[3]), Integer.valueOf(plane[4]), Integer.valueOf(plane[5]));
                airCraftTypeList.add(airCraftType);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return airCraftTypeList;
    }
}
