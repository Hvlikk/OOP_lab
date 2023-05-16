package package2;


public class Main {

    public static void main(String[] args) {
        Train train = new Train();
        System.out.println("ZADANIE 1)");
        System.out.println("-------------------------");
        System.out.println(Calculator.calculateIncome(10f,train.salary(200f)));
        System.out.println("-------------------------");
        Airplane airplane = new Airplane();
        System.out.println("ZADANIE 2)");
        System.out.println("-------------------------");
        System.out.println(Calculator.calculateIncome(10f,airplane.salary(50f)));
        System.out.println(Calculator.calculateIncome(10f,airplane.salary(20f)));
        System.out.println("-------------------------");

        System.out.println("ZADANIE 3)");
        System.out.println("-------------------------");
        System.out.println("Train: " + Calculator.calculateIncome(45f, train.salary(350f)));
        System.out.println("Train: " + Calculator.calculateIncome(45f, airplane.salary(350f)));
    }

}
