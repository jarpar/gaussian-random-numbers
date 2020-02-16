import java.util.Random;
import java.util.Scanner;

public class GaussianRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        int count = 0;
        double gaussianNumber = 0D;
        Random random = new Random(k);
        while (count <= n) {
            if (count == n) {
                break;
            }
            gaussianNumber = random.nextGaussian();
            if (gaussianNumber <= m) {
                count++;
            } else {
                k++;
                count = 0;
                random.setSeed(k);
            }
        }
        System.out.println(k);
    }
}