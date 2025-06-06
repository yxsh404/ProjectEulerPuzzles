public class Problem2 {
    static final long limit = 4_000_000;
    public static void main(String[] args){
        int evenSum = 0;
        int fib1 = 1, fib2 = 2;
        while (fib1 <= limit){
            if (fib1 % 2 == 0){
                evenSum += fib1;
            }
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }
        System.out.println(evenSum);
    }
}
