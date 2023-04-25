package Practice;

import java.util.Arrays;

public class LivingSpace {
    final double rateEurUSD = 1.04;
    private String street;
    private int builder;
    private int floor;
    private String[] family;

    public LivingSpace(String string, int builder,  String[] family) {
        this.street = string;
        this.builder = builder;
        this.family = family;
    }

    @Override
    public String toString() {
        String result = "Str: " + street + "; builder " + builder + "; floor " + floor + "; family " + Arrays.toString(family);
        return result;
    }


    public int getFloor() {
        return floor;
    }

    public String[] getFamily() {
        return family;
    }

    public void setStreet(String street) {
        if (street != null)
        this.street = street;
    }



    public void setFamily(String[] family) {
        this.family = family;
    }
}
class Home extends LivingSpace {
    private int numberOfFloors;

    public Home(String string, int builder, String[] family, int numberOfFloors) {
                   super(string, builder,  family);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "; number of floors - " + numberOfFloors;
    }
}
interface Living {
    int getSizeOfFamily();
    double getSquare();
}
class Apartmant extends LivingSpace implements Living{
    private int numberOfFloors;

    public Apartmant(String string, int builder, String[] family, int numberOfFloors) {
        super(string, builder, family);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "; number of floors - " + numberOfFloors;
    }

    @Override
    public int getSizeOfFamily() {
        return getFamily().length;
    }

    @Override
    public double getSquare() {
        return 45;
    }
}
class Main {
    public static void main(String[] args) {
        LivingSpace space = new LivingSpace("Seestr.", 10,  new String[] {"Bob","Lena","Misha"});
        System.out.println(space.getFloor());
        System.out.println(space);
        String info = space.toString();
        System.out.println(info);
        space.setFamily(new String[]{"Grisha", "Dima"});
        System.out.println(space);

        System.out.println("________________________");

        Home home = new Home("FFFF",4, new String[]{"HHHHHH","ZZZZZ","ggf"},5);
        System.out.println(home);
        Apartmant apartmant = new Apartmant("WW",2,new String[]{"rr","RR"},3);
        System.out.println(apartmant);
        System.out.println(apartmant.getSizeOfFamily());
        System.out.println(apartmant.getSquare());

       Object q =  new  LivingSpace("Test",1,  new String[]{"A", "B", "C"});
    }
}
