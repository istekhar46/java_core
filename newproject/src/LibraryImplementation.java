import java.util.Scanner;

interface  inter{
      int a = 48;
      // we can create variables in interfaces but can not modify if because it is final ....
    // we can inherit multiple interfaces in the java just by adding one comma ...
    // variable and methods of interface is by default public ....
    // interface can be inherited only we can not create objects of interfaces
        void speed(int increment);//here methods are not public it will be made public inside the inherited class
        void brake(int increment);

}
 class exit implements inter{
    public void extra(){
        System.out.println("This is an extra method in implemented class");
    }
     @Override
     public void speed(int increment) {
         System.out.println("speed ok");
     }

     @Override
     public void brake(int increment) {
         System.out.println("brake ok");
     }
 }

 abstract class A1{
    public void some(){
        System.out.println("some");
    }
     abstract public void nothing();
   abstract  public void nothingAgain();
}

class B2 extends A{
     public void nothing(){
         System.out.println("made from abstract methods");
     };
     public void nothingAgain(){
         System.out.println("derived from abstract methods");
     }
}

class Library{
    public String []avialBooks={"c++","java","life of pi","Harry potter","Html & css","Java script"};
       public  Library(){
           System.out.println("Available books in lab is :");
        for(int i=0;i<avialBooks.length;i++){
            System.out.print(i+" "+avialBooks[i]+"\n");
        }
    }
        public void issueBook(){
            System.out.println("Enter the book no the you want to issue ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("The book "+avialBooks[n]+" is successfully issued ");

        }
//        public void addBook()
//        {
//            System.out.println("Enter the book you want to ADD ");
//            Scanner sc=new Scanner(System.in);
//            String n=sc.nextLine();
//            System.out.println("The book is added and updated list is ");
//
//        }

}
public class LibraryImplementation {
    public static void main(String[] args) {
           Library books = new Library();
           books.issueBook();
//           books.addBook();

    }
}
