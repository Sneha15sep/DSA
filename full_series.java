public class recursion1 {  
   
    public static void printing(int num) {  
       
        if (num == 11) return;   
        System.out.print(num + " ");   
        printing(num + 1);    
    }   
        
    public static void main(String[] args) {  
        int num = 1;  
        printing(num);  
    }  
}