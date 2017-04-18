package controller;

import dao.FileWorkerForCompanies;
import model.AirCraftCompany;
import service.MoreAboutCompanies;
import view.ConsoleHelperForCompanies;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Владислав
 * @version 1.0
 */
public class ConsoleWorkerForCompanies {
    private ConsoleHelperForCompanies consoleHelperForCompanies = new ConsoleHelperForCompanies();
    private int select_Id;
    private int id4;
    private Scanner scanner = new Scanner(System.in);
    private FileWorkerForCompanies fileWorkerForCompanies = new FileWorkerForCompanies();
    MoreAboutCompanies moreAboutCompanies = new MoreAboutCompanies();

    public ConsoleWorkerForCompanies() throws IOException {
    }

    /**
     * Method what will called from main console worker.
     */
    public void jobWithCompanies() {
        consoleHelperForCompanies.firstDoing();
        select_Id = scanner.nextInt();

        switch (select_Id) {
            case 1:
                fileWorkerForCompanies.add(consoleHelperForCompanies.creatingNewCompany());
                break;
            case 2:
                fileWorkerForCompanies.showAllCompanies();
                break;
            case 3:
                System.out.println(fileWorkerForCompanies.getByID(consoleHelperForCompanies.gettingById()));
                break;
            case 4:
                break;
        }
    }

    /**
     * Method what watch on you select of parts and call methods.
     */

    public void moreInformAboutCompaniesGetSummaryCapacity() {
        System.out.println("Select: \n 1 - Summary total capacity\n 2 - Getting plane by fuel interval");
        id4 = scanner.nextInt();
        switch (id4) {
            case 1:
                System.out.println("Enter id of company\n");
                int index = scanner.nextInt();
                AirCraftCompany airCraftCompany = fileWorkerForCompanies.getByID(index);
                System.out.println(moreAboutCompanies.calculateSummaryCapacityByCompany(airCraftCompany));
        }
    }

    public int getId4() {
        return id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }
}

