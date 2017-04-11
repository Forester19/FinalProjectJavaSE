package dao;

import controller.ConsoleWorker;
import model.AirCraftCompany;

import java.io.*;

/**
 * Created by Владислав on 10.04.2017.
@author Владислав
 @version 1.0

 Class handler file with information about company :
        ist id
        its Name
        its summary total capacity
        int summary total carry capacity

 */

public class FileWorkerForCompanies {
    ConsoleWorker consoleWorker;
    File file = new File("src/main/resources/CompanyInformation.txt");
    public FileWorkerForCompanies(ConsoleWorker consoleWorker) {
    this.consoleWorker = consoleWorker;

    }

    /**
     * Method writes information about company to file
     */
   public void writeCompanyTOFIle(AirCraftCompany airCraftCompany){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
              writer.write(airCraftCompany.getId_conpany() + " " +airCraftCompany.getName_conpany()+" "+
              consoleWorker.getService().calculateTotalCapacity()+" " + consoleWorker.getService().calculateTotalCarryCapacity());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Method reads all companies from file
     * @return String of information
     */
    public  String readInforAboutCompany(){
        String[] atributs = new String[0];
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String company;
               company = bufferedReader.readLine();
               atributs = company.split(" " );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(atributs[0])+" " + atributs[1]+" "+ Integer.valueOf(atributs[2])+" "+Integer.valueOf(atributs[3]);
    }
}
