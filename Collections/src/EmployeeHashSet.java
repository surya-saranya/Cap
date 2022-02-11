import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashSet {

    static HashSet<String> h1 = new HashSet<>();

    public static void main(String[] args) {

        //String employeName = "";

        //Scanner to scan the employees
        Scanner sc = new Scanner(System.in);

        //Enter the number of employees
        System.out.println("Enter the number of Employees");
        int n = sc.nextInt();

        //Enter the names of the employees in a single line with spaces
        System.out.println("Enter the employee names: ");
        for(int i=0;i<n;i++)
            h1.add(sc.next());

        //retrieve the elements
        for(String employee:h1){
            System.out.println(employee);
        }
    }

}
