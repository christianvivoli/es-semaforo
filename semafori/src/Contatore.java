public class Contatore {
    int valore;
    int passo;

    public Contatore(int valore,int passo) {
        this.valore=valore;
        this.passo=passo;
    }
    void incrementa(){
        valore += passo;
    }

    void decrementa(){
        valore -= passo;
    }

    int getValore(){
        return valore;
    }
}
