package core5HomeTaskBirds;

public class Kiwi extends NonflyingBird {
    String name = "Kiwi";

    @Override
    public void fly (){
        System.out.println(String.format("Kiwi can not fly"));
    }

    @Override
    public String getName() {
        System.out.println("It is getName method from Kiwi class");
        return this.name;
    };
}
