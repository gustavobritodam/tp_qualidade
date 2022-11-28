/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tpqualidade;

import Doacao.Doacoes;
import Testes.Testes;

/**
 *
 * @author gusta
 */
public class TPQualidade {

    public static void main(String[] args) {
        Testes t = new Testes();
        System.out.println(t.usuarioLogin());
        System.out.println(t.usuarioTipo());
        System.out.println(t.cadastrarTipoItem());
        System.out.println(t.getTipoItem());
        System.out.println(t.cadastrarItem());
        t.aprovarDoacao();
        System.out.println(t.getItem());
        System.out.println(t.alterarItem());
        System.out.println(t.excluirItem());
        System.out.println(t.pesquisarDoacaoArray());
        //t.printPesquisarDoacao();
        //t.interesse();
        //Doacoes.printDoacoes();
        System.out.println(t.pesquisarDoacao());
    }
}
