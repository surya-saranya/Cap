import java.util.HashSet;

public class CountryHashSet {

    //instance variable h1
    HashSet<String> h1 = new HashSet<>();

    //create a method saveCountryNames(String CountryName)
    public HashSet<String> saveCountryNames(String CountryName){

        h1.add(CountryName);

        //return the new h1;
        return h1;
    }

    //create a method getCountry(String CountryName)
    public String getCountry(String CountryName){

        //iterating the hashset
        for(String country:h1)
            if(country==CountryName)
                return country;

        return "null";

    }

}
