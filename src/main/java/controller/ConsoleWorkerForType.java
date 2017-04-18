package controller;

import dao.FileWorkerOfType;
import model.Type;
import view.ConsoleHelperForType;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Владислав on 14.04.2017.
 */
public class ConsoleWorkerForType {
    private int selrctParamType;


    private Scanner scanner = new Scanner(System.in);
    ConsoleHelperForType consoleHelperForType = new ConsoleHelperForType();
    FileWorkerOfType fileWorkerOfType = new FileWorkerOfType();

    /**
     * Method that looks on your choice and causes other methods.
     */
    public void doingEveryThingWithTypePath(){
        System.out.println("Select:\n 1 - Add new type\n 2 - remove by id\n 3 - show all types ");
        selrctParamType = Integer.valueOf(scanner.nextInt());
        switch (selrctParamType){
            case 1:
                Type type = new Type(readIdOfNewType(),readNameOfNewType());
                fileWorkerOfType.add(type);
                break;
            case 2:
                   fileWorkerOfType.remove(consoleHelperForType.reafIdForRemove());
                break;
            case 3:
                System.out.println(fileWorkerOfType.getAllTypes().toString());
                break;
        }
    }
    private int readIdOfNewType(){

        return consoleHelperForType.readIdOfNewType();
    }

    private String readNameOfNewType(){return consoleHelperForType.readNameOfNewType();
    }
}
