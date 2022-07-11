public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: quac quac quac";
    }

    @Override
    public String howToEat() {
        return "Gaugaugau";
    }
}
