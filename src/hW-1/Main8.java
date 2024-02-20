import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Random r = new Random();
        int value = r.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);

        blink(value);

        lightsStatus(value);
        isFirstLampOn(value);

        //1 - Сдвиг влево; 2 - Сдвиг вправо
        run(value,2);
    }
    public static void blink(int value) {
        System.out.println("Миг миг");
        System.out.println("Гирлянда "+Integer.toBinaryString(value)+"; тудасюдаГирлянда "+Integer.toBinaryString(~value));
        value = ~value;
    }
    public static void run(int value, int direction) {
        System.out.println("Бегущая строка");
        for (int i = 0; i < 32; i++) {
            switch (direction) {
                case 1:
                    value = (value<<1);
                    complilator(value);
                    System.out.print(Integer.toBinaryString(value)+"\n");
                    break;
                case 2:
                    value = (value>>1);
                    complilator(value);
                    System.out.print(Integer.toBinaryString(value)+"\n");
                    break;
            }
        }
    }

    public static void isFirstLampOn(int value) {
        if ((value & 2147483648L) == 2147483648L) {
            System.out.println("Первая ламочка включена\n");
        }
        else {
            System.out.println("Первая лампочка выключена\n");
        }
    }

    public static void lightsStatus (int lights) {
        System.out.println("Вид гирлянды");
        String str = Integer.toBinaryString(lights);
        for (int i = 0; i < 32-str.length() ; i++) {
            System.out.print("0");
        }
        System.out.println(str);
    }
    public static void complilator (int value) {
        String str = Integer.toBinaryString(value);
        for (int i = 0; i < 32-str.length() ; i++) {
            System.out.print("0");
        }
    }
}
//    public static void main(String[] args) {
//        int[] lights = new int[32];
//        for (int i = 0; i < lights.length; i++) {
//            lights[i] = (int)(Math.random()*2);
//            if (lights[i] == 0){
//                lights[i] = ~lights[i];
//            }
//            System.out.println(lights[i]);
//            System.out.println(Integer.toBinaryString(lights[i]));
//        }
//        Main8 method1 = new Main8();
//        method1.blink(lights);
//        for (int i = 0; i < lights.length; i++) {
//            System.out.println(lights[i]+ " после мига");
//        }
//    }
//    public int[] blink(int[] lights) {
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < lights.length; j++) {
//                lights[j] = ~lights[j];
//            }
//        }
//        return lights;
//    }
