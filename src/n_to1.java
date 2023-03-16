import java.util.Scanner;

public class n_to1 {
    static void func(int num){
        if(num==0){
            return;
        }
        else{
            System.out.println(num);
            func(num-1);
//            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int number=sc.nextInt();
        func(number);
    }
}
