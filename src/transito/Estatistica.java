/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transito;
import java.io.*;
/**
 *
 * @author FATEC ZONA LESTE
 */
class Estatistica {
    int CodCid;
    String NomCid;
    int QtdAci;

    Estatistica () {

        this(0, "", 0);

    }

    Estatistica (int CodigoCidade, String NomeCidade, int QtdAcidentes) {
        CodCid = CodigoCidade;
        NomCid = NomeCidade;
        QtdAci = QtdAcidentes;
    }
    
}