import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

    static HashMap<String,String> M1 = new HashMap<>();
    static HashMap<String,String> M2 = new HashMap<>();

    public void CreateMap(){

        Iterator iter2 = M1.entrySet().iterator();
        while (iter2.hasNext()){
            Map.Entry mp = (Map.Entry)iter2.next();
            M2.put((String) mp.getValue(),(String) mp.getKey());
        }

        System.out.println("The elements in M2 are"+M2.entrySet());
    }

    public String getCapital(String CountryName){

        return M1.get(CountryName);

    }

    public String getCountry(String CapitalName){

        String temp = "";

        //System.out.println("Retrieving the elements in the hashmap");

        //System.out.println(M1.entrySet()); //The output of .entrySet() is it gives the key and the value => [abc=xyz, Japan=Tokyo, India=Delhi]

        Iterator iter1 = M1.entrySet().iterator();

        while(iter1.hasNext()){
            Map.Entry mp = (Map.Entry)iter1.next();

            if(mp.getValue()==CapitalName) {
                temp = (String) mp.getKey();
                break;
            }


        }

        return temp;

    }

    public void saveCountryCapital(String CountryName, String Capital){

        M1.put(CountryName,Capital);


    }

    public static void main(String[] args){

        M1.put("India","Delhi");
        M1.put("Japan","Tokyo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country you want to add: ");
        String CountryName = sc.nextLine();
        System.out.println("Enter the capital of the country");
        String Capital = sc.nextLine();

        CountryMap m1 = new CountryMap();
        m1.saveCountryCapital(CountryName,Capital);

        Iterator iter = M1.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(M1.get(iter.next()));
        }

        System.out.println("The capital of India is: "+m1.getCapital("India"));
        System.out.println("The country whose capital is Delhi is: "+m1.getCountry("Delhi"));

        m1.CreateMap();

    }

}
