
import java.util.ArrayList;

public class Template<T extends Number>{
    public int countEven(ArrayList<T> list ){
        int count = 0;
        for(T num : list){
            if(num.intValue() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int countOdd(ArrayList<T> list ){
        int count = 0;
        for(T num : list){
            if(num.intValue() % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public ArrayList<T> isPalindrome(ArrayList<T> list){
        ArrayList<T> arr = new ArrayList<>();
        for(T num : list){
            String s = num.toString();
            String r = new StringBuilder(s).reverse().toString();
            if(s.equals(r)){
                arr.add(num);
            }
        }
        return  arr;
    }

    public void display(ArrayList<T> list){
        for(T num : list){
            System.out.print(num + " ");
        }
    }
}