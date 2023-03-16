public class Output_predict {
    static void func(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            func(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        func(3);
    }
}
