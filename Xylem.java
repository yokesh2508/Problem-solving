public class Xylem {
    public static void main(String[] args) {
        int n=12327;
        int ld=n%10;
        int sum=0;
        n=n/10;
        while(n>9){
            int ls=n%10;
            sum=sum+ls;
            n=n/10;
        }
        int sum2=n+ld;
        if(sum==sum2){
            System.out.println("It is a XYLEM number");
        }
        else{
            System.out.println("Not a Xylem, It is a Phloem number");
        }
    }
}
