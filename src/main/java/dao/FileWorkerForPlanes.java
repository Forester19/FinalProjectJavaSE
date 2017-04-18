package dao;

import model.AirCraft;
import model.Type;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 17.04.2017.
 */
public class FileWorkerForPlanes implements Filable<AirCraft> {
    String src = "src/main/resources/Planes.txt";
    File file = new File(src);

    @Override
    public void add(AirCraft airCraft) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(airCraft.getId() + " " +
                    airCraft.getName() + " " + airCraft.getTotalCapacity() + " " + airCraft.getTotalCarryCapacity() + " " +
                    airCraft.getMaxRageFlying() + " " + airCraft.getFuelConsumptionPer100km() + " " + airCraft.getType().writeToPlanesFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        ArrayList<AirCraft> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String str;
            String[] arr;
            while ((str = bufferedReader.readLine()) != null) {

                arr = str.split(" ");
                String[] s = arr[6].split(",");
                Type type = new Type(Integer.valueOf(s[0]), s[1]);
                AirCraft airCraft = new AirCraft(Integer.valueOf(arr[0]), arr[1], type, Integer.valueOf(arr[3]), Integer.valueOf(arr[4]), Integer.valueOf(arr[5]), Integer.valueOf(arr[6]));
                arrayList.add(airCraft);
            }
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            for (AirCraft types : arrayList) {
                if (types.getId() == id) continue;
                bufferedWriter.write(types.getId() + " " +
                        types.getName() + " " + types.getTotalCapacity() + " " + types.getTotalCarryCapacity() + " " + types.getMaxRageFlying() +
                        " " + types.getFuelConsumptionPer100km() + " " + types.getType().writeToPlanesFile());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void update() {

    }

    public ArrayList<String> showAllPlanes() {
        String plane;
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((plane = bufferedReader.readLine()) != null) {
                arrayList.add(plane);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public AirCraft getByOD(int id) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            ArrayList<AirCraft> airCrafts = new ArrayList<>();
            String plane;
            String[] planes;
            String[] types;
            while ((plane = bufferedReader.readLine()) != null) {
                planes = plane.split(" ");
                types = planes[6].split(",");
                Type type = new Type(Integer.valueOf(types[0]),types[1]);
                AirCraft airCraft = new AirCraft(Integer.valueOf(planes[0]),
                        planes[1],type,Integer.valueOf(planes[2]),Integer.valueOf(planes[3]),Integer.valueOf(planes[4]),Integer.valueOf(planes[5]));
                airCrafts.add(airCraft);

            }
            for (AirCraft airCraft:airCrafts){
                if (airCraft.getId() == id) return airCraft;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
