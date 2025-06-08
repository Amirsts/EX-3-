public class Developer extends Employee implements Reportable{
    private String programmingLanguage;

    public Developer(String name , double baseSalary , String programmingLanguage){
        super(name , baseSalary);
        setProgrammingLanguage(programmingLanguage);
    }

    private void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        double bonus = getBaseSalary() * 0.10;
        if ("Java".equalsIgnoreCase(programmingLanguage)) {
            bonus += 1_000_000;
        }
        return bonus;
    }

    @Override
    public String generateReport() {
        return String.format(
                "Developer Report:\n- Name: %s\n- Base Salary: %,.0f\n- Language: %s\n- Bonus: %,.0f\n- Annual Salary: %,.0f",
                getName(), getBaseSalary(), programmingLanguage, calculateBonus(), getAnnualSalary()
        );
    }
}