import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

    //create an arrayList of Strings
    static ArrayList<String> a1 = new ArrayList<>();

    //printAll method for iterating the list
    public void printAll(){

        Iterator iter = a1.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }

}

