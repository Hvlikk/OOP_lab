import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FeaturesCalculator {

    private ArrayList<ArrayList<Integer>> binary_mask;
    private Integer[] mass_center;
    private String filename;


    public FeaturesCalculator(String filename){
        this.filename = filename;
        this.binary_mask = new ArrayList<>();
        this.mass_center = new Integer[]{0,0};
    }

    public void read_data() throws FileNotFoundException{

        File file = new File(this.filename);
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
        {
            String line = scan.nextLine();
            ArrayList<Integer> row = new ArrayList<>();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '0')
                    row.add(0);
                else if (line.charAt(i) == '1')
                    row.add(1);
            }

            this.binary_mask.add(row);
        }
        scan.close();

    }

    public void calculate_mass_center(){
        try {
            int onesCount = 0;

            for (int x = 0; x < binary_mask.size(); x++) {
                for (int y = 0; y < binary_mask.get(x).size(); y++) {
                    if (binary_mask.get(x).get(y) == 1) {
                        onesCount++;
                        mass_center[0] += x;
                        mass_center[1] += y;
                    }
                }
            }

            mass_center[0] /= onesCount;
            mass_center[1] /= onesCount;
        }
        catch (ArithmeticException e) {
            System.out.println("Maska nie posiada żadnej jedynki!!");
            System.exit(0);
        }
    }

    public void save_results() throws FileNotFoundException {
        String results = this.filename.substring(0, this.filename.length() - 4);
        results += "_out.txt";

        PrintWriter zapis = new PrintWriter(results);

        for (int x = 0; x < binary_mask.size(); x++) {
            for (int y = 0; y < binary_mask.get(x).size(); y++) {
                if (x == mass_center[0] && y == mass_center[1])
                    zapis.print("P");
                else zapis.print(binary_mask.get(x).get(y));

                zapis.print(' ');

            }
            zapis.print('\n');
        }

        System.out.println("Zapisano do pliku " + results);
        zapis.close();
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nazwe pliku: ");

            FeaturesCalculator calculator = new FeaturesCalculator(scan.nextLine());

            calculator.read_data();
            calculator.calculate_mass_center();
            calculator.save_results();
        }
        catch (FileNotFoundException e) {
            System.out.println("Taki plik nie istnieje");
        }
    }
}