package teste;

import javax.swing.*;

public class Palindromo{  

public static void main(String[] args) {
       
       String palavra, palavraInvertida="";
       
       // Armazena a palavra numa String
       palavra = JOptionPane.showInputDialog(null,"Digite uma palavra"); 
       
       // Percorre a palavra de acordo com o tamanho da string
       for(int i=palavra.length()-1;i>=0;i--){  
           palavraInvertida += palavra.charAt(i);
        }
        
       //Compara as Duas Strings e Exibe o Resultado
       if(palavra.equals(palavraInvertida)) 
            JOptionPane.showMessageDialog(null,palavra + " É uma palavra palindroma"); 
       else 
            JOptionPane.showMessageDialog(null,palavra + " Não é uma palavra palindroma"); 

       
}
    
}