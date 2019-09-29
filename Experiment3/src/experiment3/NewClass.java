/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author sugallo_sd2023
 */
public class NewClass {
    private ArrayList<Student> Info = new ArrayList<>();
    private ArrayList<Student> Accounts = new ArrayList<>();
    private ArrayList<Student> cour = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    

    void retrieveAcc() throws FileNotFoundException {
        String fname;
        Scanner scan = new Scanner(System.in);
        fname = "C:\\Users\\2ndyrGroupC\\Desktop\\Accounts.txt";
        try {
            Main m = new Main();
            String line = null;
            FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.print("Input Id to retrive data: ");
            int a = scan.nextInt();
            while ((line = bufferedReader.readLine()) != null) {
//                if (a == m.getId()) {
//                    System.out.println(line);
//                }
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
    
     void retrieveCourse() throws FileNotFoundException {
        String fname;
        Scanner scan = new Scanner(System.in);
        fname = "C:\\Users\\2ndyrGroupC\\Desktop\\course.txt";
        try {
            Main m = new Main();
            String line = null;
            FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.print("Input Id to retrive data: ");
            int a = scan.nextInt();
            while ((line = bufferedReader.readLine()) != null) {
//                if (a == m.getId()) {
//                    System.out.println(line);
//                }
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
    
    void retrieveInfo() throws FileNotFoundException {
        String fname;
        Scanner scan = new Scanner(System.in);
        fname = "C:\\Users\\2ndyrGroupC\\Desktop\\Info.txt";
        try {
            Main m = new Main();
            String line = null;
            FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.print("Input Id to retrive data: ");
            int a = scan.nextInt();
            while ((line = bufferedReader.readLine()) != null) {
//                if (a == m.getId()) {
//                    System.out.println(line);
//                }
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
    
   
   

    void create() throws IOException, Exception {
        Scanner write = new Scanner(System.in);
        Main m = new Main();
        m.addUsername();
        m.addPassword();
        m.save();
        m.retrieve();
//        m.name();
//        m.last();
//        m.age();
//        m.save2();
//        m.retrieve1();
//        m.course();
//        m.units();
//        m.sched();
//        m.save3();
//        m.retrieve2();
        

        while (true) {
            try {
                System.out.println("enter 1 to Exit");
                int ans = write.nextInt();
                if (ans == 1) {
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please Input Number 1.");
            }
        }

    }
    
    void update(){
        System.out.print("Input Id");
        int a = input.nextInt();
}

}

