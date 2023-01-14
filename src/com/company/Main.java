package com.company;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args){
            File myFile = new File("Studentname_javaResults.txt");

           try {
               if (myFile.createNewFile()) {
                   System.out.println("File created Successfully.");
               }
               else {
                   System.out.println("File creation Error.");
               }
           } catch (IOException ex) {
               System.out.println("File Error.");
           }
    }
}
