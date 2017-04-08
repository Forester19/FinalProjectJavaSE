package plane.company.controller;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import plane.company.model.Plane;
import plane.company.plane_comapany.BetterAiroFlot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Владислав on 08.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * Class writer planes to file as in database. Every  user can open ".txt" adr read information.
  */
public class FileWriterPlanes {
    ArrayList<Plane> planes = new ArrayList<>();
   BetterAiroFlot betterAiroFlot;

    /**
     * @param planes
      * @param betterAiroFlot
              Constructor gets exam of List and BetterAiroFlot.
      */
    public FileWriterPlanes(ArrayList<Plane> planes, BetterAiroFlot betterAiroFlot) {
        this.planes = planes;
        this.betterAiroFlot = betterAiroFlot;
    }
    File file = new File("src/main/resources/Planes.txt");

    /**
     * Method writes objects to '.txt' file. Using buffered writer.
     */
    public void writePlanesToFile(){
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true))) {
            for (Plane p: planes) {
                bf.write(p.toString());
                bf.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
