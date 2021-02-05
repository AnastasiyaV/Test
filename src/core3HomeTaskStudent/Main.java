package core3HomeTaskStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
     static int roundedAverageRating = 0;
     static float averageRating;
     public  int newRating = 0;
     public static HashMap<String,Student> studentsStorage = new HashMap <String, Student> ();
     public static Student currentStudent;

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Bob", 50);
        studentsStorage.put(student1.getName(), student1); //Non-static field 'studentsStorage' cannot be referenced from a static context
        Student student2 = new Student("John", 90);
        Student student3 = new Student("Alice", 80);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("-------");
        System.out.println("Student1 is a better student than student2 = " + student1.betterStudent(student2));
        System.out.println("Student2 is a better student than student3 = " + student2.betterStudent(student3));
        System.out.println("Student1 is a better student than student3 = " + student1.betterStudent(student3));
        boolean result = student1.betterStudent(student2);
        boolean result2 = student2.betterStudent(student3);
        boolean result3 = student1.betterStudent(student3);

        System.out.println("-------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the student's name whose rating you want to set (Bob/John/Alice)");
        String name = new String(br.readLine());
        currentStudent = studentsStorage.get(name); //non-static method getStudent cannot be referenced from a static context
        System.out.println("Please enter the new rating you want to set (int from 1 to 100)");
        String newRatingString = br.readLine();
        int newRating = Integer.parseInt(newRatingString);
        currentStudent.changeRating(newRating);


        averageRating = ((student1.getRating() + student2.getRating() + student3.getRating()) / 3);
        roundedAverageRating = Math.round(averageRating);
        System.out.println("averageRating = " + roundedAverageRating);


    }


}
