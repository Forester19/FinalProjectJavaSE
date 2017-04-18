package service;

import dao.FileWorkerForCompanies;
import dao.FileWorkerForPlanes;
import model.AirCraft;
import model.AirCraftCompany;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Владислав on 17.04.2017.
 */
public class MoreAboutCompanies {
    FileWorkerForCompanies fileWorkerForCompanies = new FileWorkerForCompanies();
    FileWorkerForPlanes fileWorkerForPlanes = new FileWorkerForPlanes();
    public MoreAboutCompanies() throws IOException {
    }

    public int calculateSummaryCapacityByCompany(AirCraftCompany airCraftCompany){
        int sum = 0;
        ArrayList<AirCraft> airCrafts = new ArrayList<>();
        for (Integer i: airCraftCompany.getCompaniesPlanes()){
                  airCrafts.add(fileWorkerForPlanes.getByOD(i));
        }
        for (AirCraft airCraft: airCrafts){
            sum += airCraft.getTotalCapacity();
        }
        return sum;


    }
}
