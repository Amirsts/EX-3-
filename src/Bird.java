public class Bird extends Animal{
    private double wingSpan;

    public Bird(String name , int age , Habitat habitat , double wingSpan){
        super(name , age, habitat);
        this.wingSpan = wingSpan;
    }

    @Override
    public  String makeSound(){
        return "chchch";
    }

    @Override
    public String getType(){
        return "bird";
    }

    @Override
    public  String getFoodType(){
        return "omnivorous";
    }

    @Override
    public double getDailyFoodAmount(){
        return 3.0;
    }
}
