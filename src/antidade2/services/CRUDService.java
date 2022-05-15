/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antidade2.services;

import antidade2.entities.Entidade;

/**
 * CRIAR, REMOVER, ATUALIZAR E BUSCAR
 * CRUD > create, read, update, delete  
 * @author 07117819154
 */
public interface CRUDService <T extends Entidade>/* estudar tipos genericos depois*/ {
    
  T criar(T entidade);
  
  void remover(Long id);
  
  T atualizar(T entidade);
        
  T buscar(Long id);    
}
