public class Main212 {
    public static void main(String[] args) {
        try {
            test();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("АШИБКА");
        }finally {
            System.out.println("БУБА");
        }
    }

    public static void test() throws Exception {
        throw new Exception();
    }
}
