package dao;

import model.AirCraft;
import model.AirCraftCompany;

import java.io.*;
import java.util.ArrayList;

/**
 * File worker with data base (.txt)
 * @author Владислав
 * @version 1.0
 */
public class FileWorkerForCompanies implements Filable<AirCraftCompany> {
    private File file = new File("src/main/resources/Companies.txt");

    public FileWorkerForCompanies() throws IOException {
    }

    /**
     * Method writes object(company) to file;
     * @param airCraftCompany
     */
    @Override
    public void add(AirCraftCompany airCraftCompany) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
            bufferedWriter.write(airCraftCompany.getId() + " " + airCraftCompany.getName()+ " "+ airCraftCompany.writePlanes()+"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /***
     * Method return strings of info about all companies
     */

    public void showAllCompanies(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            ArrayList<String> arrayList = new ArrayList<>();
            String lines;
            while ((lines = bufferedReader.readLine()) != null){
                arrayList.add(lines);
            }
            for (String s: arrayList){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update() {

    }

    /**
     * Method helps get company by id
     * @param id - int
     * @return object as company
     */
    public AirCraftCompany getByID(int id){
 AirCraftCompany airCraftCompany = null;
 ArrayList<AirCraftCompany> listComp = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
           ArrayList<Integer> list= new ArrayList<>();
            String s;
           String[] ss;
           while ((s = bufferedReader.readLine()) != null){
               ss = s.split(" ");
               String[] p = ss[2].split(",");
               for (String v : p){
                   list.add(Integer.valueOf(v));
               }
 airCraftCompany = new AirCraftCompany(Integer.valueOf(ss[0]),ss[1],list);
           listComp.add(airCraftCompany);
           }
           for (AirCraftCompany a: listComp){
               if (a.getId() == id){
                   return a;
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
