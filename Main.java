//Maria Lund Austad (s321717), Åsmund Belsaas (s366671) og Nora Liheim Alfstad (s365313)

package Oblig3;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main (String[]args){
        String antall = showInputDialog("Hvor mange tall mellom 100 og 1000 ønsker du å trekke?");
        int lengde = Integer.parseInt(antall);

        int nedreGrense = 100;
        int øvreGrense = 1000;

        UnikeTall tallene = new UnikeTall(lengde);
    }
}
