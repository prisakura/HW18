public class Dog extends Animal{
    private Breed breed;

    public Dog(String name, double weight, int age, Breed breed) {
        super(name, weight, age);
        this.breed = breed;
    }

    public Dog() {
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void move() {
        System.out.println("Собака по кличке "+this.name+" идет по земле...");
    }

    public void breeding(Breed dog) {
        System.out.println(this.breed.getValue()+"-"+dog.getValue());
    }
}
