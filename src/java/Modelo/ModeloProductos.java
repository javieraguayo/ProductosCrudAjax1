/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import include.Producto;
import java.sql.PreparedStatement;

/**
 *
 * @author Javier
 */
public class ModeloProductos extends Conexion{

    public boolean crear_producto(Producto p){
        PreparedStatement pst = null;
        boolean flag = false;
        
        try {//llamamos al producto almacenado en la bd
            String sql = "call insertProducto(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);//pasamos los parametros a la consulta
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getDescripcion());
            pst.setFloat(3, p.getPrecio());
            pst.setString(4, p.getCategoria());
            pst.setString(5, p.getDetalles());
            pst.setString(6, p.getReviews());
            pst.setInt(7, p.getSize());
            pst.setString(8, p.getColor());
            pst.setString(9, p.getImg1());
            pst.setString(10, p.getImg2());
            pst.setString(11, p.getImg3());
            pst.setString(12, p.getImg4());
            pst.setString(13, p.getImg5());
            
            if(pst.executeUpdate() == 1){
            flag = true;
            }
        } catch (Exception e) {
        }finally{
            try {
                if(pst !=null) pst.close();//cerramos la conexion
            } catch (Exception e) {
            }
        }
        
    return false;
    }
    
//    public static void main(String[] args) {
//        
//        ModeloProductos mp = new ModeloProductos();
//        System.out.println(mp.crear_producto(new Producto(0, "aca nombre", "aca descripcion", 25, "aca_categoria", "aca_detalles", "aca_reviews", 111, "aca_color", "img11", "img22", "img33", "img44", "img55")));
//    }
}
