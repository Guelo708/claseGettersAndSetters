package com.example;

public class Cuenta {
    private int saldo;
    private int idCuenta;
    private String nombre;
    private String tipo;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;

    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return "Nombre: " + nombre + ", mi cuenta es: " + idCuenta + ",  es de tipo: " + tipo + ", mi saldo es: "
                + saldo;
    }
    public void depositarDinero(int deposito){
        
        if ((saldo + deposito) > 100000000){
            System.out.println("Transacción inválida");
        }
        else{
            saldo += deposito;
        }

    }

    public void retirarDinero(int retiro){
        saldo -= retiro;
    }

}
