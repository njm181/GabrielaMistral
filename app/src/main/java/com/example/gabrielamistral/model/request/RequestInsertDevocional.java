
package com.example.gabrielamistral.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestInsertDevocional {

    @SerializedName("autor")
    @Expose
    private String autor;
    @SerializedName("titulo")
    @Expose
    private String titulo;
    @SerializedName("subtitulo")
    @Expose
    private String subtitulo;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("links")
    @Expose
    private String links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInsertDevocional() {
    }

    /**
     * 
     * @param descripcion
     * @param subtitulo
     * @param titulo
     * @param links
     * @param autor
     */
    public RequestInsertDevocional(String autor, String titulo, String subtitulo, String descripcion, String links) {
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.links = links;
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

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

}
