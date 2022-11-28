/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doacao;

import Usuario.Usuario;

/**
 *
 * @author gusta
 */
public class DoacaoReprovada extends Doacao{
    private String justificativa;
    public String getJustificativa() {
        return justificativa;
    }
    
    public DoacaoReprovada(Doacao d){
        super(d.getUsuario());
        this.setLista(d.getLista());
        this.setAprovada(-1);
    }
    
}
