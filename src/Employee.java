public abstract class Employee {

    private String name;
    private double baseSalary;

    public Employee (String name , double baseSalary){
        setName(name);
        setBaseSalary(baseSalary);
    }


    private void setName(String name){
        if (!name.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("It should be only English letter!!");
        }
        this.name = name;
    }

    private void  setBaseSalary(double baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("base salary should be positive.");
        }
        this.baseSalary = baseSalary;
    }


    //getters
    public String getName(){
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateBonus();

    public double getAnnualSalary(){
        return (baseSalary * 12) + calculateBonus();
    }

}
