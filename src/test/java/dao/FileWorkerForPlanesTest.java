package dao;

import controller.ConsoleWorker;
import model.AirCraftType;
import org.junit.Ignore;
import org.junit.Test;
import view.ConsoleHelper;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 10.04.2017.
 */
public class FileWorkerForPlanesTest {

    File file = new File("src/main/resources/Planes.txt");
    ConsoleWorker consoleWorker = new ConsoleWorker();
    FileWorkerForPlanes fileWorkerForPlanes = new FileWorkerForPlanes(file,consoleWorker);
    @Ignore
    @Test
    public void writeAirCraftToFile() throws Exception {
        fileWorkerForPlanes.writeAirCraftToFile(new AirCraftType(4,"fwef",123,123,123,123));
assertEquals(4 , fileWorkerForPlanes.readAllPlanes().size() );
    }

    @Test
    public void readAllPlanes() throws Exception {
        assertEquals(3,fileWorkerForPlanes.readAllPlanes().size());

    }

}