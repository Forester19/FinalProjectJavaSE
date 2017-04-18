package controller;

import dao.FileWorkerForPlanes;
import view.ConsoleHelperForPlanes;

import java.util.Scanner;

/**
 * Created by Владислав on 17.04.2017.
 */
public class ConsoleWorkerForPlanes {
    ConsoleHelperForPlanes consoleHelperForPlanes = new ConsoleHelperForPlanes();
    FileWorkerForPlanes fileWorkerForPlanes = new FileWorkerForPlanes();
    private int selectId;
    Scanner scanner = new Scanner(System.in);
    public void doEveryThingWithPlanes(){
        System.out.println("Enter what you want:\n" +
                "1 - Add new plan\n"+
                "2 - Show all planes\n"+
                "3 - Remove plane by id\n" +
                "4 - Get plane by id");
     selectId = scanner.nextInt();
     switch (selectId){
         case 1:
         fileWorkerForPlanes.add(consoleHelperForPlanes.creatingNewPlane());
         break;

         case 2:
             for (String s: fileWorkerForPlanes.showAllPlanes()){
                 System.out.println(s);
             }
         case 3:

             fileWorkerForPlanes.remove(consoleHelperForPlanes.reafIdForRemove());
             break;
         case 4:
             System.out.println(fileWorkerForPlanes.getByOD(consoleHelperForPlanes.gettingPlaneById()).toString());
             break;
     }
    }


}
