import java.util.Scanner;

public class Fib_Halicki {
    public static int fibbI(int n){

        int fib_Number = 0, number_1 = 0, number_2 = 1;

        for (int i = 0; i <= n; i++)
        {
            fib_Number = number_1;
            number_2 += number_1;
            number_1 = number_2 - number_1;
        }

        return fib_Number;
    }

    public static int fibbR(int n){

        if (n <= 1)
            return n;
        return (fibbR(n-1) + fibbR(n-2));

    }
    public static void main(String[] args) {

        System.out.println("ZADANIE 2");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n-ty wyraz ciagu.");
        int N = in.nextInt();

        System.out.println("Wynik | metoda iteracyjna: "+fibbI(N));
        System.out.println("Wynik | metoda rekurencyjna: "+fibbR(N));
    }
}
