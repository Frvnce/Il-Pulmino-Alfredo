package util;

import java.util.ArrayList;
import java.util.Scanner;

public class stampaMessaggi {
    public static String gioco = "[Gioco]: ";
    private Scanner sc = new Scanner(System.in);
    
    public void introduzione(){
        System.out.println("\n\n\n"+gioco+"Benvenuto nel gioco del pulmino ALFREDO." +
                "\nQuesto giochino ha il solo scopo di ammazzare la noia durante le lezioni universitarie!" +
                "\nInizia scegliendo il numero di giocatori che hanno voglia di partecipare: " +
                "\n[Inserisci numero persone] ");
    }

    public ArrayList<String> sceltaNomiGiocatori(int numeroGiocatori){
        ArrayList<String> listaGiocatori = new ArrayList<>();

        System.out.println("\n\n"+gioco+"Bene, siete "+numeroGiocatori+", è il momento di scegliere i nomi:");

        for (int i = 0; i < numeroGiocatori; i++) {
            System.out.println(gioco+"Giocatore "+(i+1)+", scegli il tuo nome: ");
            listaGiocatori.add(sc.nextLine());
            System.out.println(gioco+"Benissimo, buon divertimento "+listaGiocatori.get(i)+"!");
        }

        return listaGiocatori;
    }

    public void sceltaPulmino(int numeroGiocatori, ArrayList<String> listaGiocatori){
        System.out.println("\n\n"+gioco+"E' il momento di selezionare i pulmini da guidare!\n" +
                "Di seguito troverai la lista di pulman che puoi selezionare. \nIniziera' a scegliere" +
                "il primo giocatore.");

        for (int i = 0; i < numeroGiocatori; i++) {
            System.out.println(gioco+"Giocatore "+(i+1)+", scegli il tuo pulmino: \n" +
                    "[1] Pulmino \"ALFREDO\"\n \tCaratteristiche: [VITA]: 120| [CORAZZA]: 50| [VELOCITA]: 70| [PESO]: 100| [FORZA]: 15.\n" +
                    "[2] Navetta \"OSSAS\"\n \tCaratteristiche: [VITA]: 160| [CORAZZA]: 40| [VELOCITA]: 65| [PESO]: 150| [FORZA]: 20.\n" +
                    "[3] Filo-Bus \"DRAKE\"\n \tCaratteristiche: [VITA]: 200| [CORAZZA]: 80| [VELOCITA]: 45| [PESO]: 200| [FORZA]: 25.\n" +
                    "[4] Pullman \"PONTOS\"\n \tCaratteristiche: [VITA]: 100| [CORAZZA]: 20| [VELOCITA]: 90| [PESO]: 80| [FORZA]: 5.\n");

        }
    }
}
