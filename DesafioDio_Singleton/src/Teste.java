public class Teste {
    public static void main(String[] args) {

        Singleton1 lazy = Singleton1.getInstancia();
        System.out.println(lazy);
        lazy = Singleton1.getInstancia();
        System.out.println();

        Singleton2 fast = Singleton2.getInstancia();
        System.out.println(fast);
        fast = Singleton2.getInstancia();
        System.out.println(fast);

        Singleton3 hold = Singleton3.getInstancia();
        System.out.println(hold);
        hold = Singleton3.getInstancia();
        System.out.println();
    }
}
