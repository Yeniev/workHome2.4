import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        //Task 1
     //   int[] weights = new int[] {1, 2, 3};
     //   float[] weightKg = {1.57f, 7.654f, 9.986f};
     //   int[] height = {180, 182, 190};

        //Task 2,3,4

        int[] weights = new int[] { 10, 20, 30 };

        for (int i = weights.length - 1; i >= 0; i--) {
            if (i <= weights.length)
                if (i == 0) {
                    System.out.println(weights[i]);
                    break;
                }
                System.out.print(weights[i] + ", ");
        }


        System.out.println("\n");

        float[] weightKg = {1.57f, 7.654f, 9.986f};
        for (int i = weightKg.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weightKg[i]);
                break;
            }
            System.out.print(weightKg[i] + ", ");
        }
        System.out.println("\n");

        int[] height = {180, 182, 190};
        for (int i = height.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(height[i]);
                break;
            }
            System.out.print(height[i] + ", ");
        }







    }
}