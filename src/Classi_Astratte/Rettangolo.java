package Classi_Astratte;

public class Rettangolo extends Forma{
    private double lunghezza;
    private double altezza;
    private double somma;

    public Rettangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        somma = lunghezza * altezza;
        return somma;
    }
}
