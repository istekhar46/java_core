
    class A
    {
        int a;
        void display()
        {
            System.out.println(a);
        }
    }
    class B extends A
    {

    }
    public class crcPractice
    {

        public static void main(String[] args) {
            B obj = new B();
            obj.a=10;  // Line-1
            obj.display(); //Line-2
        }
    }


