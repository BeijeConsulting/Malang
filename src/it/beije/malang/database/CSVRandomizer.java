package it.beije.malang.database;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CSVRandomizer {

    public static String generateAlphaNumericString(int n) {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(alphaNumericString.length() * Math.random());
            sb.append(alphaNumericString.charAt(index));
        }

        return sb.toString();
    }

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

            writer = new BufferedWriter(new FileWriter(new File("C:\\Esercizi\\corbosiero2.csv")));
            StringBuilder sb = null;
            Random random = new Random();

            writer.write("NAME;SURNAME;PHONE;EMAIL;CODE\n");

            for(int i = 0; i < 5_000_000; i++){

                int n = random.nextInt(names.size());
                int s = random.nextInt(surnames.size());
                int p = random.nextInt(phones.size());
                int domainIdx = random.nextInt(DOMAINS.length);

                String name = names.get(n);
                String surname = surnames.get(s);

                sb = new StringBuilder();
                sb.append(name).append(";")
                        .append(surname).append(";")
                        .append(phones.get(p)).append(";");

                if(surname.equals(""))
                    surname = "beije";

                if(name.equals(""))
                    name = surname.toLowerCase();

                sb.append(name).append("@").append(surname.toLowerCase() + ".").append(DOMAINS[domainIdx]).append(";");

                sb.append(generateAlphaNumericString(new Random().nextInt(10))).append("\n");

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