/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int flag = 0;
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the first name:");
        String first = str.readLine();

        char a = first.charAt(0);
        int ai = (int) a;
        if (ai <= 57 && ai >= 48) {
            System.out.println("Error: The first name was not accepted.");
            flag = 1;
        } else {
            System.out.printf(first);
            System.out.println(" is the first name.");
        }
        System.out.println("Please input the second name:");
        String second = str.readLine();
        char b = second.charAt(0);
        int bi = (int) b;
        if (bi <= 57 && bi >= 48) {
            System.out.println("Error: The second name was not accepted.");

            if (flag == 1) {
                flag = 4;
            }
            flag = 2;
        } else {
            System.out.printf(second);
            System.out.println(" is the second name.");
        }
        System.out.println("Please input the third name:");
        String third = str.readLine();
        char c = third.charAt(0);
        int ci = (int) c;
        if (ci <= 57 && ci >= 48) {
            System.out.println("Error: The third name was not accepted.");

            if (flag == 1) {
                flag = 5;
            }
            if (flag == 2) {
                flag = 6;
            }
            if (flag == 3) {
                flag = 7;
            }
            flag = 3;
        } else {
            System.out.printf(third);
            System.out.println(" is the third name.");
        }
        System.out.println("The names in alphabetical order are");
        switch (flag) {
            case 0:
                if (second.compareTo(third) <= 0) {
                    if (first.compareTo(second) > 0) {
                        if (first.compareTo(third) > 0) {
                            System.out.println(second);
                            System.out.println(third);
                            System.out.println(first);
                        } else {
                            System.out.println(second);
                            System.out.println(first);
                            System.out.println(third);

                        }
                    } else {
                        System.out.println(first);
                        System.out.println(second);
                        System.out.println(third);
                    }
                }
                if (second.compareTo(third) > 0) {
                    if (first.compareTo(second) > 0) {
                        if (first.compareTo(third) > 0) {

                            System.out.println(third);
                            System.out.println(second);
                            System.out.println(first);
                        } else {
                            System.out.println(third);
                            System.out.println(first);
                            System.out.println(second);
                        }
                    } else {
                        System.out.println(first);
                        System.out.println(third);
                        System.out.println(second);
                    }
                }
                break;
            case 1:
                if (second.compareTo(third) <= 0) {
                    System.out.println(second);
                    System.out.println(third);
                } else {
                    System.out.println(third);
                    System.out.println(second);
                }
                break;
            case 2:
                if (first.compareTo(third) <= 0) {
                    System.out.println(first);
                    System.out.println(third);
                } else {
                    System.out.println(third);
                    System.out.println(first);
                }
                break;
            case 3:
                if (first.compareTo(second) <= 0) {
                    System.out.println(first);
                    System.out.println(second);
                } else {
                    System.out.println(second);
                    System.out.println(first);
                }
                break;
            case 4:
                System.out.println(third);
                break;
            case 5:
                System.out.println(second);
                break;
            case 6:
                System.out.println(first);
                break;
            case 7:
                break;

        }
    }
}

    

