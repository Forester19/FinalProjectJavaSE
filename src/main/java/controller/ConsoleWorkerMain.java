package controller;

import service.MoreAboutCompanies;
import view.ConsoleHelperForPlanes;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Владислав on 14.04.2017.
 */
public class ConsoleWorkerMain {
    private int select_ID;
    private int id4;
    MoreAboutCompanies moreAboutCompanies = new MoreAboutCompanies();
    private Scanner scanner = new Scanner(System.in);
    ConsoleWorkerForType consoleWorkerForType = new ConsoleWorkerForType();
    ConsoleWorkerForPlanes consoleWorkerForPlanes = new ConsoleWorkerForPlanes();
    ConsoleWorkerForCompanies consoleWorkerForCompanies = new ConsoleWorkerForCompanies();
    public ConsoleWorkerMain() throws IOException {
        doMain();

        switch (getSelect_ID()) {
            case 1:
                consoleWorkerForPlanes.doEveryThingWithPlanes();
                break;
            case 2:
                consoleWorkerForType.doingEveryThingWithTypePath();
                break;
            case 3:
                consoleWorkerForCompanies.jobWithCompanies();
                break;
            case 4:
                break;
        }
    }

    private void doMain() {
        System.out.println("Please select with what of parts application you want continue!!! \n " +
                "1 - Part of planes\n" +
                "2 - Part of types of planes\n" +
                "3 - Part of planes companies\n"+
                "4 - Get more information about companies");
        select_ID = scanner.nextInt();
        if (select_ID < 1 && select_ID > 3) {
            System.out.println("select parts ( 1 - 3)");
            select_ID = scanner.nextInt();
        }


    }
    private void moreInformAboutCompanies(){
        System.out.println("Select: \n 1 - Summary total capacity\n 2 - Getting plane by fuel interval");
              id4 = scanner.nextInt();
              switch (id4){
                  case 1:
                      System.out.println();
              }
    }

    public int getSelect_ID() {
        return select_ID;
    }
}
