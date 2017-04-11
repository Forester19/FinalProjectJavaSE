package view;

import model.AirCraftType;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Владислав on 09.04.2017.
    @author Владислав
 @version 1.0

 This class helper with console i/o one func its read information from user.

 */
public class ConsoleHelper {
    /**
     * Vars for creating object AirCraftType
     */
    private  int id;
    private int select_id;
    private String name;
    private int totalCapacity;
    private int totalCarryCapacity;
    private int maxRageFlying;
    private int fuelConsumptionPer100km;

    /**
     * This vars for select planes by fuel
     */
    private int fuel_by100_1;
    private int fuel_by100_2;

    public int getFuel_by100_1() {
        return fuel_by100_1;
    }

    public void setFuel_by100_1(int fuel_by100_1) {
        this.fuel_by100_1 = fuel_by100_1;
    }

    public int getFuel_by100_2() {
        return fuel_by100_2;
    }

    public void setFuel_by100_2(int fuel_by100_2) {
        this.fuel_by100_2 = fuel_by100_2;
    }

    Scanner scanner = new Scanner(System.in);
    private AirCraftType airCraftType;

    /**
     * Main method in this class what have all private other methods;
     * @throws IOException
     */
    public void create() throws IOException {
        readId();
        readName();
        readTotalCapacity();
        readTotalCarryCapacity();
        readRange();
        readFuel();
        airCraftType = new AirCraftType(id,name,totalCapacity,totalCarryCapacity,maxRageFlying,fuelConsumptionPer100km);
    }

    public AirCraftType getAirCraftType() {
        return airCraftType;
    }

    /**
     * First method in stack what writes var 'select_id'
     *
     */
    public void readChouse(){
        System.out.println("Select what you want : " + "\n"+ "1 - show all planes \n" + "2 - show all information about  company \n" + "3 - add new plane  \n"+
        "4 - If you wanna select planes by fuel consumption: \n" + "5 - get aircraft by interval of fuel");

        select_id = scanner.nextInt();

    }

    /**
     * Method writes param of future object 'id'
     * @throws IOException
     */
    private void readId() throws IOException {
        System.out.println("Enter id of you plane:");
        id = scanner.nextInt();

    }

    /**
     * Method writes param of future object 'name'
     * @throws IOException
     */
    private void readName() throws IOException {
        System.out.println("Enter name of you plane:");
        name = scanner.next();
    }

    /**
     * Method writes param of future object 'total_capacity'
     * @throws IOException
     */
    private void readTotalCapacity() throws IOException {
        System.out.println("Enter total capacity of you plane ");
        totalCapacity = scanner.nextInt();
    }

    /**
     * Method writes param of future object 'total_carry_capacity'
     * @throws IOException
     */
    private void readTotalCarryCapacity() throws IOException {
        System.out.println("Enter total carry capacity of you plane ");
        totalCarryCapacity = scanner.nextInt();
    }

    /**
     * Method writes param of future object 'max_range_flying'
     * @throws IOException
     */
    private void readRange() throws IOException {
        System.out.println("Enter max rage flying of you plane ");
        maxRageFlying = scanner.nextInt();
    }

    /**
     * Method writes param of future object 'fuel_consumption'
     * @throws IOException
     */
    private void readFuel() throws IOException {
        System.out.println("Enter fuel consumption by 100 km of you plane ");
        fuelConsumptionPer100km = scanner.nextInt();

    }

    /**
     *  Method writes vars interval for selecting plane by fuel consumption.
     */
    public void fuel(){
        System.out.println("Enter pls interval of fuel by 100km for ypu plane: \n ");
        fuel_by100_1 = scanner.nextInt();
        fuel_by100_2 = scanner.nextInt();
    }


    public int getSelect_id() {
        return select_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getTotalCarryCapacity() {
        return totalCarryCapacity;
    }

    public int getMaxRageFlying() {
        return maxRageFlying;
    }

    public int getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }
}
