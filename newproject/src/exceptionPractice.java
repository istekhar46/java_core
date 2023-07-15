import java.util.Scanner;

class NegativeRadius extends Exception{
   public String toString(){
       return super.toString()+"This is first exception";
   }
   public void printStackTree(){
       System.out.println(super.getMessage()+"this is invalid radius");
   }
   public String getMessage(){
     return    "this is invalid radius";
   }

}

class AreaOfCircle {
    public double area (int r) throws NegativeRadius{
        if(r<0)
         throw new NegativeRadius();
        return  Math.PI*r*r;
    }
}
public class exceptionPractice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[3];
//        arr[0] = 232;
//        arr[1] = 24;
//        arr[2] = 34;
//        int i = 0;
//        boolean flag = true;
//        while (flag && i < 5)
//        {
//            try {
//                int index;
//                System.out.println("Enter the index of the array");
//                index = sc.nextInt();
//                System.out.println("The value at index " + index + " is " + arr[index]);
//                break;
//            } catch (Exception e) {
//                i++;
//                System.out.println("invalid index");
//
//            }
//        }
//        if (i > 4)
//            System.out.println("maximum try exceeded");

        AreaOfCircle ar =new AreaOfCircle();
        System.out.println("Enter the Radius");
        int r=sc.nextInt();

        try {
                System.out.println( ar.area(r));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}



