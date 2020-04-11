
package com.example.gabrielamistral.model.response;

import java.util.List;

import com.example.gabrielamistral.model.Evento;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAllEventos {

    @SerializedName("evento")
    @Expose
    private List<Evento> evento = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseAllEventos() {
    }

    /**
     * 
     * @param evento
     */
    public ResponseAllEventos(List<Evento> evento) {
        super();
        this.evento = evento;
    }

    public List<Evento> getEvento() {
        return evento;
    }

    public void setEvento(List<Evento> evento) {
        this.evento = evento;
    }

}
