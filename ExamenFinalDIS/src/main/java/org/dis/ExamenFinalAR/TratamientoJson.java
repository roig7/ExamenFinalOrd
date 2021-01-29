package org.dis.ExamenFinalAR;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
public class TratamientoJson {

    private static final String dir_json = new File("LocalizaIP.json").getAbsolutePath();

    public static ArrayList<Customer> leerFicheroJson(){
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Gson gson = new Gson();
        try {
            customers = gson.fromJson(new FileReader(dir_json),new TypeToken<ArrayList<Customer>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return customers;
    }

}
