/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloProductos;
import include.Producto;

/**
 *
 * @author Javier
 */
public class ControladorProductos {

    public boolean crearProducto(Producto p) {
        ModeloProductos modelop = new ModeloProductos();
        return modelop.crear_producto(p);
    }
    
    
    
}
