public class index {  
    public static int[] findStartEndIndices(int[] arr, int key) {  
        int startIndex = -1;  
        int endIndex = -1;  

        for (int i = 0; i <arr.length; i++) {  
            if (arr[i] == key) {  
                if (startIndex == -1) {  
                    startIndex = i; 
                }  
                endIndex = i;   
            }  
        }  

        if (startIndex == -1) {  
            return new int[]{-1, -1}; 
        }  
        return new int[]{startIndex, endIndex};  
    }  

    public static void main(String[] args) {  
       
        int[] result1 = findStartEndIndices(new int[]{1, 2, 3, 4, 5, 5}, 5);  
        int[] result2 = findStartEndIndices(new int[]{6, 5, 4, 3, 1, 2}, 4);  
        int[] result3 = findStartEndIndices(new int[]{7, 8, 6}, 2);  

        System.out.println("Output: " + result1[0] + ", " + result1[1]); 
        System.out.println("Output: " + result2[0] + ", " + result2[1]);   
        System.out.println("Output: " + result3[0] + ", " + result3[1]);
    }  
}