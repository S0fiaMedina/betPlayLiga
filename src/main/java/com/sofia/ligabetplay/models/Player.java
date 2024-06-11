package com.sofia.ligabetplay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
@PrimaryKeyJoinColumn(name="id", referencedColumnName="id")
public class Player extends Person{ //que extiende de persona

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Atributos
    private int id;
    private int dorsal;
    private int golesAnotados;
    private int tarjetasRojas;
    private int tarjetasAmarillas;
    private String posicion;

    //constructores
    public Player(){

    }

    public Player(String nombre, String nacionalidad, int dorsal, String posicion){
        super(nombre, nacionalidad, "Jugador");
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    // getters y setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public int getGolesAnotados() {
        return golesAnotados;
    }
    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
 
}
