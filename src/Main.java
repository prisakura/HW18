public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Баря",300,5,4);
        Dog dog = new Dog("Бокс",5600,4,Breed.SPANIEL);

        duck.move();

        duck.weeklyEggCount(10);

        dog.move();

        dog.breeding(Breed.TERRIER);
    }
}
