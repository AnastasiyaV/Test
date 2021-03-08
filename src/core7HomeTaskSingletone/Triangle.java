package core7HomeTaskSingletone;
//1. Створити клас Triangle
//        в якому будуть три інтові поля класу
//        int a,b,c;
//        В цьому класі реалізувати метод:
//        calculatePerimeter що повертатиме інтове значення периметру
//        додати гетери і сетери
//        В цьому класі реалізувати патерн Singleton
//2. В класі Main створити екземпляр класу Triangle через getInstance() метод,
//        засетати значення всіх сторін a, b, c
//        викликати мотод calculatePerimeter та вивести його результат в консоль
//        створити другий екземпляр класу
//        і НЕ сетаючи йому значення сторін знову викликати мотод calculatePerimeter та вивести його результат в консоль
public class Triangle {
    int a;
    int b;
    int c;
    int perimeter;
    public int calculatePerimeter(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        return perimeter = this.a+this.b+this.c;
    }
    private static Triangle instance;

    public static Triangle getInstance() {
        if(instance == null) {
            instance = new Triangle ();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", perimeter=" + perimeter +
                '}';
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
}
