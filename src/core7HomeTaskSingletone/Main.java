package core7HomeTaskSingletone;
 
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = Triangle.getInstance();
        System.out.println(triangle1.calculatePerimeter(1,2,3));
        System.out.println(triangle1.toString());

        Triangle triangle2 = Triangle.getInstance();
        System.out.println(triangle2.calculatePerimeter(1,2,4));
        System.out.println(triangle2.toString());
    }
}
