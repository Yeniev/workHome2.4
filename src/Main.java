import java.sql.PreparedStatement;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 и 2");

        int[] weights = new int[]{1, 2, 3};
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
        System.out.println();
        float[] weightKg = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < weightKg.length; i++) {
            if (i == weightKg.length - 1) {
                System.out.print(weightKg[i]);
            } else {
                System.out.print(weightKg[i] + ", ");
            }
        }
        System.out.println();
        int[] height = {180, 182, 190};
        for (int i = 0; i < height.length; i++) {
            if (i == height.length - 1) {
                System.out.print(height[i]);
            } else {
                System.out.print(height[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Задание 3");

        for (int i = weights.length - 1; i >= 0; i--) {
            if (i <= weights.length)
            if (i == 0) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");

            }
        }
        System.out.println();
        for (int i = weightKg.length - 1; i >= 0; i--) {
            if (i <= weightKg.length)
                if (i == 0) {
                    System.out.print(weightKg[i]);
                } else {
                    System.out.print(weightKg[i] + ", ");
                }
        }
        System.out.println();
        for (int i = height.length - 1; i >= 0 ; i--) {
            if (i <= height.length)
                if (i == 0) {
                    System.out.print(height[i]);
                } else {
                    System.out.print(height[i] + ", ");
                }

        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 !=0) {
                weights[i] = weights[i] + 1;
            }
            if (i < weights.length - 1)
                System.out.print(weights[i] + ", ");
            else
                System.out.println(weights[i]);

        }

    }
}