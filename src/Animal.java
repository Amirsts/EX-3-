public abstract class Animal implements Feedable{
    private String name;
    private int age;
    private Habitat habitat;

    public Animal(String name , int age , Habitat habitat){
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public abstract String makeSound();
    public abstract String getType();

    public String getProfile(){
        return name + "(" + getType() + ") , [" + age + "years lives in " + habitat.getEnvironmentType() + "] [sound: " + makeSound() + "] ";
    }

    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Habitat habitat(){
        return habitat;
    }
}
