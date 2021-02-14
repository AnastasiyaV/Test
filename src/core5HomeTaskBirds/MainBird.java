package core5HomeTaskBirds;

public class MainBird {
    public static void main(String[] args) {

        Bird eagle = new Eagle();
        Bird swallow = new Swallow();
        Bird penguin = new Penguin();
        Bird kiwi = new Kiwi();

        System.out.println("~~~~~~~~ eagle object: ");
        eagle.eat();
        eagle.fly();
        eagle.getName();

        System.out.println("~~~~~~~~ swallow object: ");
        swallow.eat();
        swallow.fly();
        swallow.getName();

        System.out.println("~~~~~~~~ penguin object: ");
        penguin.eat();
        penguin.fly();
        penguin.getName();

        System.out.println("~~~~~~~~ kiwi object: ");
        kiwi.eat();
        kiwi.fly();
        kiwi.getName();


    }
}
