public class Semaforo  extends Thread{
    int valore;

    public Semaforo(int luce){
        this.valore = luce;
    }

    synchronized public void semaforoRosso(){
        while (valore == 0) {
            try {
                wait();
            } catch (Exception e) {}
        }
        valore--;
    }

    synchronized public void semaforoVerde(){
       valore++;
       notify();
    }

}
