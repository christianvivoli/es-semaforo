public class Main {
    public static int buffer;

    public static void main(String[] args) throws Exception {
        Semaforo rosso = new Semaforo(0);
        Semaforo verde = new Semaforo(1);
        ProduciDato c = new ProduciDato(verde , rosso);
        ProduciDato2 c2 =new ProduciDato2(verde, rosso);
        ConsumaDato e = new ConsumaDato(verde , rosso);
        c.start();
        c2.start();
        e.start();
        System.out.println("Main:termine avvio thread.");
    }

}
