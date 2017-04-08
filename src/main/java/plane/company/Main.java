package plane.company;

import plane.company.controller.FileWriterPlanes;
import plane.company.model.AN_140;
import plane.company.model.AN_148;
import plane.company.model.AN_2;
import plane.company.model.Plane;
import plane.company.plane_comapany.BetterAiroFlot;

import java.util.ArrayList;

/**
 * Created by Владислав on 07.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<Plane>();
        BetterAiroFlot betterAiroFlot = new BetterAiroFlot(planes);
        FileWriterPlanes fileWriterPlanes = new FileWriterPlanes(planes,betterAiroFlot);

        Plane plane1 = new AN_2("first",150,1500,5000,100);
        Plane plane2 = new AN_140("second",150,1500,4000,120);
        Plane plane3 = new AN_148("third",150,1500,7777,90);

        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);

        System.out.println(betterAiroFlot.selectPlanesToFuel());
        fileWriterPlanes.writePlanesToFile();


    }
}
