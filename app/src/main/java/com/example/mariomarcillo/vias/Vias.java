package com.example.mariomarcillo.vias;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vias {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("identificador")
    @Expose
    private String identificador;
    @SerializedName("longitudafirmado")
    @Expose
    private String longitudafirmado;
    @SerializedName("longitudpavimento")
    @Expose
    private String longitudpavimento;
    @SerializedName("longitudvia")
    @Expose
    private String longitudvia;
    @SerializedName("muncipio")
    @Expose
    private String muncipio;
    @SerializedName("nombrevia")
    @Expose
    private String nombrevia;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLongitudafirmado() {
        return longitudafirmado;
    }

    public void setLongitudafirmado(String longitudafirmado) {
        this.longitudafirmado = longitudafirmado;
    }

    public String getLongitudpavimento() {
        return longitudpavimento;
    }

    public void setLongitudpavimento(String longitudpavimento) {
        this.longitudpavimento = longitudpavimento;
    }

    public String getLongitudvia() {
        return longitudvia;
    }

    public void setLongitudvia(String longitudvia) {
        this.longitudvia = longitudvia;
    }

    public String getMuncipio() {
        return muncipio;
    }

    public void setMuncipio(String muncipio) {
        this.muncipio = muncipio;
    }

    public String getNombrevia() {
        return nombrevia;
    }

    public void setNombrevia(String nombrevia) {
        this.nombrevia = nombrevia;
    }
}
