import java.util.Scanner;

public class TowerOfHanoi {
    static void TOH(int num,char A,char B,char C){
        if(num==1){
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        TOH(num-1,A,C,B);
        System.out.println("Move "+num+" from "+A+" to "+C);
        TOH(num-1,B,A,C);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        TOH(number,'A','B','C');
    }
}
