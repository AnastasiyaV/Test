package core5HomeTaskBirds;

public class Swallow extends FlyingBird {
    String name = "Swallow";

    @Override
    public void fly (){
        System.out.println(String.format("Swallow can fly"));
    }

    @Override
    public String getName() {
        System.out.println("It is getName method from Swallow class");
        return this.name;
    }
}
