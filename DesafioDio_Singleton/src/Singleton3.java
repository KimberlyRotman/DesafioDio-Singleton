public class Singleton3 {

    private static class Holder{
    public static Singleton3 instancia = new Singleton3();
    }

    private Singleton3(){
        super();
    }

    public static Singleton3 getInstancia(){
        return Holder.instancia;
    }
}