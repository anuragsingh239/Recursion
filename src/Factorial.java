import java.util.Scanner;

public class Factorial {
    static int func(int num){
        if(num==0||num==1){
           return 1;
        }
        else{
            return num*func(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to get factorial: ");
        int number= sc.nextInt();
        System.out.println(func(number));
    }
}
