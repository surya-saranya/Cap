package threads;

class Asone implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
            }
            Thread.sleep(5000);
            for(int i=6;i<=10;i++){
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class AsgOne{
    public static void main(String[] args) {
        Asone a1 = new Asone();
        Thread t = new Thread(a1);
        t.start();
    }
}
