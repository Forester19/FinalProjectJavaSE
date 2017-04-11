package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Владислав
 * @version 1.0
 *
 * Entity - company.
 */
public class AirCraftCompany {
    private int id_conpany;
    private String name_conpany;
    private ArrayList<AirCraftType> companiesPlanes;
    private int totalCapacityOfCompany;
    private int totalCarryCapacityOfCompany;

    public AirCraftCompany(int id_conpany, String name_conpany) {
        this.id_conpany = id_conpany;
        this.name_conpany = name_conpany;

    }

    public int getId_conpany() {

        return id_conpany;
    }

    public void setId_conpany(int id_conpany) {
        this.id_conpany = id_conpany;
    }

    public String getName_conpany() {
        return name_conpany;
    }

    public void setName_conpany(String name_conpany) {
        this.name_conpany = name_conpany;
    }

    public ArrayList<AirCraftType> getCompaniesPlanes() {
        return companiesPlanes;
    }

    public void setCompaniesPlanes(List<AirCraftType> companiesPlanes) {
        this.companiesPlanes = (ArrayList<AirCraftType>) companiesPlanes;
    }

    public int getTotalCapacityOfCompany() {
        return totalCapacityOfCompany;
    }

    public void setTotalCapacityOfCompany(int totalCapacityOfCompany) {
        this.totalCapacityOfCompany = totalCapacityOfCompany;
    }

    public int getTotalCarryCapacityOfCompany() {
        return totalCarryCapacityOfCompany;
    }

    public void setTotalCarryCapacityOfCompany(int totalCarryCapacityOfCompany) {
        this.totalCarryCapacityOfCompany = totalCarryCapacityOfCompany;
    }

    @Override
    public String toString() {
        return id_conpany + " " + name_conpany +
                " " + companiesPlanes +
                " " + totalCapacityOfCompany +
                " " + totalCarryCapacityOfCompany;
    }
}
