package core3HomeTaskStudent;

import java.io.IOException;
//import static core3HomeTaskStudent.StudentsStorage.studentsStorage;


public class Student {
    private String name;
    private int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } //should I delete setName? as the name is assigned in constructor
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public void changeRating(int newRating) throws IOException {
        Main.currentStudent.setRating(newRating);
        String output = String.format("Student %s is assigned with the new rating %d ", this.name, rating);
        System.out.println(output);
    }

    @Override
    public String toString() {
        return "Student [" +
                "name: '" + name + '\'' +
                ", rating: " + rating +
                ']';
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }


}
