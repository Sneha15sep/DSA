public class try {  
    public static int[] findStartEndIndices(int[] arr, int key) {  
        int startIndex = -1;  
        int endIndex = -1;  

        for (int i = 0; i < arr.length; i++) {  
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
}