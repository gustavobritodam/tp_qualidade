/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doacao;

import java.util.ArrayList;
import Email.EmailService;

/**
 *
 * @author gusta
 */
public class Doacoes {

    public static ArrayList<Doacao> getDoacoes() {
        return doacoes;
    }

    private static ArrayList<Doacao> doacoes = new ArrayList<>();

    public static void printDoacoes() {
        int i = 0;
        for (Doacao d : doacoes) {
            System.out.println("Doacao: " + i);
            d.printItens();
            i++;
        }
    }

    public static Doacao getDoacaoIndex(int index) {
        return doacoes.get(index);
    }
}
