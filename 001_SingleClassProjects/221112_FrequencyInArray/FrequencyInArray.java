import java.util.Arrays;

public class FrequencyInArray {
    public static void main(String[] args) {
        
        // array is taken directly 
        int[] array = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencyArray = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            int frequency = 1;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                    frequencyArray[j] = 0;
                }
            }
            if (frequencyArray[i] != 0) {
                frequencyArray[i] = frequency;
            }
        }
        System.out.println("Array : " + Arrays.toString(array));//original array is printed to be examined
        System.out.println("Repeated Numbers in the Array :");
        for (int i = 0; i < 8; i++) {
            if (frequencyArray[i] != 0) {
                System.out.println("Number " + array[i] + " is repeated " + frequencyArray[i] + " times");
            }
        }
    }
}
