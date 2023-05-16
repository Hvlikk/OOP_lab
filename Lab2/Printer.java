import java.util.Scanner;

public class Printer_Halicki {

    public static void print_even(int N){

        for (int i = 0; i <= N; i++)
        {
            if (i % 2 == 0)
                System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {

        System.out.println("ZADANIE 1");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe maksymalna.");
        int N = in.nextInt();

        print_even(N);
    }
}