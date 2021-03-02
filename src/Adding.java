import java.util.HashSet;

public class Adding {
    public static void main(String[] args) {
        int[] arr={4,0,-2,-6,10,6};
        int sum=4;
        getPairsCount(arr,sum);

    }

    private static void getPairsCount(int[] arr, int sum) {
        int count=0;
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if((arr[i]+arr[j])==sum)
            count++;
                System.out.println("adding pair of digits is"+count);
}
}