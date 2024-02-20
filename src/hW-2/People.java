public class People {
    String name;
    String surname;
    int yearOfBirth;
    public People (String a, String b, int c) {
        this.name = a;
        this.surname = b;
        this.yearOfBirth = c;
    }
    public void getInfo () {
        System.out.println("Имя: " + name + " " + surname + "; Год рождения: "+yearOfBirth);
    }

}
