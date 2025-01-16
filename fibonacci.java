public class fibonacci{
  public static int fibo(int num){
    if (num==0 || num==1) return num;
     return fibo(num-1)+fibo(num-2);
 }
 
     public static void main(String[] args){
        int num = 6;
        System.out.println(fibo(num));
     }
}
