import java.util.Scanner;

public class Palindrome_string {
    static boolean checkPalindrome(String str,int start,int end){
        if(start==end){
            return true;
        }
        if((str.charAt(start))!=str.charAt(end)){
            return false;
        }
        if(start<end+1){
            return checkPalindrome(str,start+1,end-1);
        }return true;
    }
    static boolean isPalindrome(String str){
        int n=str.length()-1;
        if(n==0){
            return true;
        }
        else{
            return checkPalindrome(str,0,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String strr=sc.nextLine();
        if(isPalindrome(strr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
