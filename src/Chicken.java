public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cuc cuc";
    }
    @Override
    public String howtoEat(){
        return "ga co the an";
    }
}
