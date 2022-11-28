/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doacao;

import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class DoacaoAprovada extends Doacao {
    
    public DoacaoAprovada(Doacao d){
        super(d.getUsuario());
        this.setLista(d.getLista());
        this.setAprovada(1);
    }
    
    class Interesse {

        Usuario u;
        String j;

        public Interesse(Usuario u, String j) {
            this.u = u;
            this.j = j;
        }
    }
    private ArrayList<Interesse> interessados = new ArrayList<>();

    public ArrayList<Interesse> getInteressados() {
        return this.interessados;
    }

    public void setInteressados(ArrayList<Interesse> interessados) {
        this.interessados = interessados;
    }
    public boolean cadastrarInteressado(Usuario u, String j) {
        Interesse i = new Interesse(u, j);
        interessados.add(i);
        return true;
    }

    public void printInteressados() {
        System.out.println("Dono da doação: " + this.getUsuario().getLogin());
        System.out.println("Interessados:");
        for (Interesse i : this.interessados) {
            System.out.println(i.u.getLogin() + ',' + i.j);
        }
    }
}
