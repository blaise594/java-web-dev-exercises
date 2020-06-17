package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        int count=0;



        while(count==0){
            //create new scanner
            Scanner in = new Scanner(System.in);
            //get user input
            System.out.println("Enter circle radius: ");
            if(in.hasNextDouble()){
                double radius = in.nextDouble();
                if(radius>0){
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle with a radius of " + radius + " is "+area);
                    count++;
                }
                else{
                    System.out.println("Please enter a number greater than 0");

                }
            }
            else{
                System.out.println("Please enter a valid number");
            }
        }


    }

}
