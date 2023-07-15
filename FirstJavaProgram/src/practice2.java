import java.util.Scanner;

  class Rectangle {
    private   int length;
     private int breadth;
      Scanner sc = new Scanner(System.in);

      public void setdata() {
          System.out.println("Enter the length of rectangle");
          length = sc.nextInt();
          System.out.println("Enter the breadth of rectangle");
          breadth = sc.nextInt();
      }

      public int AreaOfRectangle() {
          System.out.print("The Area of Rectangle is : ");
          int ar = length * breadth;
          return ar;
      }

      public int PariMeter(){
          System.out.print("The Parimeter of Rectangle is : ");
          int pari=2*(length+breadth);
          return pari;
      }
  }
public class practice2 {
    public static void main(String[] args) {
       Rectangle Rec = new Rectangle();
       Rec.setdata();
       System.out.println(Rec.AreaOfRectangle());
       System.out.println(Rec.PariMeter());
    }
}
