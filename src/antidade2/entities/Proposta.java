/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antidade2.entities;


/**
 *
 * @author 07117819154
 */
public class Proposta extends Entidade {
    
    private Usuario donoProposta;
    private Trabalho trabalhoAlvo;
    private String motivacao; //resumo do dono da proposta
    private String contraProposta; 
    private RespostaProposta resposta;

    public enum RespostaProposta {

        PENDENTE, 
        ACEITA,
        RECUSADA
    }
    
    
}
