package dao;

import model.AirCraft;
import model.AirCraftCompany;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 17.04.2017.
 */
public class FileWorkerForCompanies implements Filable<AirCraftCompany> {
    private File file = new File("src/main/resources/Companies.txt");

    public FileWorkerForCompanies() throws IOException {
    }

    @Override
    public void add(AirCraftCompany airCraftCompany) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
            bufferedWriter.write(airCraftCompany.getId() + " " + airCraftCompany.getName()+ " "+ airCraftCompany.writePlanes()+"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
    public AirCraftCompany getByID(int id){
 AirCraftCompany airCraftCompany = null;
 ArrayList<AirCraftCompany> listComp = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
           ArrayList<Integer> list= new ArrayList<>();
            String s;
           String[] ss;
           while ((s = bufferedReader.readLine()) != null){
               ss = s.split(" ");
               String[] p = ss[2].split(", ");
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
