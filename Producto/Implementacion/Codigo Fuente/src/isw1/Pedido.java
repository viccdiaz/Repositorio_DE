/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;

import java.io.Serializable;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author fran9
 */
public class Pedido implements Serializable
{
    
 private String barrio;   
 private String calle;   
 private String numeroCalle;   
 private String depto;   
 private String piso;   
 private Date fechaPedido;
 private Time horaEntrega;
 private Date fechaEntrega;
 private String nombreApellidoTarjeta;
 private String numeroTarjeta;
 private String codigoTarjeta;
 private String fechaVencimientoTarjeta;
 private String formaPago;
 private String formaEntrega;
 private String total;
 private int numeroPedido;
 
 public Pedido(){}
 public Pedido(String barrio,String calle,String numeroCalle, String depto, String piso,String total)
 {
     this.barrio =barrio;
     this.calle=calle;
     this.numeroCalle=numeroCalle;
     this.depto=depto;
     this.piso=piso;
     this.total=total;
 }
 public Pedido(String nom,String num,String cod, String fec,String total)
 {
     this.nombreApellidoTarjeta=nom;
     this.numeroTarjeta=num;
     this.codigoTarjeta=cod;
     this.fechaVencimientoTarjeta=fec;
     this.total=total;
 }
 public Pedido(String total)
 {
     this.total= total;
 }
 
 

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombreApellidoTarjeta() {
        return nombreApellidoTarjeta;
    }

    public void setNombreApellidoTarjeta(String nombreApellidoTarjeta) {
        this.nombreApellidoTarjeta = nombreApellidoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(String codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }

    public void setFechaVencimientoTarjeta(String fechaVencimientoTarjeta) {
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
 

   

   
 
 
 
}
