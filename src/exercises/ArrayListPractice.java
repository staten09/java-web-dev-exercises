package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){
        Integer sum = 0;
        Scanner input;
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<String> planets = new ArrayList<>();
        Integer wordLength;

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10);

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        for (Integer number:ints) {
            if(number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(ints);
        System.out.println(sum);
        System.out.println();

        input = new Scanner(System.in);
        System.out.println("Enter word length for the search: ");
        wordLength = input.nextInt();

        for (String planet: planets){
            if(planet.length() == wordLength){
                System.out.println(planet);
            }
        }



    }

}
