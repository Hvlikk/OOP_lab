import java.util.Arrays;
import java.util.ArrayList;

public class Sklep {
    public static void main(String[] args) {

        Warzywo itemBlad = new Warzywo();
        /*
        Utworzono z bledem.
        Name : ERROR
        Price : -1.0
        Count : -1
        Date : 1970-01-01
        CountStatic : 7
        IdNonStatic : 1
        */

        Warzywo itemPomidor = new Warzywo("Pomidor", 4.51f, 10, "2023-03-14");
        /*
        Utworzono pomyslnie
        Name : Pomidor
        Price : 4.51
        Count : 10
        Date : 2023-03-14
        CountStatic : 7
        IdNonStatic : 2
        */
        Warzywo itemPomidorGalazka = new Warzywo(itemPomidor);
        /*
        Name : Pomidor
        Price : 4.51
        Count : 10
        Date : 2023-03-14
        CountStatic : 7
        IdNonStatic : 3
        */


        Warzywo []tab = new Warzywo[3];
        Arrays.fill(tab, new Warzywo());

        ArrayList<Warzywo> list = new ArrayList<Warzywo>();
        list.add(new Warzywo("Pomidor1", 4.51f, 10, "2023-03-14"));
        list.add(new Warzywo("Pomidor2", 4.52f, 10, "2023-03-14"));
        list.add(new Warzywo("Pomidor3", 4.53f, 10, "2023-03-14"));

        itemBlad.showFields();
        itemPomidor.showFields();
        itemPomidorGalazka.showFields();

        for (int i = 0; i < tab.length; i++)
        {
            tab[i].showFields();
        }
        /*
         Name : ERROR
        Price : -1.0
        Count : -1
        Date : 1970-01-01
        CountStatic : 7
        IdNonStatic : 4
        Name : ERROR
        Price : -1.0
        Count : -1
        Date : 1970-01-01
        CountStatic : 7
        IdNonStatic : 4
        Name : ERROR
        Price : -1.0
        Count : -1
        Date : 1970-01-01
        CountStatic : 7
        IdNonStatic :  4
        */





        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).showFields();
        }
        /*
        Name : Pomidor1
        Price : 4.51
        Count : 10
        Date : 2023-03-14
        CountStatic : 7
        IdNonStatic : 5
        Name : Pomidor2
        Price : 4.52
        Count : 10
        Date : 2023-03-14
        CountStatic : 7
        IdNonStatic : 6
        Name : Pomidor3
        Price : 4.53
        Count : 10
        Date : 2023-03-14
        CountStatic : 7
        IdNonStatic : 7*/

    }
}
