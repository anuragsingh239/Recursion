import java.util.Scanner;

public class Sum_of_digit {
    static int getNum(int num){
        if(num==0){
            return 0;
        }
        else{
            return getNum(num/10)+num%10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to get its sum : ");
        int number=sc.nextInt();
        System.out.println(getNum(number));
    }
}
