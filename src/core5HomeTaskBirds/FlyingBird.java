package core5HomeTaskBirds;

abstract class FlyingBird extends Bird {
    int wingsNum = 2;

    @Override
    public void fly (){
        System.out.println(String.format("FlyingBird can fly, I have  %d wings", this.wingsNum));
    }


}
