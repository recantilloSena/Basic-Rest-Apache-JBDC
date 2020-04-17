/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest;


import com.adsi.controller.Controlador;
import com.adsi.modelo.Films;
import java.io.IOException;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;


import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;


/**
 *
 * @author RICARDO
 */
@Path("rest")

public class RestController {
    
    private final Controlador repo = new Controlador();
    
    public RestController() throws SQLException, IOException {
        repo.conectar();
    }

          
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/get")
    public String get() {
        //TODO return proper representation object
        return "Hola Rest GET";
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/films/list")
    public List<Films> findAllFilms() throws SQLException {
        //TODO return proper representation object
        return this.repo.findAllFilms();
    }
    
    

//    @POST
//    @Produces({MediaType.APPLICATION_JSON})
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Path("/films/add")
//    public Films adicionarAprendiz(  Films film) throws SQLException, IOException {
//        //TODO return proper representation object
//          this.repo.addFilms(film);
//          return film;
//    }

    
    
    }


