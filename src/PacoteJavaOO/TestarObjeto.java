package PacoteJavaOO;

import javax.swing.*;

public class TestarObjeto {

    public static void main(String[] args) {

        //instânciando a classe Clientes
        Clientes clientes = new Clientes();

        clientes.setNome(JOptionPane.showInputDialog(null, "Insira seu nome"));

        JOptionPane.showMessageDialog(null, "Seu nome é " + clientes.getNome());

    }

}
