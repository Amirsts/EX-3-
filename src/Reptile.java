public class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name , int age , Habitat habitat , boolean isVenomous){
        super(name , age , habitat);
        this.isVenomous = isVenomous;
    }

    @Override
    public String makeSound(){
        return "hhh";
    }

    @Override
    public String getType(){
        return "reptile";
    }

    @Override
    public String getFoodType(){
        return "meat eater";
    }

    @Override
    public double getDailyFoodAmount(){
        return  1.5;
    }

}
