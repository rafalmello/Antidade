/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antidade2.entities;

import java.util.ArrayList;

/**
 *
 * @author 07117819154
 */
public class Trabalho extends Entidade {
    
    private Usuario criador;
    private ArrayList<String> propostas;
    private ArrayList<Usuario> equipe;//quem vai participar do trabalho?
    private String titulo;
    private String descricao;
    
}
