/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author Jeausthin
 */
public interface ClienteService {

    //Obtiene la lista de registros de la tabla cliente
    //y lo coloca en una lista de objetos cliente
    public List<Cliente> getClientes();

    //Obtiene el registro de la trabla cliente 
    //que tiene el ID cliente pasado por el objeto cliente
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la trabla cliente 
    //que tiene el ID cliente pasado por el objeto cliente
    public void deleteCliente(Cliente cliente);
    
    //Si el idCliente pasado no existe o es nulo se crea un registro nuevo
    //si el id cliente existe, se actualiza la informacion
    public void saveCliente(Cliente cliente);
}
