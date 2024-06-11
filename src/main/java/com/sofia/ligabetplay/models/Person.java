package com.sofia.ligabetplay.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
@Inheritance(strategy=InheritanceType.JOINED) //la estrategia de herencia
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // atributos
    private int id;
    private String nombre;
    private String nacionalidad;
    private String rol; // mas bien enum (tecnico, medico o jugador)


    //relaciones
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    
    //constructores
    public Person(){
    }

    public Person(String nombre, String nacionalidad, String rol){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rol = rol;
    }

    // getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}
