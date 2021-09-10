package Infordata;

import Reseteable.Reseteable;

public class Impresora extends Producto implements Reseteable {
    private int velocidad;

    public Impresora(String codigo, String modelo, int velocidad){
        super(codigo, modelo);
this.velocidad=velocidad;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresora : " +
                "Velocidad=" + velocidad +
                ", Codigo='" + codigo + '\'' +
                ", Modelo='" + modelo + '\'';
    }

    @Override
    public void estado() {
        System.out.println("Paginas Impresas:;" +2000);
    }

    @Override
    public void reset() {
        System.out.println("Reseteando impresora");
    }

}
