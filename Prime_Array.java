import java.util.Arrays;
public class PrimeArr{
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        int count=0;
          for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
          }
          return count==2;
    }
    public static void main(String[] args) {
         int arr[]={5,10,7,12,9,13,22,19,18,21};
         int arr1[]=new int[arr.length];
         int i=0;
         int j=0;
         while(i<arr.length){
              if(isPrime(arr[i])){
                arr1[j]=arr[i];
                j++;
              }
              i++;
        }
        System.out.print(Arrays.toString(arr1));  
    }
}
