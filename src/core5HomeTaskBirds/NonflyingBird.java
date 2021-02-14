package core5HomeTaskBirds;

abstract class NonflyingBird extends Bird {
    int legsNum = 2;

    @Override
    public void fly (){
        System.out.println(String.format("NonflyingBird can not fly, but I have  %d legs", this.legsNum));
    }

}
