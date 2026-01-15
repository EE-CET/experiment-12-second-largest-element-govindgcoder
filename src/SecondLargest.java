import java.util.Scanner;

public class SecondLargest {

        // TODO: Read N
        // TODO: Read array elements
        // TODO: Find and print the second largest element
        // Hint: You can do this in a single pass or two passes without sorting.
        // 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int firstMax=arr[0];
        int secondMax=Integer.MIN_VALUE;
        for(int j=1;j<N;j++){
            if(arr[j]>firstMax) {
                secondMax=firstMax;
                firstMax=arr[j];
            }
            // check if the number is below firstMax and greater than secondMax
            if (arr[j] > secondMax && arr[j] <= firstMax) {
               secondMax=arr[j];
            }
        }
        System.out.print(secondMax);
    }

}
