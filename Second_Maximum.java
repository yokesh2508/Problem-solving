public class SecondMaximum{
    public static void main(String[] args) {
        int arr[]={2,1,8,7,3,4,9,1};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        System.out.println("Second Maximum element in an array:"+secondMax);
    }
}
