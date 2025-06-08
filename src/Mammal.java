public class Mammal extends Animal{
    private boolean isNocturnal;

    public Mammal(String name , int age , Habitat habitat , boolean isNocturnal){
        super(name , age , habitat);
        this.isNocturnal = isNocturnal;
    }

    @Override
    public String makeSound(){
        return "ghghgh";
    }

    @Override
    public String getType(){
        return "mammal";
    }
    @Override
    public String getFoodType(){
        return "herbivore";
    }

    @Override
    public double getDailyFoodAmount(){
        return 70.0;
    }
}
