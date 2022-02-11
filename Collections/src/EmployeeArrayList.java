import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeArrayList {

    //Create an arraylist of type strings
    static ArrayList<String> emp = new ArrayList<>();
    static TreeSet<String> empid = new TreeSet<>();

    public static void main(String[] args) {

        //Scanner for inputing
        Scanner sc = new Scanner(System.in);

        //Enter the number of employees
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        //Enter the employees
        for(int i=0;i<n;i++)
            emp.add(sc.next());

        //Enter the employee ids
        for(int i=0;i<n;i++)
            empid.add(sc.next());

        //Iterate the TreeSet
        for(String i:empid)
            System.out.println(i);

        //Iterate the arrayList
        for(String i:emp)
            System.out.println(i);


    }

}
