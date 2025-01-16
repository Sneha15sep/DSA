public class selection_sort {  

    public static void main(String[] args) {  
        int[] arr = {4, 5, 3, 1, 2};  
        selectionSort(arr);  
        System.out.println("Sorted array: ");  
        printArray(arr); 
    }  

    public static void selectionSort(int[] arr) {   
        int n = arr.length;  
        for (int i = 0; i < n - 1; i++) {  
            int idx = i;  
            for (int j = i + 1; j < n; j++) {  
                if (arr[j] < arr[idx]) {  
                    idx = j;  
                }  
            }  
            
            int temp = arr[i];  
            arr[i] = arr[idx];  
            arr[idx] = temp;  
        }  
    }  

      
    public static void printArray(int[] arr) {  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
        System.out.println();   
    }  
}