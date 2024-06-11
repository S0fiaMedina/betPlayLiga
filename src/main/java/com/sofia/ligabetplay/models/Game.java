package com.sofia.ligabetplay.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // atributos
    private  int id;
    private Date fecha;
    private int puntajeLocal;
    private int puntajeVisitante;

    // relaciones
    @ManyToOne
    @JoinColumn(name = "id_equipo_local")
    private Team local;

    @ManyToOne
    @JoinColumn(name = "id_equipo_visitante")
    private Team visitante;


    //constructores
    public Game(){
    }

    public Game(Team local, Team  visitante, int puntajeLocal, int puntajeVisitante, Date fecha){
        this.local = local;
        this.puntajeLocal = puntajeLocal;
        this.visitante = visitante;
        this.puntajeVisitante = puntajeVisitante;
        this.fecha = fecha;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntajeLocal() {
        return puntajeLocal;
    }

    public void setPuntajeLocal(int puntajeLocal) {
        this.puntajeLocal = puntajeLocal;
    }

    public int getPuntajeVisitante() {
        return puntajeVisitante;
    }

    public void setPuntajeVisitante(int puntajeVisitante) {
        this.puntajeVisitante = puntajeVisitante;
    }

    public Team getLocal() {
        return local;
    }

    public void setLocal(Team local) {
        this.local = local;
    }

    public Team getVisitante() {
        return visitante;
    }

    public void setVisitante(Team visitante) {
        this.visitante = visitante;
    }

    
    
}
