package core5HomeTaskBirds;

public class Eagle extends FlyingBird {
    String name = "Eagle";

    @Override
    public void fly (){
        System.out.println(String.format("Eagle can fly"));
    }

    @Override
    public String getName() {
        System.out.println("It is getName method from Eagle class");
        return this.name;
    }

}
