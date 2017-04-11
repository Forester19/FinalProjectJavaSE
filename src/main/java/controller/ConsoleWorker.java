package controller;

import dao.FileWorkerForCompanies;
import dao.FileWorkerForPlanes;
import model.AirCraftCompany;
import model.AirCraftType;
import serivce.Service;
import view.ConsoleHelper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Владислав on 09.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * Class worker what do everything
 */
public class ConsoleWorker {
    AirCraftType airCraft;
    File file = new File("src/main/resources/Planes.txt");
    ConsoleHelper consoleHelper = new ConsoleHelper();
    FileWorkerForPlanes fileWorkerForPlanes = new FileWorkerForPlanes(file.getAbsoluteFile(), this);
    FileWorkerForCompanies fileWorkerForCompanies = new FileWorkerForCompanies(this);
    AirCraftCompany airCraftCompany = new AirCraftCompany(1, "BestCompany");
    Service service = new Service(airCraftCompany);

    public ConsoleWorker() {
        airCraftCompany.setCompaniesPlanes(this.getFileWorkerForPlanes().readAllPlanes());

        airCraft = createNewPlane();
    }

    /***
     * Method handler all situations which want user.
     * @throws IOException
     */
    public void workWithConsole() throws IOException {
        consoleHelper.readChouse();

        switch (consoleHelper.getSelect_id()) {
            case 1: {
                System.out.println(fileWorkerForPlanes.readAllPlanes().toString());
                break;
            }

            case 2: {

                System.out.println(fileWorkerForCompanies.readInforAboutCompany());
                break;
            }

            case 3: {
                consoleHelper.create();
                fileWorkerForPlanes.writeAirCraftToFile(createNewPlane());
                break;


            }
            case 4:
                System.out.println(service.selectPlanesByMaxRangr());
                break;
            case 5:
                consoleHelper.fuel();
                System.out.println(service.getPlaneByFuelPer100(consoleHelper.getFuel_by100_1(),consoleHelper.getFuel_by100_2()));

        }

    }

    /**
     * Method creates new object AirCraftType
     * @return new plane.
     */
    private AirCraftType createNewPlane() {

        return consoleHelper.getAirCraftType();

    }

    public FileWorkerForPlanes getFileWorkerForPlanes() {
        return fileWorkerForPlanes;
    }

    public AirCraftCompany getAirCraftCompany() {
        return airCraftCompany;
    }

    public Service getService() {
        return service;
    }
}
