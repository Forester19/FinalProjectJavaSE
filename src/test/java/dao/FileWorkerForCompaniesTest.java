package dao;

import controller.ConsoleWorker;
import model.AirCraftCompany;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 11.04.2017.
 */
public class FileWorkerForCompaniesTest {
    File file = new File("src/main/resources/CompanyInformation.txt");
    ConsoleWorker consoleWorker = new ConsoleWorker();
    FileWorkerForCompanies fileWorkerForComp = new FileWorkerForCompanies(consoleWorker);
    AirCraftCompany airCraftCompany = new AirCraftCompany(2,"fref");
    @Test
    public void writeCompanyTOFIle(AirCraftCompany airCraftCompany) throws Exception {
        fileWorkerForComp.writeCompanyTOFIle(airCraftCompany);
        ArrayList<String> strings;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
             strings = new ArrayList<>();
            String s;
            while ((s = bufferedReader.readLine())!= null){
                strings.add(s);
            }
        }
        assertEquals(2, strings.size());

    }

    @Test
    public void readInforAboutCompany() throws Exception {
        fileWorkerForComp.writeCompanyTOFIle(airCraftCompany);
        ArrayList<String> strings;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            strings = new ArrayList<>();
            String s;
            while ((s = bufferedReader.readLine())!= null){
                strings.add(s);
            }
        }
assertEquals(1,strings.size());
    }

}