package Infordata;

import java.util.Date;

public class Tecnologico extends Producto {
    protected String paisOrigen;
    protected Date fechaFabricacion;
    protected Empresa fabricante;
   public  Tecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante){
       super(codigo, modelo);
       this.paisOrigen = paisOrigen;
       this.setFechaFabricacion(fechaFabricacion);
       this.setFabricante(fabricante);

   }
   public String getPaisOrigen(){
       return paisOrigen;
   }
   public void setPaisOrigen(String peloOrigen){
       this.paisOrigen = peloOrigen;
   }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }
}