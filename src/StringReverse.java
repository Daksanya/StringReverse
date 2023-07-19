import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        int start=0;
        int end=str.length()-1;
        char[] charArray=str.toCharArray();

        while(start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }

        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }
}
