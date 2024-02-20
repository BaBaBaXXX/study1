import java.util.Random;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Random r = new Random();
        int value = r.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        String scan = new Scanner(System.in).nextLine();
        switch (Integer.parseInt(scan)) {
            case 1:
                blink(value);
                break;
            case 2:
                isFirstLampOn(value);
                break;
            case 3:
                run(value,(int)(Math.random()*2+1));
                break;
            case 4:
                lightsStatus(value);
                break;
        }
    }
    public static void blink(int value) {
        System.out.println("Миг миг");
        for (int i = 0; i < 10; i++) {
            value = ~value;
            System.out.print("Гирлянда ");
            compilator(value);
            System.out.print(Integer.toBinaryString(value) + "\n");
        }
    }
    public static void run(int value, int direction) {
        System.out.println("Бегущая строка");
        for (int i = 0; i < 10; i++) {
            int line = value;
            for (int j = 0; j < 32; j++) {
                switch (direction) {
                    case 1:
                        line = (line<<1);
                        compilator(line);
                        System.out.print(Integer.toBinaryString(line)+"\n");
                        break;
                    case 2:
                        line = (line>>1);
                        compilator(line);
                        System.out.print(Integer.toBinaryString(line)+"\n");
                        break;
                }
            }
            System.out.println("");
        }
    }

    public static void isFirstLampOn(int value) {
        if ((value & 2147483648L) == 2147483648L) {
            System.out.println("Первая ламочка включена");
        }
        else {
            System.out.println("Первая лампочка выключена");
        }
    }

    public static void lightsStatus (int lights) {
        System.out.println("Вид гирлянды");
        String str = Integer.toBinaryString(lights);
        for (int i = 0; i < 32-str.length() ; i++) {
            System.out.print("0");
        }
        System.out.println(str + "\n" );
    }
    public static void compilator (int value) {
        String str = Integer.toBinaryString(value);
        for (int i = 0; i < 32-str.length() ; i++) {
            System.out.print("0");
        }
    }
}

//    public static void main(String[] args) {
//        long value = (long)(Math.random()*2147483648L)+1;
//    //Число 2147483648L выбрано потому, что в двоичном коде оно будет состоять из 32 чисел (100...0)
//        String scan = new Scanner(System.in).nextLine();
//        switch (Integer.parseInt(scan)) {
//            case 1:
//                blink(value);
//                break;
//            case 2:
//                isFirstLampOn(value);
//                break;
//            case 3:
//                value = run(value,(int)(Math.random()*2+1),(int)(Math.random()*10));
//                break;
//            case 4:
//                lightsStatus(value);
//                break;
//        }
//    }
//    public static long blink(long value) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2; j++) {
//                value = ~value;
//            }
//        }
//        return value;
//    }
//    public static long run(long value, int direction, int count) {
//        for (int i = 0; i < 10; i++) {
//            switch (direction) {
//                case 1:
//                    value = (value<<count);
//                    break;
//                case 2:
//                    value = (value>>count);
//                    break;
//            }
//        }
//        return value;
//    }
//
//    //Первая лампа включена (=1 в двоичном коде) только в случае соответствия (&) с числом 2147483648L
//    public static boolean isFirstLampOn(long value) {
//        if ((value&2147483648L) == 2147483648L) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    //Показывает состояние гирлянды, даже если двоичный long будет длиннее 32 символов
//    public static void lightsStatus (long lights) {
//        String str = Long.toBinaryString(lights);
//        for (int i = 0; i < 32-str.length() ; i++) {
//            System.out.print("0");
//        }
//        System.out.println(str.substring(Math.max(0, str.length() - 32)));
//    }