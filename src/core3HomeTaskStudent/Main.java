package core3HomeTaskStudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static core3HomeTaskStudent.StudentsWorker.*;

public class Main {
    //static int roundedAverageRating = 0;
    static float averageRating;
    public static Student currentStudent;

    public static void main(String[] args) throws IOException {
        Map<String, Student> studentsStorage = new HashMap<String, Student>();
        studentsStorage.put(student1.getName(), student1);
        studentsStorage.put(student2.getName(), student2);
        studentsStorage.put(student3.getName(), student3);

        System.out.println("is Student1 (Bob) Exists - " + studentsStorage.containsKey("Bob"));

        System.out.println("------- toString method: ");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("------- betterStudent method: ");
        System.out.println("Student1 is a better student than student2 = " + student1.betterStudent(student2));
        //System.out.println("Student1 is a better student than student2 = " + studentsStorage.get("Bob").betterStudent(studentsStorage.get("John")));
        System.out.println("Student2 is a better student than student3 = " + student2.betterStudent(student3));
        System.out.println("Student1 is a better student than student3 = " + student1.betterStudent(student3));

        System.out.println("------- averageRating method: ");


        System.out.println("------- changeRating method: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter the student's name whose rating you want to set (Bob/John/Alice)");
            String name = new String(br.readLine());
            currentStudent = studentsStorage.get(name); //non-static method getStudent cannot be referenced from a static context
            System.out.println("Please enter the new rating you want to set (int from 1 to 100)");
            String newRatingString = br.readLine();
            int newRating = Integer.parseInt(newRatingString);
            currentStudent.changeRating(newRating);

            averageRating = ((student1.getRating() + student2.getRating() + student3.getRating()) / studentsStorage.size());
//            roundedAverageRating = Math.round(averageRating);
//            System.out.println("New averageRating = " + roundedAverageRating);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You have entered not a number (Expected: int from 1 to 100)");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("You have entered not a valid Name (Expected: Bob/John/Alice)");
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
