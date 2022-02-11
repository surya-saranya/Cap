import java.util.ArrayList;
import java.util.Iterator;

class Employee{

    int id = 10;
    String name = "xyz";
    String Address = "hyd";
    int sal = 10000;

}

public class ArrayList4 {

    //Employee object arrayList
    static ArrayList<Object> emp = new ArrayList<>();

    //search the emp using empid
    public String search(int num){
        
        for(Object emp;;) {
            if (emp.id == num)
                return emp.name;
        
        return "not found";

    }
  }

    //object attributes
    public static void main(String[] args) {

        //create object for employee class
        Employee em = new Employee();

        //new employee em1
        Employee em1 = new Employee();

        em1.Address = "chennai";
        em1.id = 20;

        //Add em to arrayList
        emp.add(em);
        emp.add(em1);

        //To search for an employee based on id
        ArrayList4 arr = new ArrayList4();
        arr.search(20);

    }

}
