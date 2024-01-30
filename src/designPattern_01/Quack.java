package designPattern_01;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("QUACK QUACK !!!");
    }
}
