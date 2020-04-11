
package com.example.gabrielamistral.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Evento {

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
    @SerializedName("6")
    @Expose
    private String _6;
    @SerializedName("7")
    @Expose
    private String _7;
    @SerializedName("8")
    @Expose
    private String _8;
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
    public Evento() {
    }

    /**
     * 
     * @param fechaHora
     * @param calle
     * @param titulo
     * @param autor
     * @param detalle
     * @param _0
     * @param seccion
     * @param _1
     * @param _2
     * @param _3
     * @param localidadBarrio
     * @param _4
     * @param altura
     * @param _5
     * @param _6
     * @param _7
     * @param _8
     * @param id
     */
    public Evento(String _0, String _1, String _2, String _3, String _4, String _5, String _6, String _7, String _8, String id, String autor, String titulo, String seccion, String detalle, String localidadBarrio, String calle, Integer altura, String fechaHora) {
        super();
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
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

    public String get6() {
        return _6;
    }

    public void set6(String _6) {
        this._6 = _6;
    }

    public String get7() {
        return _7;
    }

    public void set7(String _7) {
        this._7 = _7;
    }

    public String get8() {
        return _8;
    }

    public void set8(String _8) {
        this._8 = _8;
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
