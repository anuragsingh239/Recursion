import java.util.Scanner;

public class Sum_of_n_number {
    static int getSum(int num){
        if(num==0){
            return 0;
        }
        else{
            return num+getSum(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to get sum : ");
        int number=sc.nextInt();
        System.out.println(getSum(number));
    }
}
