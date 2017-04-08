package plane.company.model;

/**
 * Created by Владислав on 07.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * @Entity  examp of planes.
 */
public class AN_2 extends Plane {


    public AN_2(String name, int capacity, int carrying_capacity, int rangeOfFlying, int fuel_consumption) {
        super(name, capacity, carrying_capacity, rangeOfFlying, fuel_consumption);
    }

    public void fly_up() {
        System.out.println("Plane " + getName() + " is fly up. ");
    }

    public void landing() {
        System.out.println("Plane "  +getName() + " is landing. ");
    }

    public void fly() {
        System.out.println("Plane " + getName() + " is flying ");
    }
}
