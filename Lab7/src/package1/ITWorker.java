package package1;

public class ITWorker extends Employee{

    private Integer yearsOfExperience;

    public ITWorker(String name, String surname, Float salary, Integer yearsOfExperience)
    {
        super(name, surname, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public Float calculateBonus()
    {
        if (yearsOfExperience < 2)
            return 500.0f;
        else if (yearsOfExperience < 5)
            return 2000.0f;
        else
            return 5000.0f;
    }

    public double calculateSalary()
    {
        double tax = 0.17;
        if (this instanceof  Programmer)
        {
            tax /= 2;
            double taxedSalary = super.calculateSalary();
            double taxedBonus = calculateBonus() - (calculateBonus() * tax);
            double totalSalary = taxedSalary + taxedBonus;
            return totalSalary;
        }
        else {
            double taxedSalary = super.calculateSalary();
            double taxedBonus = calculateBonus() - (calculateBonus() * tax);
            double totalSalary = taxedSalary + taxedBonus;
            return totalSalary;
        }

    }
}
