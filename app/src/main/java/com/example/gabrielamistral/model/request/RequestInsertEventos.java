
package com.example.gabrielamistral.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestInsertEventos {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("seccion")
    @Expose
    private String seccion;
    @SerializedName("detalle")
    @Expose
    private String detalle;
    @SerializedName("localidad_barrio")
    @Expose
    private String localidadBarrio;
    @SerializedName("calle")
    @Expose
    private String calle;
    @SerializedName("altura")
    @Expose
    private Integer altura;
    @SerializedName("fecha_hora")
    @Expose
    private String fechaHora;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInsertEventos() {
    }

    /**
     * 
     * @param seccion
     * @param localidadBarrio
     * @param altura
     * @param fechaHora
     * @param calle
     * @param titulo
     * @param id
     * @param autor
     * @param detalle
     */
    public RequestInsertEventos(String id, String autor, String titulo, String seccion, String detalle, String localidadBarrio, String calle, Integer altura, String fechaHora) {
        super();
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.seccion = seccion;
        this.detalle = detalle;
        this.localidadBarrio = localidadBarrio;
        this.calle = calle;
        this.altura = altura;
        this.fechaHora = fechaHora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getLocalidadBarrio() {
        return localidadBarrio;
    }

    public void setLocalidadBarrio(String localidadBarrio) {
        this.localidadBarrio = localidadBarrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

}
