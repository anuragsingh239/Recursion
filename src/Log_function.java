//if we multiply by two to n we get 1 increment
public class Log_function {
    static int func(int n){
        if(n==1){
            return 0;
        }
        else {
            return 1+func(n/2);
        }
    }

    public static void main(String[] args) {
        func(32);
    }
}
