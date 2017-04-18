package controller;

import dao.FileWorkerForCompanies;
import view.ConsoleHelperForCompanies;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Владислав on 17.04.2017.
 */
public class ConsoleWorkerForCompanies {
    private ConsoleHelperForCompanies consoleHelperForCompanies = new ConsoleHelperForCompanies();
    private int select_Id;
    private Scanner scanner = new Scanner(System.in);
    private FileWorkerForCompanies fileWorkerForCompanies = new FileWorkerForCompanies();

    public ConsoleWorkerForCompanies() throws IOException {
    }

    public void jobWithCompanies(){
         consoleHelperForCompanies.firstDoing();
         select_Id = scanner.nextInt();

         switch (select_Id){
             case 1:
                 fileWorkerForCompanies.add(consoleHelperForCompanies.creatingNewCompany());
                 break;
             case 2:
                 fileWorkerForCompanies.showAllCompanies();
                 break;
             case 3:
                 System.out.println(fileWorkerForCompanies.getByID(consoleHelperForCompanies.gettingById()));
                 break;
             case 4:break;
         }
    }
}
