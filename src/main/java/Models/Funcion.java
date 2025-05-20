/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author steve
 */
//Representa cada proyección específica de una película en una sala, en un horario
//determinado.
public class Funcion {
    //La Pelicula de la Funcion
    public Pelicula Pelicula;
    //La sala de la funcion
    public Sala Sala;
    //Horario de la funcion
    public String Horario;
    //Los asientos disponibles para la funcion
    public int AsientosDisponibles;
    
    //Constructor Vacio
    public Funcion() {
    }
    
    public Funcion(Pelicula Pelicula, Sala Sala, String Horario, int AsientosDisponibles) {
        this.Pelicula = Pelicula;
        this.Sala = Sala;
        this.Horario = Horario;
        this.AsientosDisponibles = AsientosDisponibles;
    }
    
    //Getters and Setters

    public Pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(Pelicula Pelicula) {
        this.Pelicula = Pelicula;
    }

    public Sala getSala() {
        return Sala;
    }

    public void setSala(Sala Sala) {
        this.Sala = Sala;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getAsientosDisponibles() {
        return AsientosDisponibles;
    }

    public void setAsientosDisponibles(int AsientosDisponibles) {
        this.AsientosDisponibles = AsientosDisponibles;
    }  
}
