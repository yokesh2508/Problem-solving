public class AddMulofArr {
    public static int addition(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int multiply(int[] arr){
        int mul=1;
        for(int i=0;i<arr.length;i++){
            mul*=arr[i];
        }
        return mul;
    }
        
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("Addition of all array elements:"+addition(arr));
        System.out.println("Multiplication of all array elements:"+multiply(arr));
    }
}
