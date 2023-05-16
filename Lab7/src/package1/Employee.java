package package1;

public abstract class Employee {

    private String name;
    private String surname;
    private Float salary;

    public Employee (String name, String surname, Float salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double calculateSalary(){
        double tax = 0.17;
        double taxedSalary = salary - (salary * tax);
        return taxedSalary;
    }
}
