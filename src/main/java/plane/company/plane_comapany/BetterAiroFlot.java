package plane.company.plane_comapany;

import plane.company.model.Plane;
import plane.company.view.ConsoleHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 07.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * This class  include list of planes and can do everything with information by this.
 */
public class BetterAiroFlot {
    /**
     * List of planes.
     */
    ArrayList<Plane> planes = new ArrayList<Plane>();
   ConsoleHelper consoleHelper;
    /**
     *
     * @param planes
     *
     * In constructor we put list of planes what was initialised in main class
     */
    public BetterAiroFlot(ArrayList<Plane> planes)
    {
        consoleHelper =new ConsoleHelper();
        this.planes = planes;
    }

    /**
     * Method for calculating total capacity  of planes
     * @return summary  capacity
     */
    public int totalCapacity(){
        int sum =0;
        for (Plane p: planes)
            sum += p.getCapacity();
        return sum;
    }

    /**
     * Method for calculating total carrying capacity of planes.
     * @return summary carrying capacity
     */
    public int totalCarryingCapacity(){
        int sum =0;
        for (Plane p: planes)
            sum += p.getCarrying_capacity();

        return sum;
        /**
         * Method for sorting planes by rage of fly
         */
    }
    public void selectPlanesToRangeOfFlight(){
        Collections.sort(planes);

    }

    /**
     * @return plane which  fuel consumption in interval from console.
     */
    public Plane selectPlanesToFuel(){
     for (Plane plane:planes){
         if (plane.getFuel_consumption()<= consoleHelper.getInterval2() && plane.getFuel_consumption()>=consoleHelper.getInterval1()){
             return plane;

         }

     }
     return null;
    }


    public ArrayList<Plane> getPlanes() {
        return planes;
    }
}
