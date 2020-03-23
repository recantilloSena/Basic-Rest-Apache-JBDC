/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.controller;


import com.adsi.modelo.Films;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author RICARDO
 */
public class Controlador extends Conexion{
    
    
    public LinkedList  findAllFilms ( ) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
                
        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        
        try {
            String query;
            query = "select * from film ";                         //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            
            while (rst.next()) {
                lista.add(Films.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query );
            
        }  finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    }
    
    public LinkedList  findFilms_x_Length (int duracion_inicial, int duracion_final ) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
                
        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        
        try {
            String query;
            query = "SELECT * FROM film where length >= ? and length <= ?  ";                         //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
                  pst.setInt(1, duracion_inicial);
                  pst.setInt(2, duracion_final);
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            
            while (rst.next()) {
                //lista.add(Film.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query );
            
        }  finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    } 

    public LinkedList  findFilms_x_Length_and_rating (int duracion_inicial, int duracion_final, String rating ) throws SQLException {
        if (!hayConexion()) {
            throw new SQLException(" No existe conexion abierta ");
        }
                
        PreparedStatement pst = null;
        ResultSet rst = null;
        LinkedList lista = new LinkedList();
        
        try {
            String query;
            query = "SELECT * FROM film where length >= ? and length <= ? and rating = ? ";                         //Definir la consulta
            pst = con.prepareStatement(query);                      //Prepararla
                  pst.setInt(1, duracion_inicial);
                  pst.setInt(2, duracion_final);
                  pst.setString(3,rating);
                  
            rst = pst.executeQuery();                               //Ejecutarla 
            
            
            while (rst.next()) {
                //lista.add(Film.load(rst));     //Recorre el RS y llena una lista
            }
            System.out.println("El Query " + query );
            
        }  finally {
            if (pst != null) {
                pst.close();
                pst = null;
            }
            if (rst != null) {
                rst.close();
                rst = null;
            }
        }
        return lista;                            //Retorna la lista llena
    } 
   
   
    
    public void addFilms(Films film) throws SQLException, IOException {
        if (!hayConexion()) {
            throw new SQLException("SIN CONEXION");
        }
        PreparedStatement pst = null;
        ResultSet rst = null;
        try {
            pst = con.prepareStatement(" INSERT INTO  film \n" +
                                    "(   title , description , release_year , language_id ,\n" +
                                    " original_language_id , rental_duration , rental_rate ,\n" +
                                    " length , replacement_cost , rating , special_features , last_update )\n" +
                                    "VALUES\n" +
                                    "( 'Avenger', 'Final war of avenger an thanos', 2019,\n" +
                                    "1, NULL,3,\n" +
                                    "4.99, 120, 19.99,\n" +
                                    "'G', 'Trailers',\n" +
                                    "sysdate());");
                    
           
            pst.execute();

        }catch(Exception Ex){
            System.out.println("Error en Adiciona rDato : \n"+Ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (rst != null) {
                rst.close();
            }
        }
    }

    
    
}


