package package1;

public class Accountant extends Employee{

    private Float bonus;

    public Accountant (String name, String surname, Float salary, Float bonus)
    {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public double calculateSalary()
    {
        double taxedSalary = super.calculateSalary();
        double taxedBonus = bonus - (bonus * 0.17);
        double totalSalary = taxedSalary + taxedBonus;
        return totalSalary;
    }


}
