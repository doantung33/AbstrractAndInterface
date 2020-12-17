
public class AbstructAndInterface {
    public static void main(String[] args) {
        Animal[] animal=new Animal[2];
        animal[0]= new Chicken();
        animal[1]= new Tiger();
        for (Animal animal1:animal){
            System.out.println(animal1.makeSound());
            if (animal1 instanceof Chicken){
                Edible edible = (Chicken)animal1;
                System.out.println(edible.howtoEat());
            }
        }

        Fruit[] fruit= new Fruit[2];
        fruit[0]= new Orange();
        fruit[1]=new Apple();
        for (Fruit fruit1 :fruit){
            System.out.println(fruit1.howtoEat());
        }

    }
}
