import java.util.ArrayList;
import java.util.Random;

public class Main211 {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>();
        Random r = new Random();
        String[] names = new String[] {"Рома", "Толя", "Тимоха", "Паша", "Макс"};
        String[] surnames = new String[]{"Ржавый", "Башка", "Кабан", "Трубочист", "Терминатор"};
        int[] birthAges = new int[10];
        for (int i = 0; i < birthAges.length; i++) {
            birthAges[i] = 1990 + i;
        }
        People first = new People("Рома", "Ржавый", 1999);
        People second = new People("Толя", "Башка", 1994);
        People third = new People("Тимоха", "Кабан", 1995);
        People fourth = new People("Паша", "Трубочист", 1990);
        People fifth = new People("Макс", "Терминатор", 1998);
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        makeList(list);
        list.remove(1);
        System.out.println();
        list.set(2, new People("Акакий","Трубочист", 1989));
        System.out.println();
        makeList(list);
    }
   /* public static String giveName () {
        String[] names = new String[] {"Рома", "Толя", "Тимоха", "Паша", "Макс"};
        String[] surnames = new String[]{"Ржавый", "Башка", "Кабан", "Трубочист", "Терминатор"};
        Random r = new Random();

    }*/
    public static void makeList(ArrayList<People> list) {
        for (People chel:list)
            chel.getInfo();
    }
}
