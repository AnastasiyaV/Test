package core7HomeTaskBuilderPattern;

public class Main {
    public static void main(String[] args) {
        Soldier john = Soldier.Builder.newInstance()
                .setName("John")
                .setLastName("Sokyl")
                .setBadgeNumber(123)
                .setBloodType("A Rh+")
                .setRank("A")
                .setSex("M")
                .setTypeOfTroops("Type1")
                .build();

        System.out.println(john);
    }
}
