abstract class  A implements b {
    A(){}
    A(int a){
        System.out.println("helllo constructor of A!!");
    }

      abstract  void disp(int a);
        void display(){
            System.out.println("this is not over-ridden");
        }
    static void Do(){
        System.out.println("static do");
    }

}

      interface b{
  int a=0;
       public   void displayb();
     }

     interface e{
    int a=0;
     }
   class be implements b,e{
          public void displayb(){}
   }
     class  C extends A{
    int c;
    C(){}

         @Override
         void disp(int b) {}
         public void displayC(){
        System.out.println("this is C");
     }
    public void displayb(){}
     }
     interface  calculate{
   public void cal(int a);
     }
   class MyCalculator implements calculate {
    @Override
    public void cal(int a) {
        // provide your own implementation for the cal method
        // ...
    }
}
     class Display implements calculate{
    int x;
    public void cal(int item){
            x= item*item;
        }
     }

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    C objc = new C();
      objc.displayC();
     objc.c=100;
        System.out.println(objc.c);
      A objs  = new C();
//      objs.displayC();
   be ojj = new be();
//   ojj.a=100;



    }
}