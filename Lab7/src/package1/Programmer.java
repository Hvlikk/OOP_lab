package package1;

public class Programmer extends ITWorker{

    public Programmer (String name, String surname, Float salary, Integer yearsOfExperience)
    {
        super(name, surname, salary, yearsOfExperience);
    }

    public double calculateSalary()
    {
        double taxedSalary = super.calculateSalary();
        return taxedSalary;
    }

}
