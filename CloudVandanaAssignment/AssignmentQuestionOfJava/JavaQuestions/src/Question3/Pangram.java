package Question3;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY SENTENCE");
        String sentence = sc.nextLine().toLowerCase();
        HashSet<Character> stringSet = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)>=97 && sentence.charAt(i)<=122){
                stringSet.add(sentence.charAt(i));
            }
        }
        if(stringSet.size()==26){
            System.out.println("IT IS A PANGRAM");
        }
        else {
            System.out.println("IT IS NOT A PANGRAM");
        }

        sc.close();
    }
}

