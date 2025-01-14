// Online Java Compiler  
// Use this editor to write, compile and run your Java code online  

public class bubble_sort {  
    public static void main(String[] args) {  
        System.out.println("Bubble Sort");  
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  
        for (int turn = 1; turn < arr.length; turn++) {  
            for (int i = 0; i < arr.length - turn; i++) {  
                if (arr[i] > arr[i + 1]) {  
                    int temp = arr[i];  
                    arr[i] = arr[i + 1];  
                    arr[i + 1] = temp;  
                }  
            }  
        }  
        System.out.println("Sorted array: ");  
        for (int element : arr) {  
            System.out.print(element + " ");  
        }  
    }  
}