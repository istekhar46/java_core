import java.util.Scanner;
class student{
     int id;
     String name;
    public void showdetails(){
        System.out.println("the name is :"+name);
        System.out.println("the id is :"+id);
    }

}
public class practice {
    static void table(int n){
        System.out.println("Table of "+n+" is :");
        int mul=1;
        for(int i=1;i<=10;i++){
            mul= n*i;
            System.out.println(n+"x"+i+"="+mul);
        }
    }
    static int sum(int n){
        if(n<=0)
            return 0;
        else return
            n+sum(n-1);
    }
     void pattern(int n){
         System.out.println("The pattern is :");
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        student st = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number");
        int n= sc.nextInt();
        table(n);
        practice obj = new practice ();
         obj.pattern(n);
        System.out.println("The sum of fist natural number is : "+sum(n));
        st.id=100;
        st.name="istekhar";
        st.showdetails();

    }
}
