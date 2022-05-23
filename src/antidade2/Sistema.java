/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antidade2;

import antidade2.exceptions.NaoExisteEntidadeException;
import antidade2.entities.Proposta;
import antidade2.entities.Trabalho;
import antidade2.entities.Usuario;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Sistema {
    
    private static Sistema INSTANCIA;
    private static Random random = new Random();
   
    private Map<Long, Trabalho> TRABALHOS = new HashMap<>();
    private Map<Long, Usuario> USUARIOS = new HashMap<>();
    private Map<Long, Proposta> PROPOSTAS = new HashMap<>();
    
    private Sistema() {
        
    }
    
    public static Sistema getInstancia() {
        if (INSTANCIA == null){
            INSTANCIA = new Sistema();
        }
        return INSTANCIA;
    }
    
    public Trabalho criarTrabalho(Trabalho trabalho) {
       Long id = Math.abs(random.nextLong());
       trabalho.setId(id);
       this.TRABALHOS.put(id, trabalho);
       return trabalho;
    }
    
    public void atualizarTrabalho(Trabalho trabalhoAtualizado) throws NaoExisteEntidadeException {
       Long idTrabalho = trabalhoAtualizado.getId();
       if (!this.TRABALHOS.containsKey(idTrabalho)) {
           throw new NaoExisteEntidadeException(
                   "Não Existe a entidade trabalho com id: " 
                           + String.valueOf(idTrabalho)
           );
       }
       this.TRABALHOS.replace(idTrabalho, trabalhoAtualizado);
    }
    
    public Trabalho buscarTrabalho(Long idTrabalho) {
        return this.TRABALHOS.get(idTrabalho);        
    }
    
    public void apagarTrabalho(Long idTrabalho) throws NaoExisteEntidadeException {
        Boolean existeTrabalho = this.TRABALHOS.containsKey(idTrabalho);
        if (!existeTrabalho) {
            throw new NaoExisteEntidadeException(
                   "Não Existe a entidade trabalho com id: " 
                           + String.valueOf(idTrabalho)
           );
        }
        this.TRABALHOS.remove(idTrabalho);
    }
    
}
