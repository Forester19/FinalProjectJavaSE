package plane.company.model;

/**
 * Created by Владислав on 07.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * This interface as an a super class for all tree of planes.
 *
 */
public  class Plane implements Comparable<Plane> {
    private int rangeOfFlying;
    private String name;
    private int capacity;
    private int carrying_capacity;
    private int fuel_consumption;

    public Plane(String name, int capacity, int carrying_capacity, int rangeOfFlying, int fuel_consumption) {
        this.name = name;
        this.capacity = capacity;
        this.carrying_capacity = carrying_capacity;
        this.rangeOfFlying = rangeOfFlying;
        this.fuel_consumption = fuel_consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(int carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    void fly_up(){
         System.out.println();
     }

   void landing(){
       System.out.println();
   }

     void fly(){
         System.out.println();
     }

    public int getRangeOfFlying() {
        return rangeOfFlying;
    }

    public void setRangeOfFlying(int rangeOfFlying) {
        this.rangeOfFlying = rangeOfFlying;
    }

    public int compareTo(Plane plane) {
        return this.getRangeOfFlying()>plane.getRangeOfFlying()? 1:-1 ;
    }

    @Override
    public String toString() {
        return "Plane " +
                " " + name + '\'' +
                " " + rangeOfFlying +
                " " + capacity +
                " " + carrying_capacity +
                " " + fuel_consumption;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }
}
