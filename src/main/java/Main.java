public class Main {

    public static int fibonacci(int num){
        return (num <= 1) ? num : fibonacci(num - 1) + fibonacci(num - 2);
    }
}
