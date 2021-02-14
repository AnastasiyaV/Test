package core5HomeTaskBirds;

public class Penguin extends NonflyingBird {
    String name = "Penguin";

    @Override
    public void fly (){
        System.out.println(String.format("Penguins can not fly"));
    }

    @Override
    public String getName() {
        System.out.println("It is getName method from Penguin class");
        return this.name;
    };

}
