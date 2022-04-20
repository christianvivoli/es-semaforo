public class Main {
    public static int buffer;

    public static void main(String[] args) throws Exception {
        Semaforo rosso = new Semaforo(0);
        Semaforo verde = new Semaforo(1);
        ProduciDato c = new ProduciDato(verde , rosso);
        ConsumaDato e = new ConsumaDato(verde , rosso);
        c.start();
        e.start();
        System.out.println("Termine avvio thread");
    }

}
