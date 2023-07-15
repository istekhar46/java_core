class runnable implements Runnable{
      public void run() {
          int i = 0;
          while (i < 100) {
              System.out.println("this is runnable and running...");
              i++;
          }
      }

}


class firsthread extends  Thread{

    firsthread(runnable r, String name){
        super(r,name);
    }
 public void run() {
     int i = 0;
     while (i < 100) {
         System.out.println("first thread is running..");
         i++;
     }
 }
}class secondthread extends  Thread
  {
     public void run() {
       int i = 0;
       while (i < 100) {
         System.out.println("second thread is running..");
         i++;
     }
  }
}


public class Main {
    public static void main(String[] args) {
        runnable run = new runnable();
        firsthread threadA = new firsthread(run,"istekhar");
         secondthread threadB = new secondthread();
        System.out.println(threadA.getName());
        System.out.println(threadA.getId());
        Thread thread_run = new Thread(run);
         threadA.start();
         threadB.start();
        thread_run.start();


    }
}