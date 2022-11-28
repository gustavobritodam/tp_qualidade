/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import Doacao.Doacao;
import Doacao.Doacoes;
import Item.TipoItem;
import Item.TiposItem;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Usuario {

    private String login;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    private String senha;
    public int tipo;

    public Usuario(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
        this.tipo = 1;
    }

    public boolean login(String login, String senha) {
        //System.out.println(login +' '+ senha +' '+ this.getLogin() +' '+ this.getSenha());
        return this.getLogin().equals(login) && this.getSenha().equals(senha);
    }
    
    public static boolean cadastrarDoacao(Doacao d) {
        Doacoes.getDoacoes().add(d);
        return true;
    }
    
    //retorna primeira doacao que achar com a descricao
    public static Doacao pesquisarDoacao(String descricao) {
        for (Doacao d : Doacoes.getDoacoes()) {
            if (d.getAprovada() == 1 && d.getItem(descricao) != null) {
                return d;
            }
        }
        return null;
    }

    public static ArrayList<Integer> pesquisarDoacaoArray(String descricao) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        for (Doacao d : Doacoes.getDoacoes()) {
            if (d.getAprovada() == 1 && d.getItem(descricao) != null) {
                result.add(i);
            }
            i++;
        }
        return result;
    }

    public static void printPesquisarDoacao(String descricao) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        for (Doacao d : Doacoes.getDoacoes()) {
            if (d.getAprovada() == 1 && d.getItem(descricao) != null) {
                result.add(i);
            }
            i++;
        }
        System.out.println(result.toString());
    }
    
    
    public static boolean cadastrarTipoItem(String nome) {
        TipoItem t = new TipoItem(nome);
        TiposItem.getTipos_item().add(t);
        return true;
    }
}
