package serivce;

import controller.ConsoleWorker;
import model.AirCraftType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 11.04.2017.
 */
public class ServiceTest {
    ConsoleWorker consoleWorker = new ConsoleWorker();
    Service service = new Service(consoleWorker.getAirCraftCompany());
    @Test
    public void calculateTotalCapacity() throws Exception {
assertEquals(16791, service.calculateTotalCapacity() );
    }

    @Test
    public void calculateTotalCarryCapacity() throws Exception {
assertEquals(47680,service.calculateTotalCarryCapacity());
    }
    int n =0;

    @Test
    public void selectPlanesByMaxRangr() throws Exception {
      if (service.selectPlanesByMaxRangr().get(0).getMaxRageFlying() <service.selectPlanesByMaxRangr().get(2).getMaxRageFlying()){
           n = 1;
      }
        assertEquals(1,n);
    }
int n0 =0;
    @Test
    public void getPlaneByFuelPer100() throws Exception {
       AirCraftType airCraftType = service.getPlaneByFuelPer100(100,200);
        if (airCraftType.getFuelConsumptionPer100km()>100 || airCraftType.getFuelConsumptionPer100km()<200){
            n0 = 1;
        }
assertEquals(1,n0);
    }

}