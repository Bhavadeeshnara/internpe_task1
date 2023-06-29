//Task 4: Find a single duplicate in an array of integers
import java.util.Scanner;
public class task1_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0;i<7;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {  
                for(int j = i + 1; j < arr.length; j++) {  
                    if(arr[i] == arr[j])  
                        System.out.println(arr[j]);  
                }  
            }
    }
}
