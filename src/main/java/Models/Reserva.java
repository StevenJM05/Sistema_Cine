/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author steve
 */
//Contiene la información necesaria para vincular al cliente con la función y los asientos
//reservados.
public class Reserva {
    //El cliente que hizo la reserva
    public Cliente Cliente;
    //La funcion que desea el cliente
    public Funcion Funcion;
    //Los asientos que reservo el cliente
    public int NumeroAsientos;

    //Constructor Vacio
    public Reserva() {
    }

    public Reserva(Cliente Cliente, Funcion Funcion, int NumeroAsientos) {
        this.Cliente = Cliente;
        this.Funcion = Funcion;
        this.NumeroAsientos = NumeroAsientos;
    }
    
    //Setters and Getters
    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Funcion getFuncion() {
        return Funcion;
    }

    public void setFuncion(Funcion Funcion) {
        this.Funcion = Funcion;
    }

    public int getNumeroAsientos() {
        return NumeroAsientos;
    }

    public void setNumeroAsientos(int NumeroAsientos) {
        this.NumeroAsientos = NumeroAsientos;
    }
}
