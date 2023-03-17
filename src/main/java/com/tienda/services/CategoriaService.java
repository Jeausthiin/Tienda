/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Jeausthin
 */
public interface CategoriaService {

    //Obtiene la lista de registros de la tabla categoria
    //y lo coloca en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);

    //Obtiene el registro de la trabla categoria 
    //que tiene el ID categoria pasado por el objeto categoria
    public Categoria getCategoria(Categoria categoria);
    
    //Elimina el registro de la trabla categoria 
    //que tiene el ID categoria pasado por el objeto categoria
    public void deleteCategoria(Categoria categoria);
    
    //Si el idCategoria pasado no existe o es nulo se crea un registro nuevo
    //si el id categoria existe, se actualiza la informacion
    public void saveCategoria(Categoria categoria);
}
