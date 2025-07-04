import personaggio.pulmino;
import util.stampaMessaggi;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        stampaMessaggi utl = new stampaMessaggi();

        utl.introduzione();
        int numeroGiocatori = sc.nextInt();
        ArrayList<String> listaNomiGiocatori = new ArrayList<>();

        listaNomiGiocatori = utl.sceltaNomiGiocatori(numeroGiocatori);

        ArrayList<Integer> listaPersonaggi = utl.sceltaPulmino(numeroGiocatori, listaNomiGiocatori);

        ArrayList<pulmino> listaGiocatori = new ArrayList<>();
        for (int i = 0; i < numeroGiocatori; i++) {
            switch(listaPersonaggi.get(i)){
                case 1:
                    listaGiocatori.add(new pulmino("ALFREDO",listaNomiGiocatori.get(i),6,2,0));
                    break;
                case 2:
                    listaGiocatori.add(new pulmino("OSSAS",listaNomiGiocatori.get(i),4,3,0));
                    break;
                case 3:
                    listaGiocatori.add(new pulmino("DRAKE",listaNomiGiocatori.get(i),3,4,0));
                    break;
                case 4:
                    listaGiocatori.add(new pulmino("PONTOS",listaNomiGiocatori.get(i),2,6,0));
                    break;
            }
        }

        utl.stampaInizioGioco();

        boolean condizione = true;
        String vincitore="[ERRORE]";
        do {
            //TODO Stampare a video la gara, ogni volta bisogna calcolare la distanza per ogni singolo giocatore, quindi probabilmente ci deve essere un
            //TODO DoWhile che comanda, all'interno un for che cicla per il numero di giocatori, fa il calcolo della distanza di ognuno e poi stampa la distanza totale.
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (pulmino value : listaGiocatori) {

                int distanzaDaPercorrere = value.calcoloDistanza();
                int distanzaTotale = value.getDistanza() + distanzaDaPercorrere;
                value.setDistanza(distanzaTotale);

                switch (value.getPersonaggio()) {
                    case "ALFREDO":
                        stampaMessaggi.alfredo(stampaMessaggi.calcoloSpazio(distanzaTotale),distanzaTotale,value.getNome());
                        break;
                    case "OSSAS":
                        stampaMessaggi.ossas(stampaMessaggi.calcoloSpazio(distanzaTotale),distanzaTotale,value.getNome());
                        break;
                    case "DRAKE":
                        stampaMessaggi.drake(stampaMessaggi.calcoloSpazio(distanzaTotale),distanzaTotale,value.getNome());
                        break;
                    case "PONTOS":
                        stampaMessaggi.pontos(stampaMessaggi.calcoloSpazio(distanzaTotale),distanzaTotale,value.getNome());
                        break;
                }

            }

            //TODO La condizione deve essere che almeno 1 bus deve arrivare a distanza=100. FATTO
            for (personaggio.pulmino pulmino : listaGiocatori) {
                if (pulmino.getDistanza() >= 100) {
                    condizione = false;
                    vincitore = pulmino.getNome() + " Con: " + pulmino.getPersonaggio() + "!";
                    break;
                }
            }

            Thread.sleep(900);
        }while(condizione);

        System.out.println(stampaMessaggi.gioco + "Il vincitore è: " + vincitore);
    }
}