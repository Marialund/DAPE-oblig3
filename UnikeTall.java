package Oblig3;

import static javax.swing.JOptionPane.*;
import java.util.*;

public class UnikeTall{
    // Deklarasjon av array for lagring av tilfeldige heltall
        int[] talliste;

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet.  */
        int lengde; //?

        public UnikeTall(int lengde) {
            talliste = new int[talliste.length];
            this.lengde = lengde;
        }

   /*Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */
        public boolean finnTallet(int tall) {
            for (int i = 0; i < talliste.length; i++){
                if (tall == talliste[i]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */
        public void tilfeldigeTall(){
            for (int i = 0; i < talliste.length; i++) {
                int tall = (int)(Math.random()*(900)+100);
                if (finnTallet(tall == true)){
                    //?
                }
            }
        }

    // Metode som finner og returnerer det minste tallet i arrayet.
        public int minsteTall() {
            int minste = Integer.MAX_VALUE; //?
            for (int i = 0; i < talliste.length; i++) {
                if (talliste[i] < minste) {
                    minste = talliste[i];
                }
                else {
                    return minste;
                }
            }
        }

    // Metode som finner og returnerer det største tallet i arrayet.
        public int størsteTall() {
            int største = Integer.MIN_VALUE; //?
            for (int i = 0; i < talliste.length; i++) {
                if (talliste[i] < største) {
                    største = talliste[i];
                }
                else {
                    return største;
                }
            }
        }


   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */
        public double gjennomsnitt() {
            double gjennomsnitt = 0;
            for (int i = 0; i < talliste.length; i++) {
                gjennomsnitt = gjennomsnitt + talliste[i];
            }
            gjennomsnitt = (double) gjennomsnitt / talliste.length;
            return gjennomsnitt;
        }


   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
        public String SkrivUt{
            showMessageDialog(null, "Array" + "\n" +
                    "Minste tall er " + minste + "\n" +
                    "Største tall er " + største + "\n" +
                    "Gjennomsnittsverdien er " + gjennomsnitt);
        }
    }
