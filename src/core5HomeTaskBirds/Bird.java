package core5HomeTaskBirds;

abstract class Bird {
    protected int age;
    static boolean wormBlood = true;
    static boolean hasLungs = true;
    String name;

    public void eat() {
        System.out.println("Bird is eating");
    }

    public abstract void fly();

    public abstract String getName();
}
