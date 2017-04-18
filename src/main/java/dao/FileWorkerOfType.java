package dao;

import model.Type;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 14.04.2017.
 * @author Владислав
 * @version 1.0
 */
public class FileWorkerOfType implements Filable<Type> {
    private final String filePath = "src/main/resources/Types.txt";
    File file = new File(filePath);

    /**
     * Method writes new type to file.
     * @param type as object.
     */
    @Override
    public void add(Type type) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(type.getId() + " " + type.getName() );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Method remove object from file.
     * @param id of removed type
     */

    @Override
    public void remove(int id) {
        ArrayList<Type> arrayList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String str;
            String[] arr;
            while ((str = bufferedReader.readLine())!=null){

                arr = str.split(" ");
                Type type = new Type(Integer.valueOf(arr[0]),arr[1]);
                arrayList.add(type);
            }
            if (file.exists()){
                file.delete();
                file.createNewFile();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
            for (Type types : arrayList) {
                if (types.getId() == id) continue;
                bufferedWriter.write(types.write() + "\n");
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }


    @Override
    public void update() {

    }


    /**
     * Method show all types on console.
     * @return list of types
     */
    public ArrayList<Type> getAllTypes() {
        ArrayList<Type> list = new ArrayList<>();
        String object;
        String[] arr;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((object = reader.readLine()) != null) {
                arr = object.split(" ");
                Type type = new Type(Integer.valueOf(arr[0]), arr[1]);
                list.add(type);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Method gets type by id.
     * @param id of selected object
     * @return type - object
     */
    public Type readById(int id){
        ArrayList<Type> arrayList = new ArrayList<>();
       String type;
       String[] typeArr;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((type = bufferedReader.readLine())!=null){
                typeArr = type.split(" ");
                Type type1 = new Type(Integer.valueOf(typeArr[0]),typeArr[1]);
            arrayList.add(type1);
            }
            for (Type type1:arrayList){
                if (type1.getId() == id) return type1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
