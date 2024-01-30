package designPattern_01;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I look like Model Duck !!");
    }
}
