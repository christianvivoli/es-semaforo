public class ConsumaDato extends Thread{
    Semaforo verde;
    Semaforo rosso;
    private int leggiDato;

    public ConsumaDato(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
       while (true) {
           verde.semaforoVerde();
           leggiDato = Main.buffer;
           System.out.println("Letto il dato: " + leggiDato);
           rosso.semaforoRosso();
       }
    }
}
