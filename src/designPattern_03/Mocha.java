package designPattern_03;

public class Mocha extends CondimentDecorator{

    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.99 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "Mocha";
    }
}
