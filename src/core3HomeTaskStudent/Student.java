package core3HomeTaskStudent;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static core3HomeTaskStudent.StudentsStorage.studentsStorage;

public class Student {
    private String name;
    private int rating;
    static String betterStudent;
    public static float averageRating;
    public static Student currentStudent;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
        String output = String.format("Student %s is assigned with the new rating %d ", this.name, rating);
        System.out.println(output);
    }

    public Student() {}
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        // //NullPointerException
    }
    public Student(String name) {
        this.name = name;
        this.rating = 1; //OR SHOULD I USE SETTER HERE?
        studentsStorage.put(name, this);
    }

    @Override
    public String toString() {
        return "Student [" +
                "name: '" + name + '\'' +
                ", rating: " + rating +
                ']';
    }

    public boolean betterStudent (Student student){
        return this.getRating() > student.getRating();
    }

    public static Student getStudent(String name){
        return studentsStorage.get(name);
    }

    public void changeRating (int newRating) throws IOException {
        currentStudent.setRating(newRating);

    }


}