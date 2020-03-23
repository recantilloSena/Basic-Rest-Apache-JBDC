/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RICARDO
 */
public class Films {

   
   
    private int film_id;
    private String title;
    private String description;
    private int release_year;
    private int language_id;
    private int original_language_id;
    private int rental_duration;
    private float rental_rate;
    private int length;
    private float  replacement_cost;
    private String rating;
    private String special_features;
    private Date last_update;

    public Films() {
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(int original_language_id) {
        this.original_language_id = original_language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public float getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(float rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(float replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    
    
    
    
    
    

   
     public static Films load(ResultSet rs) throws SQLException{
         Films films = new Films();
         
         films.setFilm_id(rs.getInt(1)); 
         films.setTitle(rs.getString(2));
         films.setDescription(rs.getString(3));
         films.setRelease_year(rs.getInt(4));
         films.setLanguage_id(rs.getInt(5));
         films.setOriginal_language_id(rs.getInt(6));
         films.setRental_duration(rs.getInt(7));
         films.setRental_rate(rs.getFloat(8));
         films.setLength(rs.getInt(9));
         films.setReplacement_cost(rs.getFloat(10));
         films.setRating(rs.getString(11)); 
         films.setSpecial_features(rs.getString(12));
         films.setLast_update(rs.getDate(13));
         
         
         
         
         
         return films;
       
    }
    
    
    
    
    
}
