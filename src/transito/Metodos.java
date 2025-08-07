/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transito;

import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
class Metodos {
// preenche o vetor de vários tipos

    public Estatistica[] FcadastraEstatistica(Estatistica[] esta) throws IOException {
        String NomeArquivo = "Dadinhos.txt";
        BufferedWriter escreve = new BufferedWriter(new FileWriter( NomeArquivo));
        
        for (int i = 0; i < esta.length; i++) {
            esta[i].CodCid = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            escreve.write(Integer.toString(esta[i].CodCid));
            escreve.newLine();
        
            esta[i].NomCid = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            escreve.write(esta[i].NomCid);
            escreve.newLine();
            
            esta[i].QtdAci = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes na cidade: "));
            escreve.write(Integer.toString(esta[i].QtdAci));
            escreve.newLine();

        }
            System.out.println("Gravacao realizada!");
            escreve.close();
            
        return esta;

    }
    public Estatistica[] FLeitura(Estatistica[] esta) throws IOException {
        String NomeArquivo = "Dadinhos.txt";
        BufferedReader ler = new BufferedReader(new FileReader(NomeArquivo));
                
        for(int i = 0; i < esta.length; i++){
            esta[i].CodCid = Integer.parseInt(ler.readLine());
            esta[i].NomCid = ler.readLine();
            esta[i].QtdAci = Integer.parseInt(ler.readLine());
        }
        
        System.out.println("Leitura Realizada");
        
        ler.close();
        
        return esta;
    }
// consulta a quantidade de acidentes se for maior que 100 e menor que 500
    public void PqtdAcidentes(Estatistica[] esta) throws IOException {
        for (int i = 0; i < esta.length; i++) {
            if (esta[i].QtdAci > 100 && esta[i].QtdAci < 500) {
                JOptionPane.showMessageDialog(null, "Cidade: " + esta[i].NomCid + " teve " + esta[i].QtdAci + " acidentes");
            }
        }
    }
// mostra a cidade com os menores acidentes e as maiores

    public void PmaiorMenor(Estatistica[] esta) {

        int maior = esta[0].QtdAci;
        int menor = esta[0].QtdAci;
        String nomeMaior = esta[0].NomCid;
        String nomeMenor = esta[0].NomCid;
        for (int i = 0; i < esta.length; i++) {
            if (maior < esta[i].QtdAci) {
                maior = esta[i].QtdAci;
                nomeMaior = esta[i].NomCid;
            }
            if (menor > esta[i].QtdAci) {
                menor = esta[i].QtdAci;
                nomeMenor = esta[i].NomCid;
            }
        }
        JOptionPane.showMessageDialog(null, "maior: " + nomeMaior
                + " qtd de acidentes: " + maior + "\n" + "menor:" + nomeMenor
                + " qtd de acidentes: " + menor);
        System.out.println("Funciona PmaiorMenor");

    }

    public void Pacima(Estatistica[] esta) {

        Double media = 0.0;

        for (int i = 0; i < esta.length; i++) {
            media = (media + esta[i].QtdAci);
        }
        media = (media / esta.length);

        for (int i = 0; i < esta.length; i++) {
            if (esta[i].QtdAci > media) {
                JOptionPane.showMessageDialog(null, " cidade : " + esta[i].NomCid + " está acima da média de acidentes ");
            }
        }
    }

}
