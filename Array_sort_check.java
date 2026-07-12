public class ArrSortCheck {
    public static boolean sortCheck(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,2,4,1,8,0};
        //boolean ans=sortCheck(arr1);
        boolean ans=sortCheck(arr2);
        if(ans){
            System.out.println("Array is sorted only");
        }
        else
            System.out.println("Array is not sorted");
    }
}
