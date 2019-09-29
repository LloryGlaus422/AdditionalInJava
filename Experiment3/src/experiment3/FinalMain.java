/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sugallo_sd2023
 */
public class FinalMain {

    public static void main(String[] args) throws IOException, Exception {
        boolean x = true;
        while (x) {
            Scanner input = new Scanner(System.in);
            System.out.println("\tChoose: \nPress 1 -- Create \nPress 2 -- Retrieve\nPress 3 -- Update\nPress 4 -- Search\nPress 5 -- Delete\nPress 6 -- Exit");
            System.out.print("Enter Number: ");
            int i = input.nextInt();
            NewClass a = new NewClass();
            switch (i) {
                case 1:
                    a.create();
                    break;
                case 2:
                    boolean lol = true;
                    while (lol) {
                        System.out.println("\tChoose: \nPress 1 -- Retrieve Data From Accounts \nPress 2 -- Retrieve Data from Personal Information\nPress 3 --Data From Course and Sched \nPress 4 -- Exit");
                        System.out.print("Input Number: ");
                        int c = input.nextInt();
                        switch (c) {
                            case 1:
                                a.retrieveAcc();
                                break;
                            case 2:
                                a.retrieveInfo();
                                break;
                            case 3:
                                a.retrieveCourse();
                                break;
                            case 4:
                                x = false;
                        }

                    }
                case 3:
                    boolean yay = true;
                    while (yay) {
                        System.out.println("\tChoose: \nPress 1 -- Update Data From Accounts \nPress 2 -- Update Data from Personal Information\nPress 3 -- Update Data From Course and Sched \nPress 4 -- Exit");
                        System.out.print("Input Number: ");
                        Main d = new Main();
                        int c = input.nextInt();
                        switch (c) {
                            case 1:
                               d.updateAccount();
                                break;
                            case 2:
                                d.updateInformation();
                                break;
                            case 3:
                               d.updateInformation();
                                break;
                            case 4:
                                x = false;
                        }

                    }
                    break;
                case 4:
                    

                    break;
                case 5:

                    break;

                case 6:
                    x = false;

            }
        }
    }
}
