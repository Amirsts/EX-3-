import java.util.ArrayList;

public class Zookeeper {
    private String name;
    public ArrayList<Animal> assignAnimal;

    public Zookeeper(String name){
        this.name = name;
        this.assignAnimal = new ArrayList<>();

    }

    public void assignAnimal(Animal animal){
        assignAnimal.add(animal);
    }


    public void feedAnimals(){
        System.out.println("\nfeeding process:");
        for (Animal animal : assignAnimal){
            System.out.println(animal.getName() + " with ---> " + animal.getDailyFoodAmount() + " kg of ---> " + animal.getFoodType());
        }
    }

    public void showAnimalProfiles(){
        System.out.println("keeper: " + name);
        System.out.println("Assigned animals:\n" + "=======================");

        for (Animal animal : assignAnimal){
            System.out.println(animal.getProfile() + "'food: " + animal.getDailyFoodAmount() + "kg'" + "    < food type: " + animal.getFoodType() + " >");
        }
    }

}
