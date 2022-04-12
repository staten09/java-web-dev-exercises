package exercises;

import java.util.Scanner;

public class AreaOfARectangle {

    public static void main(String[] args){
        int length;
        int width;
        int area;
        Scanner input;
        Scanner input2;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextInt();

        input2 = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextInt();
        input.close();

        area = width * length;
        System.out.println("The area of your rectangle is: " + area);



    }
}
