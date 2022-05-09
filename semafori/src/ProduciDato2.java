public class ProduciDato2 extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int elementi = 5;
    final int attesa = 500;

    Contatore c=new Contatore(0, 1); //secondo punto

    public ProduciDato2(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
        for (int i = 0; i < elementi; i++) {
            rosso.semaforoVerde();
            Main.buffer = c.getValore();
            System.out.println("creato il dato " + i);
            c.incrementa();
            verde.semaforoRosso();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {}
        }
        System.out.println("Terminata l'uscita dati");
        rosso.semaforoVerde();
        Main.buffer=8;
        verde.semaforoRosso();
        
    }
}
