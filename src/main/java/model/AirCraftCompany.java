package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Владислав
 * @version 1.0
 *
 * Entity - company.
 */
public class AirCraftCompany extends BaseEntity {
    private ArrayList<Integer> listPlanes;
    private int totalCapacityOfCompany;
    private int totalCarryCapacityOfCompany;

    public AirCraftCompany(int id, String name, ArrayList<Integer> companiesPlanes) {
        super(id, name);
        this.listPlanes = companiesPlanes;

    }


    public ArrayList<Integer> getCompaniesPlanes() {
        return listPlanes;
    }
    public String writePlanes(){
       String res ="";
        for (Integer i: listPlanes){
             res += i+",";
        }
        return res;
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
        return id + " " + name +
                " " + listPlanes +
                " " + totalCapacityOfCompany +
                " " + totalCarryCapacityOfCompany;
    }
}
