package Question1;

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        //creating an array
        int[] arr = {1,2,3,4,5,6,7};
        Random randomNumber = new Random();
        System.out.println("Old Array Before Shuffling:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            //getting a random index value within the array length
            int randomIndex = randomNumber.nextInt(arr.length);
            // providing value into a temporary variable temp
            int temp1 = arr[randomIndex];
            //shuffling the values to get shuffled array
            arr[randomIndex] = arr[i];
            arr[i] = temp1;
        }

        System.out.println("New Array After Shuffling");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

