package designPattern_03;

public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
