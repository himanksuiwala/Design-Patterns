package designPattern_03;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

    }
}

/*
Espresso: $1.99
Espresso, Mocha: $2.98
Espresso, Mocha, Whip: $3.4699999999999998
Espresso, Mocha, Whip, Soy: $4.96
*/