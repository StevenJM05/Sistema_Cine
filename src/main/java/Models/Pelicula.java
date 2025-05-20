/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author steve
 */

//Representa cada película disponible en el cine
public class Pelicula {
    
    //El titulo de la pelicula
    public String Titulo;
    //Duracion de la pelicula
    public String Duracion;
    //Clasificacion de la pelicula por edad
    public String Clasificacion;
    //Genero al que pertenece la pelicula
    public String Genero;
    
    //Constructor vacio 
    public Pelicula() {
    }

    public Pelicula(String Titulo, String Duracion, String Clasificacion, String Genero) {
        this.Titulo = Titulo;
        this.Duracion = Duracion;
        this.Clasificacion = Clasificacion;
        this.Genero = Genero;
    }
    //Metodos
    
    //Get and Setters
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
