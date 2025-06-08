

public class Manager extends Employee implements Reportable{
    public Manager(String name , double baseSalary){
        super(name , baseSalary);
    }

    @Override
    public double calculateBonus(){
        return getBaseSalary() * 0.20;
    }

    @Override
    public String generateReport() {
        return String.format(
                "Manager Report:\n- Name: %s\n- Base Salary: %,.0f\n- Bonus: %,.0f\n- Annual Salary: %,.0f",
                getName(), getBaseSalary(), calculateBonus(), getAnnualSalary()
        );
    }

}
