package core3HomeTaskStudent;

class StudentsWorker {
    //WHY java asks to make it static? Is it because method countAverageRating is static?
    public static Student student1 = new Student("Bob", 50);
    public static Student student2 = new Student("John", 90);
    public static Student student3 = new Student("Alice", 80);

    public static Student getStudent1() {
        return student1;
    }
    public static Student getStudent2() {
        return student2;
    }
    public static Student getStudent3() {
        return student3;
    }
}
