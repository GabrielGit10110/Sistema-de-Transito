/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transito;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Transito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int pergunta;
        // Vetor Homogeneo
        Estatistica[] esta = new Estatistica[4]; // variavel esta = um vetor do tipo Estatistica
        //Estatistica[] esta = new Estatistica[10];

        for (int i = 0; i < esta.length; i++) {
            esta[i] = new Estatistica();
        }

        Metodos met = new Metodos();
        do {
            pergunta = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    1- Cadastro Estatistica e registro em "Dadinhos.txt"
                                                                    2 - Ler do arquivo "Dadinhos.txt"
                                                                    3 - Consulta por quantidade de acidentes
                                                                    4 - Consulta por estatisticas de acidentes
                                                                    5 - Acidentes acima da media das 10 cidades
                                                                    9 - Finaliza"""));
            switch (pergunta) {
                case 1:
                    met.FcadastraEstatistica(esta);
                    break;
                case 2:
                    met.FLeitura(esta);
                    break;
                case 3:
                    met.PqtdAcidentes(esta);
                    break;
                case 4:
                    met.PmaiorMenor(esta);
                    break;
                case 5:
                    met.Pacima(esta);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido digite novamente...");
            }

        } while (pergunta != 9);

    }
}
