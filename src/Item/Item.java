/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Item;

import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Item {

    private ArrayList<Object> Fotos[];
    private TipoItem tipo;
    private String descricao;
    private int quantidade;
    private String cidade;

    public String getDescricao() {
        return descricao;
    }

    public Item(TipoItem tipo, String descricao, int quantidade, String cidade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.cidade = cidade;
    }

}
