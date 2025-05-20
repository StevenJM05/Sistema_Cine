/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author steve
 */
///Administra la capacidad de asientos, el tipo de sala (2D, 3D, VIP) y las funciones
//programadas.
public class Sala {
    //El numero de la sala
    public int Numero;
    //La capacidad que tiene la sala
    public int Capacidad;
    //Tipo de sala (2D, 3D, VIP)'
    public String Tipo;
    //La lista de funciones disponibles
    public List<Funcion> Funciones;
    
    //Constructor Vacio
    public Sala() {
    }

    public Sala(int Numero, int Capacidad, String Tipo, List<Funcion> Funciones) {
        this.Numero = Numero;
        this.Capacidad = Capacidad;
        this.Tipo = Tipo;
        this.Funciones = Funciones;
    }
    
    //Metodos
    
    //Get and Setters
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public List<Funcion> getFunciones() {
        return Funciones;
    }

    public void setFunciones(List<Funcion> Funciones) {
        this.Funciones = Funciones;
    }
}
