import java.util.TreeSet;

public class TreeSetDemo {

    static TreeSet<String> t1 = new TreeSet<>();

    //Reverse the collection of the set
    public TreeSet<String> reverse(){

        //create a new TreeSet to store the reversed values
        TreeSet<String> t2 = new TreeSet<>();

        //iterate the t1
        for(String n:t1)
            t2.add(n);

        return t2;
    }

    //iterate the elements of the treeset
    public void iterateTree(){

        for(String s:t1)
            System.out.println(s);

    }

    //To check if a particular element exists or not
    public String checkTree(String s){

        for(String a:t1)
            if(s==a)
                return s;

        return "not found";
    }

}
