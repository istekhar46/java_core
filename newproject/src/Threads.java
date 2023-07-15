class first_thread extends Thread{
    first_thread(Runnable r,String name){
        super(r,name);
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("this is first thread class ");
            i++;
        }
    }
}
class second_thread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i < 50) {
            System.out.println("this is second thread class ");
            i++;
        }
    }
}

class runableIntThred1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<50){
            System.out.println("this is runable interface class 1");
           i++;
        }
    }
}
class runableIntThred2 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<50){
            System.out.println("this is runnable interface class 2");
           i++;
        }
    }
}
class ThreadConstructor1 extends Thread
{
    ThreadConstructor1(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("this is constructor class 1");
    }
}

class ThreadConstructor2 extends Thread{
    ThreadConstructor2(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("this is normal run from name constructor class 2");
    }
}
public class Threads {
    public static void main(String[] args) {
//        first_thread th1 = new first_thread();
//        second_thread th2 = new second_thread();
//
//        th1.start();
//        th2.start();

        runableIntThred1 th1 = new runableIntThred1();
        runableIntThred2 th2 = new runableIntThred2();
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();

//        ThreadConstructor1 th = new ThreadConstructor1("istekhar");
//        System.out.println("The name of the thread is "+ th.getName());
//        System.out.println("The id of the thread is "+ th.getId());
//        th.start();


//        ThreadConstructor2 th2 = new ThreadConstructor2("istekhar khan");
//        System.out.println("The name of the thread is "+ th2.getName());
//        System.out.println("The id of the thread is "+ th2.getId());
//        th2.start();
        runableIntThred2 rn = new runableIntThred2();
        first_thread th =new first_thread(rn,"istekhar");
        th.start();
        System.out.println("The Id of the runable is "+th.getId());
        System.out.println("The name of the runable is "+th.getName());




    }
}
