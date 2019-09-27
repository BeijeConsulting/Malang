package it.beije.malang.database;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CSVRandomizer {

    public static void main(String... args){

        final String[] DOMAINS = {"it", "com", "org", "net"};

        BufferedReader reader = null;
        BufferedWriter writer = null;
        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>();
        List<String> phones = new ArrayList<>();

        try{

            reader = new BufferedReader(new FileReader(new File("C:\\Esercizi\\generato.csv")));
            while (reader.ready()) {
                String[] row = reader.readLine().split(";");
                if (row.length == 3) {

                    names.add(row[0]);
                    surnames.add(row[1]);
                    phones.add(row[2]);

                } else
                    throw new IOException();
            }

            for(int i = 0; i < 10; i++){
                names.add("");
                surnames.add("");
                phones.add("");
            }

            names.remove(0);
            surnames.remove(0);
            phones.remove(0);

            Collections.shuffle(names);
            Collections.shuffle(surnames);
            Collections.shuffle(phones);

            writer = new BufferedWriter(new FileWriter(new File("C:\\Esercizi\\generato2.csv")));
            StringBuilder sb = null;
            Random random = new Random();
            
            writer.write("NAME\tSURNAME\tPHONE\tEMAIL\n");

            for(int i = 0; i < 2000; i++){

                int c = random.nextInt(names.size());
                int domainIdx = random.nextInt(DOMAINS.length);
                
                String name = names.get(c);
                String surname = surnames.get(c);

                sb = new StringBuilder();
                sb.append(name).append(";")
                        .append(surname).append(";")
                        .append(phones.get(c)).append(";");
                
                if(surname.equals(""))
                	surname = "beije";
                
                if(name.equals(""))
                	name = surname.toLowerCase();
                
                sb.append(name).append("@").append(surname + ".").append(DOMAINS[domainIdx]).append(";\n");

                writer.write(sb.toString());
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try {
            	System.out.println("STOP");
                reader.close();
                writer.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }

    }

}