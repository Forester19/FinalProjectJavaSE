package serivce;

import model.AirCraftCompany;
import model.AirCraftType;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Владислав on 10.04.2017.
 *
 * @author Владислав
 * @version 1.0
 *
 * Class worker with planes by some company.
 */
public class Service {
    AirCraftCompany airCraftCompany;

    public Service(AirCraftCompany airCraftCompany) {
        this.airCraftCompany = airCraftCompany;
    }

    /**
     * Method calculate summary capacity of all planes
     * Enter param its List<AirCraftCompany>
     * @return sum - its integer.
     */
    public int calculateTotalCapacity(){
        int sum = 0;
        for (AirCraftType airCraftType: airCraftCompany.getCompaniesPlanes()){
            sum += airCraftType.getTotalCapacity();
        }
        return sum;
    }

    /**
     * Method calculate summary carry capacity of all planes
     * Enter param its List<AirCraftCompany>
     * @return sum - its integer.
     */
    public int calculateTotalCarryCapacity(){
        int sum = 0;
        for (AirCraftType airCraftType: airCraftCompany.getCompaniesPlanes()){
            sum += airCraftType.getTotalCarryCapacity();
        }
        return sum;
    }

    /**
     * Method what sorting List of planes by max rage flying.
     * @Enter param its ArrayList by AirCraftTypes.
     * @return sorted collection.
     */
    public ArrayList<AirCraftType> selectPlanesByMaxRangr(){
         Collections.sort(airCraftCompany.getCompaniesPlanes());
    return airCraftCompany.getCompaniesPlanes();
    }

    /**
     * Method what return plane as object which fuel in interval >a & <b.
     *
     * @param a
     * @param b
     * @return plane.
     */
    public AirCraftType getPlaneByFuelPer100(int a, int b){
        for (AirCraftType airCraftType: airCraftCompany.getCompaniesPlanes()){
            if (airCraftType.getFuelConsumptionPer100km() >=a || airCraftType.getFuelConsumptionPer100km()<= b){
                return airCraftType;
            }
        }
        return null;
    }
}
