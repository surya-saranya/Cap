package threads;

public class ThreadName extends Thread {
    public static void main(String[] args) {
        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();
        t1.setName("Scooby");
        t2.setName("Shaggy");
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("Name of t2: "+t2.getName());
    }
}
