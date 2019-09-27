package it.beije.malang.database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager{

    public static void copyFile(String pathOrig, String pathCopy) throws IOException {
        File orig = new File(pathOrig);
        File copia = new File(pathCopy);
        copyFile(orig, copia);
    }

    public static void copyFile(File orig, File copy) throws IOException {

        if (orig.exists()) {
            FileReader fileReader = new FileReader(orig);
            FileWriter fileWriter = new FileWriter(copy);
            while (fileReader.ready()) {
                fileWriter.write((char)fileReader.read());
            }

            fileReader.close();
            fileWriter.close();
        } else {
            System.out.println("Original file path is wrong");
        }

    }

    public static void main(String[] args) throws IOException {

        //Create File object handler
        File file = new File("C:\\temp\\read.txt");

        //Create FileReader (1 char at time)
        FileReader fileReader = new FileReader(file);

        //Create actual reader BufferedReader
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Contact> contacts = new ArrayList<>();
        Contact contact = null;

        //Reading from file
        while(bufferedReader.ready()){
            String[] row = bufferedReader.readLine().split(";");
            if(row.length == 4) {
                contact = new Contact(row[0], row[1], row[2], row[3]);
                contacts.add(contact);
            }
            else
                throw new IOException();
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("C:\\temp\\write.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String firstRow = "\"SURNAME\"\t\"NAME\"\t\"PHONE\"\t\"MAIL\"";

        for(Contact c : contacts.toArray(new Contact[0])){
            bufferedWriter.write(c.toString());
        }

        bufferedReader.close();
    }

}