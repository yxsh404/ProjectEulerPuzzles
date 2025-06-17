// smallest number evenly divisible by 1 to 20
public class Problem5 {
    public static void main(String[] args) {
        int res = 1;
        for (int i = 2; i <= 20; i++){
            res = lcm(res, i);
        }
        System.out.println(res);
    }

    static int gcd (int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm (int a, int b){
        return a * (b / gcd(a, b));
    }
}
