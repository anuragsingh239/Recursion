public class Recalling {
    static void function1(int num){
        if(num==0){
            return;
        }
        else{
            System.out.println("Anurag");
            function1(num-1);
        }

    }

    public static void main(String[] args) {
        function1(11);
    }

}
