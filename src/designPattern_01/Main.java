package designPattern_01;

public class Main {
        public static void main(String[] args) {
            Duck mallard = new MallardDuck();
            mallard.performQuack();
            mallard.performFly();
            mallard.display();

            Duck model = new ModelDuck();
            model.performFly();
            model.setFlyBehaviour(new FlyWithRocketPower());
            model.performFly();
            model.display();
        }
}
