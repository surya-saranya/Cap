package threads;

class One implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=1;i<=20;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Two implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Asgtwo {
    public static void main(String[] args) {
        One o1 = new One();
        Thread t1 = new Thread(o1);
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Two t = new Two();
        Thread t2 = new Thread(t);
        t2.start();
    }
}

