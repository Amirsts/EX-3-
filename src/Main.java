import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        double totalAnnualSalaries = 0;

        System.out.println("... add employees ...");


        addManager(employees, "Amir", 15_000_000);
        addManager(employees, "Reza", 18_000_000);
        addManager(employees, "Ali123", 12_000_000);


        addDeveloper(employees, "Ashtar", 10_000_000, "Java");
        addDeveloper(employees, "Sara", 12_000_000, "Python");
        addDeveloper(employees, "Narges", 11_000_000, "Java");
        addDeveloper(employees, "Morteza", 9_000_000, "C++");

        System.out.println("\n... employee's report ...");

        //At this moment, AmirMohammad starts grumbling...


        for (Employee emp : employees){
            if (emp instanceof Reportable){
                System.out.println(((Reportable) emp).generateReport());
                System.out.println("......................");
            }
            totalAnnualSalaries += emp.getAnnualSalary();
        }

        System.out.printf("... final result ...\nSum of Annually salary  %,.0f Tooman %n", totalAnnualSalaries);
        System.out.println("number of employees " + employees.size());
    }


    private static void addManager(ArrayList<Employee> list, String name, double baseSalary){
        try{
            Manager manager = new Manager(name, baseSalary);
            list.add(manager);
            System.out.println("Manager added " + name);
        }catch(IllegalArgumentException e) {
            System.out.println("Error creating manager '" + name + "': " + e.getMessage());
        }
    }

    private static void addDeveloper(ArrayList<Employee> list, String name, double baseSalary, String language){
        try{
            Developer developer = new Developer(name, baseSalary, language);
            list.add(developer);
            System.out.println("developer added " + name);
        }catch (IllegalArgumentException e){
            System.out.println("error creating developer '" + name + "': " + e.getMessage());
        }
    }
}