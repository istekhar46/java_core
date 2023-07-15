public class forloop {
    public static void main(String[] args) {
//        int i;
//        System.out.println("loop1");
//        for(i=0;i<25;i++) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }
//            System.out.println("loop2");
//        for(i=0;i<5;i++){
//            System.out.println(2*i+1);
//        }

//        int n=100;
//        int i;
//        for (i=n;i>0;i--){
//            System.out.print(i+" ");
//    }
        int i, j;
//        for(i=5;i>0;i--){
//            for(j=0;j<i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println("\n");
//        int n=3;
//        int mul=1;
//      for(i=1;i<=10;i++){
//          mul= n*i;
//          System.out.print(mul+" ");
//      }
//      int mul=1;
//      int n=10;
//      for(i=10;i>=1;i--){
//          mul= n*i;
//          System.out.print(mul+" ");
//      }
//        int fact=1;
//        int n=5;
//        for(i=1;i<n;i++){
//            fact=fact*i;
//        }
//        System.out.println("The factorial of the number is :"+
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
                for (j = 1; j <i; j++) {
                    System.out.print("* ");
                }

                System.out.print("\n");
            }
        }
}
