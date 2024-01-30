package designPattern_01;
public abstract class Duck {
    FlyBehavior flyBehaviour;
    QuackBehavior quackBehaviour;

    public Duck(){
    }

    public abstract void display();

    void performFly(){
        flyBehaviour.fly();
    }

    void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehavior fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehavior qb){
        quackBehaviour = qb;
    }
    public void Swim(String args){
        System.out.println("All Ducks float");
    }
}
