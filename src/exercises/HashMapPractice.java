package exercises;

import javax.naming.NameNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;


public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap();
        Scanner input = new Scanner(System.in);
        Integer studentID;

        do {
            System.out.print("Enter your Student ID: ");
            studentID = input.nextInt();
            if (studentID > 0){
                System.out.print("Name: ");
                String studentName = input.next();
                students.put(studentID, studentName);
                input.nextLine();
            }
        } while(studentID > 0);

        System.out.println("\nClass roster:");
        String name;

        Entry student;
        for(Iterator var6 = students.entrySet().iterator(); var6.hasNext();name = (String) student.getValue()) {
            student = (Entry)var6.next();
            PrintStream var10000 = System.out;
            Integer var10001 = (Integer) student.getKey();
            var10000.println(var10001 + " (" + student.getValue() + ")");
        }
    }

}
