import java.util.*;

public class Tour_Halicki {

    public Map<String, String> countries_cities = new HashMap<>();
    public List<String> miasta = new ArrayList<>();
    public Set<String> unikaty = new HashSet<>();

    public Tour_Halicki() {
        countries_cities.put("Polska", "Warszawa");
        countries_cities.put("Irlandia", "Dublin");
        countries_cities.put("Hiszpania", "Lizbona");
        countries_cities.put("Dania", "Kopenhaga");
        countries_cities.put("Francja", "Paryz");
        countries_cities.put("Wlochy", "Rzym");

        miasta.add("Warszawa");
        miasta.add("Warszawa");
        miasta.add("Warszawa");
        miasta.add("Kopenhaga");
        miasta.add("Kopenhaga");
        miasta.add("Lizbona");
        miasta.add("Lizbona");
        miasta.add("Rzym");
        miasta.add("Paryz");

        unikaty.addAll(miasta);
    }

    public void print_countries_cities(){

        boolean sweden = countries_cities.containsKey("Szwecja");

        for(Map.Entry<String, String> entry : countries_cities.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());


        System.out.println("Czy kolekcja zawiera Szwecje?" + sweden);

        System.out.println(countries_cities.size());
    }

    public void print_cities(){
        for (String miasta : miasta)
            System.out.println(miasta);

        boolean Paryz = miasta.contains("Paryz");

        System.out.println("Czy kolekcja zawiera Paryz?" + Paryz);

        System.out.println(miasta.size());
    }

    public void print_unique_cities() {

        for (String miasta : unikaty)
            System.out.println(miasta);

        boolean Rzym = unikaty.contains("Rzym");

        System.out.println("Czy kolekcja zawiera Rzym?" + Rzym);

        System.out.print(unikaty.size());

    }

    public static void main(String[] args) {
        Tour_Halicki tour = new Tour_Halicki();

        tour.print_countries_cities();
        tour.print_cities();
        tour.print_unique_cities();
    }

}
