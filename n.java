public class n {  
   
    public static void printing(int num) {  
       
        if (num == 0) return;   
        System.out.print(num + " ");   
        printing(num - 1);    
    }  

    public static void main(String[] args) {  
        int num = 11;  
        printing(num);  
    }  
}