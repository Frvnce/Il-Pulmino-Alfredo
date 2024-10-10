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
                    listaGiocatori.add(new pulmino("ALFREDO",listaNomiGiocatori.get(i),6,1,0));
                    break;
                case 2:
                    listaGiocatori.add(new pulmino("OSSAS",listaNomiGiocatori.get(i),4,2,0));
                    break;
                case 3:
                    listaGiocatori.add(new pulmino("DRAKE",listaNomiGiocatori.get(i),3,3,0));
                    break;
                case 4:
                    listaGiocatori.add(new pulmino("PONTOS",listaNomiGiocatori.get(i),2,4,0));
                    break;
            }
        }

        utl.stampaInizioGioco();

        boolean condizione = true;
        String vincitore="[ERRORE]";
        do {
            //TODO Stampare a video la gara, ogni volta bisogna calcolare la distanza per ogni singolo giocatore, quindi probabilmente ci deve essere un
            //TODO DoWhile che comanda, all'interno un for che cicla per il numero di giocatori, fa il calcolo della distanza di ognuno e poi stampa la distanza totale.


            //TODO Da togliere perchè sennò dava errore.
            double test = Math.random()*150;
            if(test>=100) condizione = false;
            System.out.println(test);

            //TODO La condizione deve essere che almeno 1 bus deve arrivare a distanza=100. FATTO
            for (personaggio.pulmino pulmino : listaGiocatori) {
                if (pulmino.getDistanza() >= 100) {
                    condizione = false;
                    vincitore = pulmino.getNome() + " CON: " + pulmino.getPersonaggio() + "!";
                    break;
                }
            }
        }while(condizione);

        System.out.println(stampaMessaggi.gioco + "Il vincitore è: " + vincitore);
    }
}