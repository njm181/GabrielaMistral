
package com.example.gabrielamistral.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Devocional {

    @SerializedName("0")
    @Expose
    private String _0;
    @SerializedName("1")
    @Expose
    private String _1;
    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("3")
    @Expose
    private String _3;
    @SerializedName("4")
    @Expose
    private String _4;
    @SerializedName("5")
    @Expose
    private String _5;
    @SerializedName("id")
    @Expose
    private String id;
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
    public Devocional() {
    }

    /**
     * 
     * @param descripcion
     * @param _0
     * @param _1
     * @param _2
     * @param subtitulo
     * @param _3
     * @param _4
     * @param _5
     * @param titulo
     * @param links
     * @param id
     * @param autor
     */
    public Devocional(String _0, String _1, String _2, String _3, String _4, String _5, String id, String autor, String titulo, String subtitulo, String descripcion, String links) {
        super();
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.links = links;
    }

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String get2() {
        return _2;
    }

    public void set2(String _2) {
        this._2 = _2;
    }

    public String get3() {
        return _3;
    }

    public void set3(String _3) {
        this._3 = _3;
    }

    public String get4() {
        return _4;
    }

    public void set4(String _4) {
        this._4 = _4;
    }

    public String get5() {
        return _5;
    }

    public void set5(String _5) {
        this._5 = _5;
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
