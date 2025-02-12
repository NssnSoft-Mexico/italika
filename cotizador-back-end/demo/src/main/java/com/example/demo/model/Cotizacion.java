package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Cotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
     @JsonProperty("costo_total")
    private Double costo_total;

    @JsonProperty("fecha_cotizacion")
    private String fecha_cotizacion;

    @JsonProperty("monto_enganche")
    private Double monto_enganche;

    @JsonProperty("costo_con_iva")
    private Double costo_con_iva;

    @JsonProperty("costo_sin_iva")
    private Double costo_sin_iva;

    @JsonProperty("tasa_credito")
    private Double tasa_credito;
    

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCostoTotal() {
        return costo_total;
    }

    public void setCostoTotal(Double costo_total) {
        this.costo_total = costo_total;
    }

    public String getFechaCotizacion() {
        return fecha_cotizacion;
    }

    public void setFechaCotizacion(String fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public Double getMontoEnganche() {
        return monto_enganche;
    }

    public void setMontoEnganche(Double monto_enganche) {
        this.monto_enganche = monto_enganche;
    }

    public Double getCostoConIva() {
        return costo_con_iva;
    }

    public void setCostoConIva(Double costo_con_iva) {
        this.costo_con_iva = costo_con_iva;
    }

    public Double getCostoSinIva() {
        return costo_sin_iva;
    }

    public void setCostoSinIva(Double costo_sin_iva) {
        this.costo_sin_iva = costo_sin_iva;
    }

    public Double getTasaCredito() {
        return tasa_credito;
    }

    public void setTasaCredito(Double tasa_credito) {
        this.tasa_credito = tasa_credito;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "id=" + id +
                ", costo_total=" + costo_total +
                ", fecha_cotizacion='" + fecha_cotizacion + '\'' +
                ", monto_enganche=" + monto_enganche +
                ", costo_con_iva=" + costo_con_iva +
                ", costo_sin_iva=" + costo_sin_iva +
                ", tasa_credito=" + tasa_credito +
                '}';
    }
}