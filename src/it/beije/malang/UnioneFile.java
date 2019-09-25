package it.beije.malang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class UnioneFile {//classe che copia qualsiasi file in un'altro file
    
    public static void main(String[] args) {
        File sourceFile = new File("C:\\temp\\hello.txt");
        File sinkFile = new File("C:\\temp\\hello2.txt");
        try{copy(sourceFile, sinkFile);
        System.out.println("copiato");
        
        }catch(Exception e){
        	 System.out.println("non copiato");
        	 e.printStackTrace();
        }
    }

    public static void copy(File sourceFile, File destFile) {
        if (!sourceFile.exists() || !destFile.exists()) {
            System.out.println("Source or destination file doesn't exist");
            return;
        }


        try (FileChannel srcChannel = new FileInputStream(sourceFile).getChannel();
             FileChannel sinkChanel = new FileOutputStream(destFile).getChannel()) {

            srcChannel.transferTo(0, srcChannel.size(), sinkChanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}