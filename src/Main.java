public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Book b = new Book("Буратино", "Tolstoy", 120, "Сказка про деревянного человечка");
        System.out.println(b);
        String tale = b.toString();
        b.printContent();
        b.printContent();
        talePrint(b);
        b.taleSay();
        System.out.println("tale = " + tale);
        System.out.printf("fasdkjf" + tale);
    }
    public static void talePrint(Object object) {
        System.out.println("Эта история про ");
        System.out.println(object);
    }
}