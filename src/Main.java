import util.stampaMessaggi;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stampaMessaggi utl = new stampaMessaggi();

        utl.introduzione();
        int numeroGiocatori = sc.nextInt();
        ArrayList<String> listaGiocatori = new ArrayList<>();

        listaGiocatori = utl.sceltaNomiGiocatori(numeroGiocatori);

        utl.sceltaPulmino(numeroGiocatori, listaGiocatori);
    }
}