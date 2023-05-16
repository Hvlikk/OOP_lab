package package1;

public class Main {
    public static void main(String[] args) {

        Accountant accountant = new Accountant("Adam", "Wiśniewski", 6000f, 0.1f * 6000f);
        ITWorker itWorker1 = new ITWorker("Agata", "Wróbel", 7500f, 3);
        ITWorker itWorker2 = new ITWorker("Paweł", "Kowalski", 5000f, 1);
        Programmer programmer = new Programmer("Ada", "Nowak", 8000f, 6);


        System.out.println("package1.Accountant: " + accountant.getName() + " " + accountant.getSurname() +
                ", salary: " + accountant.calculateSalary());
        System.out.println("IT Worker 1: " + itWorker1.getName() + " " + itWorker1.getSurname() +
                ", salary: " + itWorker1.calculateSalary());
        System.out.println("IT Worker 2: "  + itWorker2.getName() + " " + itWorker2.getSurname() +
                ", salary: " + itWorker2.calculateSalary());
        System.out.println("package1.Programmer: " + programmer.getName() + " " + programmer.getSurname() +
                ", salary: " + programmer.calculateSalary());
    }
}