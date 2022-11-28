/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doacao;

import Item.Item;
import Item.TipoItem;
import Item.TiposItem;
import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Doacao {

    private ArrayList<Item> itens = new ArrayList<>();
    private Usuario usuario;
    private int aprovada;

    public int getAprovada() {
        return aprovada;
    }

    public void setAprovada(int aprovada) {
        this.aprovada = aprovada;
    }

    public ArrayList<Item> getLista() {
        return itens;
    }

    public void setLista(ArrayList<Item> lista) {
        this.itens = lista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Doacao(Usuario u) {
        this.usuario = u;
        this.aprovada = 0;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public boolean cadastrarItem(String tipo_item_nome, String descricao, int quantidade, String cidade) {
        TipoItem tipo_item = TiposItem.getTipoItem(tipo_item_nome);
        if (tipo_item != null) {
            Item t = new Item(tipo_item, descricao, quantidade, cidade);
            itens.add(t);
            return true;
        }
        return false;
    }

    public boolean cadastrarItem(Item item) {
        itens.add(item);
        return true;
    }

    public Item newItem(String tipo_item_nome, String descricao, int quantidade, String cidade, Usuario usuario) {
        TipoItem tipo_item = TiposItem.getTipoItem(tipo_item_nome);
        if (tipo_item != null) {
            Item t = new Item(tipo_item, descricao, quantidade, cidade);
            return t;
        }
        return null;
    }

    public Item getItem(String descricao) {
        for (Item t : itens) {
            if (t.getDescricao() != null && t.getDescricao().equals(descricao)) {
                return t;
            }
        }
        return null;
    }

    public int getItemIndex(String descricao) {
        int i = 0;
        for (Item t : itens) {
            if (t.getDescricao() != null && t.getDescricao().equals(descricao)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void printItens() {
        System.out.println("Usuario: " + this.usuario.getLogin());
        for (Item t : this.getItens()) {
            System.out.println(t.getDescricao());
        }
        System.out.println("\n");
    }

    public boolean excluirItem(String descricao) {
        int i = this.getItemIndex(descricao);
        if (i > -1) {
            itens.remove(i);
        }
        return false;
    }

    public boolean alterarItem(String descricao, Item item) {
        int i = this.getItemIndex(descricao);
        if (i > -1) {
            itens.set(i, item);
            return true;
        }
        return false;
    }
}
