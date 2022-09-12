import javax.swing.*;

public class SomaDeElementosEntreDoisNumeros {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Esse Programa irá calcular a soma de todos os elementos entre dois números!");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Menor número entre os dois valores:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Maior número entre os dois valores:"));
        int tOperacoes = (n2 - (n1-1)) / 2 ;
        int resultadoParcial = n1 + n2;
        int resultadoTotal = tOperacoes * resultadoParcial;
        JOptionPane.showMessageDialog(null,resultadoTotal);
    }
}
