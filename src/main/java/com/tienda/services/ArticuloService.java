/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author Jeausthin
 */
public interface ArticuloService {

    //Obtiene la lista de registros de la tabla articulo
    //y lo coloca en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);

    //Obtiene el registro de la trabla articulo 
    //que tiene el ID articulo pasado por el objeto articulo
    public Articulo getArticulo(Articulo articulo);
    
    //Elimina el registro de la trabla articulo 
    //que tiene el ID articulo pasado por el objeto articulo
    public void deleteArticulo(Articulo articulo);
    
    //Si el idArticulo pasado no existe o es nulo se crea un registro nuevo
    //si el id articulo existe, se actualiza la informacion
    public void saveArticulo(Articulo articulo);
}
