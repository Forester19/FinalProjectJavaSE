package view;

import java.util.Scanner;

/**
 * @author Владислав
 * @version 1.0
 */
public class ConsoleHelperForType {
    private int id_Type;
    private int id_forRemove;
    private String name_Type;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Method for creating new type
     * @return id of type
     */
    public int readIdOfNewType() {
        System.out.println("Enter the id of you new type");
        return id_Type = scanner.nextInt();
    }

    /**
     * Method for deleting new type
     * @return id of type
     */
    public int  reafIdForRemove(){
        System.out.println("Enter the id:\n ");
    return id_forRemove = scanner.nextInt();
    }

    /**
     * Method for creating new type
     * @return name of plane
     */
    public String readNameOfNewType() {
        System.out.println("Enter the name of you new type");
        return name_Type = scanner.next();
    }

    public int getId_Type() {
        return id_Type;
    }

    public String getName_Type() {
        return name_Type;
    }
}
