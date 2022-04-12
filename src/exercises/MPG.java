package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args){
        int milesDriven;
        int gallonsUsed;
        int mpg;
        Scanner input;
        Scanner input2;

        input = new Scanner(System.in);
        System.out.println("Enter miles you have driven: ");
        milesDriven = input.nextInt();

        input2 = new Scanner(System.in);
        System.out.println("Enter how many gallons you have used: ");
        gallonsUsed = input.nextInt();
        input.close();

        mpg = milesDriven / gallonsUsed;
        System.out.println("Your MPG is: " + mpg +"mpg");



    }

}
