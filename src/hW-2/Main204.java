import java.util.Random;

public class Main204 {
    public static void main(String[] args) {
        int[]nums1 = new int[5];
        int[]nums2 = new int[5];
        int medium1 = 0;
        int medium2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = new Random().nextInt(0, 6);
            nums2[i] = new Random().nextInt(0, 6);
            medium1 += nums1[i];
            medium2 += nums2[i];
        }
        medium1 /= nums1.length;
        medium2 /= nums2.length;
        if (medium1 > medium2) {
            System.out.println("Среднее арифметическое первого массива оказалось больше, "+medium1);

        }
        else if (medium2 > medium1) {
            System.out.println("Среднее арифметическое второго массива оказалось больше, "+medium2);
        }
        else {
            System.out.println("Средние арифметические обоих массивов равны, "+medium1);
        }

    }
}
