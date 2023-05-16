import java.util.Scanner;

public class Triangle_Halicki {

    public static void print_triangle(int N) {

        int tab[][] = new int[N][N];

        //Wypełnienie tablicy zerami
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tab[i][j] = 0;

        //Wypełnienie tablicy wartościami
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    tab[i][j] = 1;
                 else
                    tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j];

            }
        }

        //Drukowanie tablicy

        for (int i = 0 ; i < N; i++)
        {
            for (int j = 0; j < N - i; j++)
                System.out.print(" 0 ");
            for (int k = 0; k <= i; k ++)
                System.out.print(tab[i][k] + " 0 ");

            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy - N: ");
        int N = in.nextInt();

        print_triangle(N);
    }
}