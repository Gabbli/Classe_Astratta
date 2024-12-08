package Classi_Astratte;

public class Triangolo extends Forma{
    private double base;
    private double altezza;
    private double somma;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        somma = (base * altezza)/2;
        return somma;
    }
}
