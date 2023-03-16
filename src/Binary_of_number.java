import java.util.Scanner;

public class Binary_of_number {
    static void func(int num){
        if(num==0){
            return;
        }
        else{
            func(num/2);
            System.out.print(num%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to get its Binary: ");
        int number=sc.nextInt();
        func(number);
    }
}
