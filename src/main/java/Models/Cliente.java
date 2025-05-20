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
//Representa a un cliente del cine.
public class Cliente {
    //Nombre del cliente
    public String Nombre;
    //Correo del cliente
    public String Correo;
    //Lista de reservas del cliente
    public List<Reserva> Reservas;
    
    //Constructor vacio
    public Cliente() {
    }

    public Cliente(String Nombre, String Correo, List<Reserva> Reservas) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Reservas = Reservas;
    }
    
    //Getters And Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public List<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(List<Reserva> Reservas) {
        this.Reservas = Reservas;
    }
}
