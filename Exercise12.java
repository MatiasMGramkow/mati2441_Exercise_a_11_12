import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise12
{
    /*
Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.
     */

    // Laver et final, da det SKAL være 3.
    public static final int maxAntal = 3;
    public static void main(String[] args)
    {
        // laver en liste
        List<String> liste = new LinkedList<String>();

        // Laver et boolean
        boolean erSandt;

        // Tilføjer strings til listen (Den som er udkommenteret viser at programmet virker. Hvis den er med, er outputtet True, hvis ikke, er det false)
        liste.add("hej");
        liste.add("hej");
        //liste.add("hej");




        // sætter mit boolean lig med metoden
        erSandt = contains3(liste);

        // printer
        System.out.println(erSandt);


    }

    private static boolean contains3 (List<String> liste)
    {
        // laver en liste af map
        Map<String,Integer> counter = new TreeMap<String, Integer>();

        // laver en boolean variable
        boolean fundet = false;;

        // for hver gang i er 0 og i er mindre end listens størrelse, skal i plusses med 1 efter den har gjort det under
        for (int i = 0; i < liste.size() ; i++)
        {
            // ordet = listens "i"
            String ordet = liste.get(i);

            // hvis counter som holder på ordet er false, gør følgende:
            if (!counter.containsKey(ordet))
            {
                // læg "ordet og 1" til counter.
                counter.put(ordet, 1);
            }else
            {
                // count er counters ord
                int count = counter.get(ordet);
                // put ordet og count + 1 i counter
                counter.put(ordet, count + 1);
            }
        }
        // for hver o i counters keysæt gør følgende:
        for (String o : counter.keySet())
        {
            // count er lig med counterens o.
            int count = counter.get(o);
            // Hvis count er størrere end min final variable (3), gør følgende:
            if(count >= maxAntal)
            {
                // sæt mit boolean til true og break:
                fundet = true;
                break;
            }
        }
        // returner boolean fundet:
        return fundet;
    }
}
