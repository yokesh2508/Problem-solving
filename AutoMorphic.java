public class AutoMorphic {

    public int square(int x){
        return x*x;
    }
    public boolean isAutoMorphic(int x,int y){
          while(x>0){
            int ld1=x%10;
            int ld2=y%10;
            if(!(ld1==ld2)){
                return false;
            }
            x/=10;
            y/=10; 
        }
        return true;  
    }  
     public static void main(String[] args) {
        AutoMorphic am=new AutoMorphic();
        int x=25;
        boolean ans=am.isAutoMorphic(x,am.square(x));
        if(ans==true){
            System.out.println("It is AutoMorphic Number");
        }
        else{
            System.out.println("not a Automorphic number");
        }  
     }
}
