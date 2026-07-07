public class MinMax {
    public static int minimum(int[] arr){
        int min=Integer.MAX_VALUE;
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i]<min){
                min=arr[i];
                i++;
            }
            else
                i++;
        }
        return min;
    }
    public static int maximum(int[] arr){
        int max=Integer.MIN_VALUE;
        int j=0;
        int m=arr.length;
        while(j<m){
            if(arr[j]>max){
                 max=arr[j];
                 j++;
            }
            else
                j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={20,10,37,15,22,25};
        System.out.println("Minimum element in an array is:"+minimum(arr));
        System.out.println("Maximum element in an array is:"+maximum(arr));
    }
}
