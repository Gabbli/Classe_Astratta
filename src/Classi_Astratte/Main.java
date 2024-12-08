package Classi_Astratte;
/*
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma
ed implementano il metodo per il calcolo dell'area in maniera specifica.
 */
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(7.2,3.7);
        Triangolo triangolo = new Triangolo(7.2,3.7);

        System.out.println("L'area del Rettangolo è: "+ rettangolo.calcolaArea());
        System.out.println("L'area del Triangolo è: "+ triangolo.calcolaArea());

    }
}
