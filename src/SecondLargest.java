import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int j=0;j<N;j++){
            if(arr[j] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[j];
            } else if(arr[j] > secondMax && arr[j] <= firstMax) {
                secondMax = arr[j];
            }
        }
        System.out.println(secondMax);
    }

}
