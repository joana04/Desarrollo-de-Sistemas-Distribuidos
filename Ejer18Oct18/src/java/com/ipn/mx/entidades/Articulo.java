/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.entidades;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Esli
 */
@Entity
@Table(name="Articulo",
        catalog="InventarioSimple")
public class Articulo implements Serializable{
    @Id 
    /*Si es autogenerado se necesita
    @GeneratedValue(......)  lo borro >:)*/
    /*si no se llama igual que en la base ponemos
    @Column (name="claveArticulo", unique=true, nullable = false, length=10)
    */
    private String claveArticulo;
    private String descripcion;
    private double precio;
    private int existencias;

    public void setClaveArticulo(String claveArticulo) {
        this.claveArticulo = claveArticulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getClaveArticulo() {
        return claveArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}
