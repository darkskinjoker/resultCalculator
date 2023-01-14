package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentNamejavaresults {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Please enter your name here---> ");
        name = sc.nextLine();
        int hometask1,hometask2,midterm,exam,total;

        System.out.println("Please input Score for Home Task 1--->");
        hometask1 = sc.nextInt();
        while (hometask1 > 10) {
            System.out.println("Please input correct Score for Home Task 1--->");
            hometask1 = sc.nextInt();
            if (hometask1 <= 10)
                System.out.println("Correct please proceed.");
            else
                System.out.println("Incorrect Try again--->");
        }

        System.out.println("Please input Score for Home Task 2--->");
        hometask2 = sc.nextInt();
        while (hometask2 > 10) {
            System.out.println("Please input correct Score for Home Task 2--->");
            hometask2 = sc.nextInt();
            if (hometask2 <= 10)
                System.out.println("Correct please proceed.");
            else
                System.out.println("Incorrect Try again--->");
        }
        System.out.println("Please input Score for Midterm --->");
        midterm = sc.nextInt();
        while ( midterm> 30) {
            System.out.println("Please input correct Score for Midterm--->");
            midterm = sc.nextInt();
            if (midterm <= 30)
                System.out.println("Correct please proceed.");
            else
                System.out.println("Incorrect Try again--->");
        }
        System.out.println("Please input Score for Examination--->");
        exam = sc.nextInt();
        while (exam > 50) {
            System.out.println("Please input correct Score for Examination--->");
            exam = sc.nextInt();
            if (exam <= 50)
                System.out.println("Correct please proceed.");
            else
                System.out.println("Incorrect Try again--->");
        }
        total = hometask1 + hometask2 + midterm + exam;
        System.out.println(name + " your total score is " + total + " thank you");

        try {
            FileWriter output0 = new FileWriter("StudentName_javaResults.txt");
            BufferedWriter output = new BufferedWriter(output0);
            output.write(name + "," +" You scored " + hometask1 + " in Hometask1" +"," +" You scored " + hometask2 + " in Hometask2" +"," +" You scored "+ midterm +" in the Midterms"+ "," +"You scored " + exam +" in the final examinations" +" ." + "Your total is = " + total);
            System.out.println("File Entered Successfully.");
            output.close();
        } catch (IOException e) {
            System.out.println("File Write Error.");
        }
    }
}
