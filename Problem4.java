// largest palindromic product of 3 digit numbers
public class Problem4 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 999; i >= 100; i--){                        // idea is to iterate in reverse for early exit
            int jStart = (i % 11 == 0) ? 999 : 990;              // as every 6 digit palindrome is divisible by 11 we check to skip steps
            int jStep = (i % 11 == 0) ? 1 : 11;
            for (int j = jStart; j >= 100; j -= jStep){
                int product = i * j;
                if (product <= max) break;
                if (isPalindrome(product)){
                    max = Math.max(max, product);
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int num){
        int pal = 0, a = num;
        while (num > 0){
            pal = pal * 10 + num % 10;
            num = num / 10;
        }
        return a == pal;
    }
}