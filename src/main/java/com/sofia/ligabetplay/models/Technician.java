package com.sofia.ligabetplay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="technician")
@PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
public class Technician extends Person{ 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //atributos
    private int id;
    private String especialidad;

    //constructores

    public Technician(){
    }
    
    public Technician(String nombre, String nacionalidad, String especialidad){
        super(nombre, nacionalidad, "c/Tecnico");
        this.especialidad = especialidad;
    }

    //getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    
}
