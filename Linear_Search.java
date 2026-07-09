import java.util.Scanner;

public class LinearSearch{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={7,2,5,8,4,6};
        System.out.print("Enter element to be search:");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element at the index of:"+i);
            }
        }
    }
}
