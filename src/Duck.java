import java.time.LocalDate;

public class Duck extends Animal{
    private int eggCount;

    public Duck() {
    }

    public Duck(String name, double weight, int age, int eggCount) {
        super(name, weight, age);
        this.eggCount = eggCount;
    }

    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }

    public void weeklyEggCount(int days){
        System.out.println("За "+days+" дн. утка "+super.getName()+" снесет "+eggCount*days/7+" яиц.");
    }

    @Override
    public void move(){
        System.out.println("Утка по кличке "+super.name+" идет по земле.");
    }
}
