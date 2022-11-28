/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class TiposItem {

    private static ArrayList<TipoItem> tipos_item = new ArrayList<>();

    public static ArrayList<TipoItem> getTipos_item() {
        return tipos_item;
    }


    public static TipoItem getTipoItem(String nome_item) {
        for (TipoItem t : tipos_item) {
            if (t.nome != null && t.nome.equals(nome_item)) {
                return t;
            }
        }
        return null;
    }

    public static void printTiposItem() {
        for (TipoItem t : tipos_item) {
            System.out.println(t.nome);
        }
    }
}
