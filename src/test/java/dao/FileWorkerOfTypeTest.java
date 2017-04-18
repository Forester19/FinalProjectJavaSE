package dao;

import model.Type;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 15.04.2017.
 */
public class FileWorkerOfTypeTest {
    private final String filePath = "src/main/resources/Types.txt";
    File file = new File(filePath);

    @Test
    public void add() throws Exception {

    }

    @Test
    public void remove() throws Exception {
        FileWorkerOfType fileWorkerOfType = new FileWorkerOfType();
        fileWorkerOfType.remove(1);
        ArrayList<Type> arrayList = new ArrayList<>() ;
        String type;
        String[] types;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
               while ((type = bufferedReader.readLine()) !=null){
                        types = type.split(" ");
                        Type myType = new Type(Integer.valueOf(types[0]),types[1]);
                        arrayList.add(myType);
                }
           }
           assertEquals(2 , arrayList.size());
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void getAllTypes() throws Exception {

    }

}