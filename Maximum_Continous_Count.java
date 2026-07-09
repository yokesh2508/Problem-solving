public class MaxContCount {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,0,1,1,1,0};
        int count=0;
        int MaxCount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==1){ 
                count++;
                MaxCount=Math.max(MaxCount, count);
             }
             else{
                count=0;
             }
        }
        System.out.print(MaxCount);
    }
}
