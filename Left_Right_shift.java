import java.util.Arrays;
public class LeftRightShift{
    public static int[] leftShift(int[] a){
        int  temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];    
        }
        a[a.length-1]=temp;
        return a;
    }
    public static int[] rightShift(int[] b){
        int temp=b[b.length-1];
        for(int j=b.length-2;j>=0;j--){
            b[j+1]=b[j];
        }
        b[0]=temp;
        return b;

    }
    public static void main(String[] args) {
        int arr1[]={10,20,30,40};
        int arr2[]={10,20,30,40};

        System.out.println("Left Shifting the array element by one position"+Arrays.toString(leftShift(arr1)));
        System.out.println("Right Shifting the array element by one position"+Arrays.toString(rightShift(arr2))); 
    }
}
