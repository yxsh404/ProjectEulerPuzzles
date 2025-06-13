// difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
public class Problem6 {
    static final int num = 100;
    public static void main(String[] args) {
        int squareOfSum = ((num * (num + 1)) / 2) * ((num * (num + 1)) / 2);
        int sumOfSquare = ((num * (num + 1) * (2 * num + 1)) / 6);
        System.out.println(squareOfSum - sumOfSquare);
    }
}
