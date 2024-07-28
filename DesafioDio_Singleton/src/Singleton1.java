public class Singleton1 {
    private static Singleton1 instancia;

    private Singleton1(){
        super();
    }

    public static Singleton1 getInstancia(){
        if(instancia  == null){
            instancia = new Singleton1();
        }
        return instancia;
    }
}
