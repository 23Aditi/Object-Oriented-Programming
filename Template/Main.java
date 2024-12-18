import java.util.*;


class Main{
    
    public static void main(String[] args) {
        Template<Integer> intTemplate = new Template<>();
        Template<Float> floatTemplate = new Template<>();
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<>();
        intList.add(32);
        intList.add(454);
        intList.add(44);
        floatList.add(11.4f);
        floatList.add(45.67f);

         // Calling methods for Integer list
        System.out.println("Even numbers count in Integer list: " + intTemplate.countEven(intList));
        System.out.println("Odd numbers count in Integer list: " + intTemplate.countOdd(intList));
        System.out.println("Palindrome numbers in Integer list: ");
        ArrayList<Integer> palindromeInt = intTemplate.isPalindrome(intList);
        intTemplate.display(palindromeInt);
        System.out.println();
        
        // Calling methods for Float list
        System.out.println("Even numbers count in Float list: " + floatTemplate.countEven(floatList));
        System.out.println("Odd numbers count in Float list: " + floatTemplate.countOdd(floatList));
        System.out.println("Palindrome numbers in Float list: ");
        ArrayList<Float> palindromeFloat = floatTemplate.isPalindrome(floatList);
        floatTemplate.display(palindromeFloat);
    }
}