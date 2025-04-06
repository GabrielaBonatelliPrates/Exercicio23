

package com.mycompany.exercicio23;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio23 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número final:"));
        int soma = 0;
        int i = n1;
        while (i <= n2) {
            soma = soma + i;
            i = i++;                    
        }
    

    JOptionPane.showMessageDialog (null, soma);
    }
    }    
