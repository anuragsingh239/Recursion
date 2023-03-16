public class Function_calling {
    static void func1(){
        System.out.println("function1");
    }
    static void func2(){
        System.out.println("before func1");
        func1();
        System.out.println("after function");
    }

    public static void main(String[] args) {
        System.out.println("ANurag");
        func2();
        System.out.println("function end");
    }
}
