class Demo extends Thread {
    Demo(String str) {
        super(str);
    }

    public void run() {
        System.out.println("After changing the name of thread" + Thread.currentThread().getName() + " is "
                + Thread.currentThread().getPriority());
    }
}

public class Demo_extends_Thread {
    public static void main(String args[]) {
        Demo t1 = new Demo("Sachin");
        Demo t2 = new Demo("Mongya");
        Demo t3 = new Demo("Yuvraj");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The name of the Thread is " + Thread.currentThread().getPriority());
    }
}
