import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Warzywo {

    private String name;
    private Float price;
    private Integer count;
    private DataWaznosci dataWaznosci;
    private static int countStatic_ = 0;
    //public int countNonStatic_ = 0;
    //public static int idStatic_ = 0;
    private int idNonStatic_ = 0;

    public Warzywo (String name, Float price, Integer count, String dataWaznosci)
    {
        this.name = name;
        this.price = price;
        this.count = count;
        this.dataWaznosci = new DataWaznosci(dataWaznosci);
        countStatic_++;
        idNonStatic_ = countStatic_;
        System.out.println("Utworzono pomyslnie.");
    }

    public Warzywo (Warzywo warzywo) {
        this.name = warzywo.name;
        this.price = warzywo.price;
        this.count = warzywo.count;
        this.dataWaznosci = new DataWaznosci(warzywo.dataWaznosci.getDate().toString());
        countStatic_++;
        idNonStatic_ = countStatic_;
        System.out.println("Skopiowano pomyslnie.");
    }


    public Warzywo ()
    {
        this.name = "ERROR";
        this.price = -1.0f;
        this.count = -1;
        this.dataWaznosci = new DataWaznosci("1970-01-01");
        countStatic_++;
        idNonStatic_ = countStatic_;
        System.out.println("Utworzono z bledem.");

    }


    public void showFields() {
        System.out.println("Name : " + this.name);
        System.out.println("Price : " + this.price);
        System.out.println("Count : " + this.count);
        System.out.println("Date : " + this.getDataWaznosci());
        System.out.println("CountStatic : " + countStatic_);
        System.out.println("IdNonStatic : " + idNonStatic_);

    }

    public String getDataWaznosci() {

        return dataWaznosci.getDate().toString();
    }
}
