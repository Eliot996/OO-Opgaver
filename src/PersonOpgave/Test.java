package PersonOpgave;

public class Test {
    public static void main(String[] args) {
        Person güler = new Person("Güler", 22);

        // print with getters
        System.out.println(güler.getName());
        System.out.println(güler.getAge());
        System.out.println();

        // use has birthday, and print güler
        güler.hasBirthday();
        System.out.println(güler);
    }
}
