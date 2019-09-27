package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class filecsv {
	
	   static BufferedReader br = null;
	public static void lettura() {
        String csvFile = "C://Users/Padawan06/Desktop/users.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] count = line.split(cvsSplitBy);
                System.out.println("nome " + count[0] + " , name=" + count[1] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
		
		
	public static void scrittura() {
		
		
	}



	
}
