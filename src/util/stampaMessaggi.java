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

    public ArrayList<Integer> sceltaPulmino(int numeroGiocatori, ArrayList<String> listaGiocatori){
        System.out.println("\n\n"+gioco+"E' il momento di selezionare i pulmini da guidare!\n" +
                "Di seguito troverai la lista di pulman che puoi selezionare. \nIniziera' a scegliere" +
                "il primo giocatore.");
        ArrayList<Integer> listaPersonaggi = new ArrayList<>();
        for (int i = 0; i < numeroGiocatori; i++) {
            System.out.println(gioco+"Giocatore "+(i+1)+", scegli il tuo pulmino: \n" +
                    "[1] Pulmino \"ALFREDO\"\n \tCaratteristiche: [VELOCITA]: 6 | [FORTUNA] 1.\n " +
                    "[2] Navetta \"OSSAS\"\n \tCaratteristiche: [VELOCITA]: 4 | [FORTUNA] 2.\n " +
                    "[3] Filo-Bus \"DRAKE\"\n \tCaratteristiche: [VELOCITA]: 3 | [FORTUNA] 3.\n " +
                    "[4] Pullman \"PONTOS\"\n \tCaratteristiche: [VELOCITA]: 2 | [FORTUNA] 4.\n " +
                    "Scegli: ");
            listaPersonaggi.add(sc.nextInt());
            System.out.println(gioco+" Ottima scelta!\n");
        }
        return listaPersonaggi;
    }

    public static String calcoloSpazio(int distanza){
        String spazio="";
        for (int i = 0; i < distanza; i++) {
            spazio = spazio +" ";
        }
        return spazio;
    }

    public static void alfredo(String spazio){
        System.out.println("__________________________________________________________________________________________________________________________________|\n\n" +
                spazio +"            \\______________    \n" +
                spazio +"            | [][][][][][]|_\\ \n" +
                spazio +"            |     ALFREDO   |) \n" +
                spazio +"         ...=--OO-------OO--=  \n");
    }
    public static void ossas(String spazio){
        System.out.println("__________________________________________________________________________________________________________________________________|\n\n" +
                spazio +"            ___/\\_____/\\___    \n" +
                spazio +"           | [][][][][][]|_\\ \n" +
                spazio +"           |     OSSAS     |) \n" +
                spazio +"        ...=--OO-------OO--=  \n");
    }
    public static void drake(String spazio){
        System.out.println("__________________________________________________________________________________________________________________________________|\n\n" +
                spazio +"    __________________________    \n" +
                spazio +"   | [][][][][]| |[][][][][]|_\\ \n" +
                spazio +"   |     DRAKE |  |  PULLMAN  |) \n" +
                spazio +"...=--OO------------------OO--=  \n");
    }
    public static void pontos(String spazio){
        System.out.println("__________________________________________________________________________________________________________________________________|\n\n" +
                spazio +"            _______________    \n" +
                spazio +"           | [][][][][][]|_\\ \n" +
                spazio +"           |     PONTOS     |) \n" +
                spazio +"        ...=--OO-------OO--=  \n");
    }

    public void stampaInizioGioco() throws InterruptedException {
        System.out.println("[GIOCO] Preparatevi a giocare!\n" +
                "Ora l'unica cosa che dovrete fare sarà godervi la gara! BUONA FORTUNA!");

        Thread.sleep(1000);
        System.out.println("  ████████ \n" +
                " ███░░░░███\n" +
                "░░░    ░███\n" +
                "   ██████░ \n" +
                "  ░░░░░░███\n" +
                " ███   ░███\n" +
                "░░████████ \n" +
                " ░░░░░░░░  \n\n");
        Thread.sleep(1000);
        System.out.println("  ████████ \n" +
                " ███░░░░███\n" +
                "░░░    ░███\n" +
                "   ███████ \n" +
                "  ███░░░░  \n" +
                " ███      █\n" +
                "░██████████\n" +
                "░░░░░░░░░░ \n\n");
        Thread.sleep(1000);
        System.out.println(" ████ \n" +
                "░░███ \n" +
                " ░███ \n" +
                " ░███ \n" +
                " ░███ \n" +
                " ░███ \n" +
                " █████\n" +
                "░░░░░ \n\n");
        Thread.sleep(1000);
        System.out.println(" █████   █████ █████   █████████   ███\n" +
                "░░███   ░░███ ░░███   ███░░░░░███ ░███\n" +
                " ░███    ░███  ░███  ░███    ░███ ░███\n" +
                " ░███    ░███  ░███  ░███████████ ░███\n" +
                " ░░███   ███   ░███  ░███░░░░░███ ░███\n" +
                "  ░░░█████░    ░███  ░███    ░███ ░░░ \n" +
                "    ░░███      █████ █████   █████ ███\n" +
                "     ░░░      ░░░░░ ░░░░░   ░░░░░ ░░░ \n\n\n\n");
        Thread.sleep(1000);
    }

}
