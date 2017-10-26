/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Assignment1 {

    
    public static void main(String[] args) {
        int BMIVALUE=703;
        
        
     
        Scanner br=new Scanner(System.in);
        System.out.println("What is your weight? ");
        double weight=br.nextDouble();
        if(weight<-1){
            System.out.println("are you kidding me?");
            System.out.println("What is your weight? ");
            weight=br.nextDouble();
        }
        System.out.println("What is your height? ");
        System.out.println("Feet:");
        
        int height_feet=br.nextInt();
        if(height_feet<-1){
            System.out.println("are you kidding me?");
            System.out.println("Feet:");
            height_feet=br.nextInt();
        }
        System.out.println("Inches:");
        
        int height_inches=br.nextInt();
        if(height_inches<-1){
            System.out.println("are you kidding me?");
            System.out.println("Inches:");
            height_inches=br.nextInt();
        }
        int height=height_feet*12+height_inches;
        double bmi=(weight*BMIVALUE)/(height*height);
        System.out.printf("Your current BMI is:%.2f",bmi);
    }
    
}
