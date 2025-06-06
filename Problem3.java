// Largest prime factor of 600851475143
public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        long i = 2;
        while (i * i <= num){
            if (num % i == 0){
                num /= i;
            }
            else {
                i++;
            }
        }
        System.out.println(num);
    }
}
