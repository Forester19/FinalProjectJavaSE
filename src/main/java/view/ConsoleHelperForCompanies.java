package view;

import dao.FileWorkerForPlanes;
import model.AirCraft;
import model.AirCraftCompany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Владислав on 17.04.2017.
 */
public class ConsoleHelperForCompanies {
    private FileWorkerForPlanes fileWorkerForPlanes = new FileWorkerForPlanes();
    private Scanner scanner = new Scanner(System.in);
    private int id;
    private int idForgattingById;
    private String name;
    private String ids;
    private AirCraft airCraft;

    public void firstDoing() {
        System.out.println("Select what you wanna doing   \n" +
                "1 - Create new company\n" +
                "2 - Show all companies \n" +
                "3 - Get by id\n " +
                "4 - Remove by id\n ");

    }

    AirCraftCompany airCraftCompany;

    public AirCraftCompany creatingNewCompany() {
        System.out.println("Enter id \n");
        id = scanner.nextInt();
        System.out.println("Enter Name \n");
        name = scanner.next();
        System.out.println("Enter id's of ");
        ids = scanner.next();
        String[] s = ids.split(",");
        ArrayList<Integer> index = new ArrayList<>();
        for (String c: s){
            index.add(Integer.valueOf(c));
        }


        airCraftCompany = new AirCraftCompany(id, name, index);
        return airCraftCompany;
    }
    public int gettingById(){
        System.out.println("Enter id of ypu company");
        return idForgattingById = scanner.nextInt();
    }
}
