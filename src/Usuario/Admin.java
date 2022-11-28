/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import Doacao.Doacao;
import Doacao.DoacaoAprovada;
import Doacao.DoacaoReprovada;
import Doacao.Doacoes;

/**
 *
 * @author gusta
 */
public class Admin extends Usuario {

    public Admin(String login, String senha) {
        super(login, senha);
        this.tipo = 2;
    }

    public boolean cadastrar_usuario() {
        return true;
    }


    public static void aprovarDoacao(int index) {
        Doacao d = Doacoes.getDoacoes().get(index);
        DoacaoAprovada d_aprovada = new DoacaoAprovada(d);
        Doacoes.getDoacoes().set(index, d_aprovada);
    }

    public static void reprovarDoacao(int index) {
        Doacao d = Doacoes.getDoacoes().get(index);
        DoacaoReprovada DoacaoReprovada = new DoacaoReprovada(d);
        Doacoes.getDoacoes().set(index, DoacaoReprovada);
    }
}
