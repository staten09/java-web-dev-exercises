package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){

            Scanner input;
            Double radius;
            Double areaOfCircle;

            input = new Scanner(System.in);
            System.out.println("Please enter a radius:  ");
            radius = input.nextDouble();
            input.close();

            areaOfCircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
        }

}
