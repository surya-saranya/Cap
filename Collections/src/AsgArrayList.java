import java.util.ArrayList;
import java.util.Scanner;

public class AsgArrayList {

    //We declare a1 as static so that it can be used through out the program
    static ArrayList<Integer> a1;
    static ArrayList<Integer> a2;

    //create a method named saveEvenNumbers(int N)
    public ArrayList<Integer> saveEvenNumbers(int N){

        //since we need to return an ArrayList, we create an object
        ArrayList<Integer> a1 = new ArrayList<>();

        //adding the even elements to a1
        for(int i=2;i<N;i++){
            if(i%2==0)
                a1.add(i);
        }

        return a1;
    }

    //create a method named printEvenNumbers() which iterates through a1
    public ArrayList<Integer> printEvenNumbers(){

        //creating a new array list that needs to be returned
        ArrayList<Integer> a2 = new ArrayList<>();

        for(Integer a:a1) {
            System.out.print(a * 2 + ",");
            a2.add(a*2);
        }
        System.out.println();

        return a2;

    }

    //create another method printEvenNumbers(int N) where N needs to be searched
    public int printEvenNumbers(int N){

        int flag=0;
        for(Integer a:a1){
            if(a==N)
                flag=1;
        }
        if(flag==0)
            return 0;
        else
            return N;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        //create an object to call the class methods
        AsgArrayList aal = new AsgArrayList();

        //we call the method saveEvenNumbers
        a1= aal.saveEvenNumbers(n);

        //we call the method printEvenNumbers() for printing the numbers*2
        a2 = aal.printEvenNumbers();

        //Print the elements in a1
        //for(Integer a:a1)
        //    System.out.println(a);

        System.out.println("Print the element you want to search");
        int N = sc.nextInt();

        //call the printEvenNumbers(int N) to search
        System.out.println(aal.printEvenNumbers(N));


    }
}
