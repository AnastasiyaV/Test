package core7HomeTaskBuilderPattern;

public class Soldier {
    private String name;
    private String lastName;
    private String rank;
    private int badgeNumber;
    private String bloodType;
    private String typeOfTroops;
    private String sex;

    //Constructor for builder
     private Soldier(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.rank = builder.rank;
        this.badgeNumber = builder.badgeNumber;
        this.bloodType = builder.bloodType;
        this.typeOfTroops = builder.typeOfTroops;
        this.sex = builder.sex;
    }
    @Override
    public String toString() {
        return "User [name= " + name + ", lastName= " + lastName + ", rank= "+rank+ ", badgeNumber= "+badgeNumber + ", bloodType= "+bloodType + ", typeOfTroops= "+typeOfTroops + ", sex= "+ sex+ "]";
    }

    public static class Builder {
        private String name;
        private String lastName;
        private String rank;
        private int badgeNumber;
        private String bloodType;
        private String typeOfTroops;
        private String sex;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }
        public Builder setBadgeNumber (int badgeNumber) {
            this.badgeNumber = badgeNumber;
            return this;
        }
        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }
        public Builder setTypeOfTroops(String typeOfTroops) {
            this.typeOfTroops = typeOfTroops;
            return this;
        }
        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Soldier build() {
            if(lastName == null) {
                //throw new IllegalArgumentException("Lastname should be present in user");
                return null;
            }

            return new Soldier (this);
        }
    }
}
