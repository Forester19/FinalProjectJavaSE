package view;

import dao.FileWorkerOfType;
import model.AirCraft;

import java.util.Scanner;

/**
 * @author Владислав
 * @version 1.0
 */
public class ConsoleHelperForPlanes {
    private int id;
    private int idOfTypes;
    private int id_forRemove;
    private int total_Capacity;
    private int total_Carry_Capacity;
    private int max_Rage;
    private int fuel_by100km;
    private int idOfGettingPlane;
    private String name;
    private Scanner scanner = new Scanner(System.in);

    /***
     * Method for working with dao
     * @return id of plane
     */
    private int readIdOfNewPlane() {
        System.out.println("Enter the id of you new plane");
        return id = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return name of plane
     */
    private String readNameOfNewPlane() {
        System.out.println("Enter the name of you new plane");
        return name = scanner.next();
    }

    /***
     * Method for working with dao
     * @return total capacity of plane
     */
    private int readTotalCapacity() {
        System.out.println("Enter you new plane - total capacity");
        return total_Capacity = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return total carry capacity of plane
     */
    private int readTotalCarryCapacity() {
        System.out.println("Enter  you new plane - total carry capacity");
        return total_Carry_Capacity = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return max rage of plane
     */
    private int readMaxRage() {
        System.out.println("Enter max rage");
        return max_Rage = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return id of type of plane
     */
    private int readIfOfType() {
        System.out.println("Enter id of taper what exists");
        return max_Rage = scanner.nextInt();
    }

    private int readFuel() {
        System.out.println("Enter fuel by 100km");
        return fuel_by100km = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return id for remove of plane
     */
    public int reafIdForRemove() {
        System.out.println("Enter the id:\n ");
        return id_forRemove = scanner.nextInt();
    }

    /***
     * Method for working with dao
     * @return object
     */
    public AirCraft creatingNewPlane() {
        FileWorkerOfType fileWorkerOfType = new FileWorkerOfType();

        AirCraft airCraft = new AirCraft(readIdOfNewPlane(), readNameOfNewPlane(), fileWorkerOfType.readById(readIfOfType()),
                readTotalCapacity(), readTotalCarryCapacity(), readMaxRage(), readFuel());
        return airCraft;
    }

    /**
     * method read id for getting plane by id.
     */
    public void readIdForGettingPlane() {
        System.out.println("Enter the id\n");
        idOfGettingPlane = scanner.nextInt();
    }

    public int getIdOfGettingPlane() {
        return idOfGettingPlane;
    }

    public int gettingPlaneById() {
        System.out.println("Enter id of you plane  \n");
        idOfGettingPlane = scanner.nextInt();
        return idOfGettingPlane;
    }

    public void setIdOfGettingPlane(int idOfGettingPlane) {
        this.idOfGettingPlane = idOfGettingPlane;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOfTypes() {
        return idOfTypes;
    }

    public void setIdOfTypes(int idOfTypes) {
        this.idOfTypes = idOfTypes;
    }

    public int getId_forRemove() {
        return id_forRemove;
    }

    public void setId_forRemove(int id_forRemove) {
        this.id_forRemove = id_forRemove;
    }

    public int getTotal_Capacity() {
        return total_Capacity;
    }

    public void setTotal_Capacity(int total_Capacity) {
        this.total_Capacity = total_Capacity;
    }

    public int getTotal_Carry_Capacity() {
        return total_Carry_Capacity;
    }

    public void setTotal_Carry_Capacity(int total_Carry_Capacity) {
        this.total_Carry_Capacity = total_Carry_Capacity;
    }

    public int getMax_Rage() {
        return max_Rage;
    }

    public void setMax_Rage(int max_Rage) {
        this.max_Rage = max_Rage;
    }

    public int getFuel_by100km() {
        return fuel_by100km;
    }

    public void setFuel_by100km(int fuel_by100km) {
        this.fuel_by100km = fuel_by100km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
