package plane.company.plane_comapany;

import org.junit.Before;
import org.junit.Test;
import plane.company.model.AN_148;
import plane.company.model.AN_2;
import plane.company.model.Plane;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 07.04.2017.
 */
public class BetterAiroFlotTest {
    ArrayList<Plane> planes = new ArrayList<Plane>();
    BetterAiroFlot betterAiroFlot = new BetterAiroFlot(planes);

    @Before
    public void setUp() throws Exception {
        Plane plane1 = new AN_2("fef", 150, 1500,5555,100);
        Plane plane2 = new AN_2("fef", 150, 1500,4000,120);
        Plane plane3 = new AN_2("fef", 150, 1500,10000,90);
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);

    }

    @Test
    public void totalCapacity() throws Exception {
      assertEquals(450, betterAiroFlot.totalCapacity());
    }

    @Test
    public void totalCarryingCapacity() throws Exception {
   assertEquals(4500, betterAiroFlot.totalCarryingCapacity());
    }

    @Test
    public void selectPlanesToRangeOfFlight() throws Exception {

    }

    @Test
    public void selectPlaneByGasParam() throws Exception {

    }

}