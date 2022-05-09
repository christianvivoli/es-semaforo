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
           if(leggiDato !=8){
            verde.semaforoVerde();verde.semaforoVerde();
            leggiDato = Main.buffer;
            System.out.println("Letto il dato: " + leggiDato);
            rosso.semaforoRosso();
           }
           if(leggiDato ==8 ){
               //primo punto 
            verde.semaforoVerde();
            System.out.println("terminato la lettura");
            rosso.semaforoRosso();
           }
       }
       
    }
}
