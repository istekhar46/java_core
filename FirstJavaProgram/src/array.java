public class array {
    public static void main(String[] args) {
//        int [] arr;
//        arr=new int [3];
//        arr[0]=11;
//        arr[1]=111;
//        arr[2]=1111;

//        System.out.println(arr[1]);
//
//        int []arr1={1,2,3,4,5};
//       for(int i=0;i<5;i++){
//        System.out.print(arr1[i]+" ");
//            }
        int i, j;
        int[][] arr3 = {{2, 1, 3}, {5, 4, 3}, {1, 4, 3}};
        String [][] str={{"ik","fnr","00"},{"ihfed","fukk","oo"}};
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
