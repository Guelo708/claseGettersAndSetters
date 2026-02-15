package com.example;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(2000000);
        cuenta1.setNombre("Tania");
        cuenta1.setTipo("Ahorros");
        cuenta1.setIdCuenta(552261859);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setIdCuenta(12548562);
        cuenta2.setNombre("DAVID");
        cuenta2.setTipo("Corriente");
        cuenta2.setSaldo(20000);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        cuenta2.depositarDinero(50000000);
        System.out.println(cuenta2.toString());

        cuenta2.retirarDinero(49000000);    
        System.out.println(cuenta2.toString());

        cuenta1.depositarDinero(98000000);
        System.out.println(cuenta1.toString());


    }
}