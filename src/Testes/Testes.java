/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;

import Doacao.Doacoes;
import Doacao.Doacao;
import Doacao.DoacaoAprovada;
import Item.Item;
import Item.TiposItem;
import Usuario.Admin;
import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Testes {

    Usuario u1, u2, u3, u4;
    Admin a1;
    Doacao d0, d1, d2, d3;

    public Testes() {
        u1 = new Usuario("Usuario 1", "11");
        u2 = new Usuario("Usuario 2", "22");
        u3 = new Usuario("Usuario 3", "33");
        u4 = new Usuario("Usuario 4", "44");

        a1 = new Admin("Admin", "xx");
        d0 = new Doacao(u1);
        u1.cadastrarDoacao(d0);
        d1 = new Doacao(u3);
        u1.cadastrarDoacao(d1);
        d2 = new Doacao(u2);
        u1.cadastrarDoacao(d2);
        d3 = new Doacao(u2);
        u1.cadastrarDoacao(d3);
    }

    public String usuarioLogin() {
        try {
            boolean t1 = this.u1.login("Usuario 1", "11");
            boolean t2 = this.u1.login("Usuario 1", "22");
            if (t1 == true && t2 == false) {
                return "UsuarioLogin OK";
            }
            return "UsuarioLogin nao OK";
        } catch (Exception e) {
            return "UsuarioLogin nao OK";
        }
    }

    public String usuarioTipo() {
        try {
            if (u1.tipo == 1 && a1.tipo == 2) {
                return "UsuarioTipo OK";
            }
            return "UsuarioTipo nao OK";
        } catch (Exception e) {
            return "UsuarioTipo nao OK";
        }
    }

    public String cadastrarTipoItem() {
        try {
            TiposItem t = new TiposItem();
            u1.cadastrarTipoItem("livro");
            u1.cadastrarTipoItem("shorts");
            //t.printTiposItem();
            if (TiposItem.getTipos_item().size() == 2) {
                return "CadastrarTipoItem OK";
            } else {
                return "CadastrarTipoItem nao OK";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "CadastrarTipoItem nao OK";
        }
    }

    public String getTipoItem() {
        try {
            TiposItem t = new TiposItem();
            u1.cadastrarTipoItem("livro");
            u1.cadastrarTipoItem("shorts");

            boolean b1 = t.getTipoItem("livro") != null ? true : false;
            boolean b2 = t.getTipoItem("livroo") == null ? true : false;
            if (b1 && b2) {
                return "GetTipoItem OK";
            } else {
                return "GetTipoItem nao OK";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "GetTipoItem nao OK";
        }
    }

    public String cadastrarItem() {
        try {
            //rodar depois de ter cadastrado itens com a função de Testes GetTipoItem
            String descricao = "Harry Topper e a Pedra Filosofal";
            String cidade = "Rio de Janeiro";
            boolean b1 = d0.cadastrarItem("livro", descricao, 2, cidade);
            boolean b2 = d0.cadastrarItem("livroo", descricao, 2, cidade);
            if (b1 && !b2) {
                return "CadastrarItem OK";
            } else {
                return "CadastrarItem nao OK";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "CadastrarItem nao OK";
        }
    }

    public void cadastrarItens() {
        //rodar depois de ter cadastrado itens com a função de Testes GetTipoItem
        String descricao = "Harry Topper e a Camara Secreta";
        String cidade = "Belo Horizonte";
        d0.cadastrarItem("livro", descricao, 2, cidade);
        d1.cadastrarItem("livro", descricao, 2, cidade);
        d2.cadastrarItem("livro", descricao, 2, cidade);
        d3.cadastrarItem("livro", descricao, 2, cidade);

        descricao = "Senhor dos Aneis 18";
        cidade = "Marrocos";
        d0.cadastrarItem("livro", descricao, 1, cidade);
        d2.cadastrarItem("livro", descricao, 2, cidade);
        d3.cadastrarItem("livro", descricao, 2, cidade);

        descricao = "Game of Thrones 1";
        cidade = "São Paulo";
        d1.cadastrarItem("livro", descricao, 1, cidade);
        d2.cadastrarItem("livro", descricao, 2, cidade);
        d3.cadastrarItem("livro", descricao, 3, cidade);
    }

    //implementar
    public void aprovarDoacao() {
        a1.aprovarDoacao(0);
        a1.aprovarDoacao(1);
        a1.aprovarDoacao(2);
        a1.reprovarDoacao(3);
    }

    public void printItens() {
        d0.printItens();
        d1.printItens();
    }

    public String getItem() {
        try {
            this.cadastrarItens();
            //rodar depois de ter cadastrado itens com a função de Testes GetTipoItem
            if (d0.getItem("Harry Topper e a Pedra Filosofal") == null) {
                return "GetItem nao OK 1";
            }
            if (d0.getItem("Harry Topper e a Pedra Filosofala") != null) {
                return "GetItem nao OK 2";
            }

            /*
            if(d1.getItem(this.u2)==null) return "GetItem nao OK 3";
            if(d1.getItem(this.a1)!=null) return "GetItem nao OK 4";
            
            if(d1.getItem("Harry Topper e a Pedra Filosofal", this.u2)!= null) return "GetItem nao OK 5";
             */
            return "getItem OK";
        } catch (Exception e) {
            System.out.println(e);
            return "getItem nao OK";
        }
    }

    public String alterarItem() {
        try {
            String descricao = "Harry Topper e a Pedra Filosofal";
            String descricao_nova = "Pedra Filosofal e o Harry Topper";
            String cidade = "Oceano de Abril";
            Item novo = d0.newItem("livro", descricao_nova, 2, cidade, u1);
            if (d0.getItem(descricao) == null) {
                return "alterarItem nao OK 1";
            }
            if (d0.getItem(descricao_nova) != null) {
                return "alterarItem nao OK 2";
            }
            d0.alterarItem(descricao, novo);
            if (d0.getItem(descricao) != null) {
                return "alterarItem nao OK 3";
            }
            if (d0.getItem(descricao_nova) == null) {
                return "alterarItem nao OK 4";
            }
            return "alterarItem OK";
        } catch (Exception e) {
            System.out.println(e);
            return "alterarItem nao OK";
        }
    }

    public String excluirItem() {
        try {
            String descricao = "Pedra Filosofal e o Harry Topper";
            if (d0.getItem(descricao) == null) {
                return "excluirItem nao OK 1";
            }
            d0.excluirItem(descricao);
            if (d0.getItem(descricao) != null) {
                return "excluirItem nao OK 2";
            }
            return "excluirItem OK";
        } catch (Exception e) {
            System.out.println(e);
            return "excluirItem nao OK";
        }
    }

    public void interesse() {
        try {
            DoacaoAprovada d_aprovada = new DoacaoAprovada(d0);
            d_aprovada.cadastrarInteressado(u1, " Justificativa 1");
            d_aprovada.cadastrarInteressado(u3, " Justificativa 3 1");
            d_aprovada.cadastrarInteressado(u3, " Justificativa 3 2");
            d_aprovada.cadastrarInteressado(u4, " Justificativa 4");
            d_aprovada.printInteressados();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String pesquisarDoacaoArray() {
        try {

            ArrayList<Integer> res1 = new ArrayList<>();
            res1.add(0);
            res1.add(1);
            res1.add(2);
            /*
                Harry Topper e a Camara Secreta: 0 1 2 3

                Senhor dos Aneis 18: 0 2 3

                Game of Thrones 1: 1 2 3
             */
            ArrayList<Integer> e1 = u1.pesquisarDoacaoArray("Harry Topper e a Camara Secreta");
            //System.out.println(e1.toString() + "\n" + res1.toString());
            if (!res1.equals(e1)) {
                return "pesquisarDoacaoArray nao OK 1";
            }

            ArrayList<Integer> res2 = new ArrayList<>();
            res2.add(1);
            res2.add(2);

            ArrayList<Integer> e2 = u1.pesquisarDoacaoArray("Game of Thrones 1");
            //System.out.println(e2.toString() + "\n" + res2.toString());
            if (!res2.equals(e2)) {
                return "pesquisarDoacaoArray nao OK 2";
            }

            ArrayList<Integer> res3 = new ArrayList<>();
            ArrayList<Integer> e3 = u1.pesquisarDoacaoArray("Teste asd");
            if (!res3.equals(e3)) {
                return "pesquisarDoacaoArray nao OK 3";
            }
            return "pesquisarDoacaoArray OK";
        } catch (Exception e) {
            System.out.println(e);
            return "pesquisarDoacaoArray nao OK";
        }
    }

    public void printPesquisarDoacao() {
        try {

            u1.printPesquisarDoacao("Harry Topper e a Camara Secreta");
            u1.printPesquisarDoacao("Game of Thrones 1");
            u1.printPesquisarDoacao("Teste asd");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String pesquisarDoacao() {
        try {
            Doacao d1_test = u1.pesquisarDoacao("Harry Topper e a Camara Secreta");
            if (d1_test == null) {
                return "pesquisarDoacao não OK";
            }
            //System.out.println(e1.toString()+"\n"+res1.toString());  
            return "pesquisarDoacao OK";
        } catch (Exception e) {
            System.out.println(e);
            return "pesquisarDoacao nao OK";
        }
    }

}
