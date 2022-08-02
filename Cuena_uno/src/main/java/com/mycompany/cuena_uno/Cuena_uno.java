package com.mycompany.cuena_uno;

import java.util.Scanner;

public class Cuena_uno {
    public void Banco_GYT(){
        Cuenta_dos cuenta1 = new Cuenta_dos();
        Cuenta_dos cuenta2 = new Cuenta_dos();
        while ( true) {

            System.out.println("***************************");
            System.out.println("*|            MENU        |");
            System.out.println("*| 1. Mostrar Saldo       |");
            System.out.println("*| 2. Sumar               |");
            System.out.println("*| 3. Restar              |");
            System.out.println("*| 4. Salir               |");
            System.out.println("***************************");

            Scanner sp = new Scanner(System.in);
            
            int respuesta = sp.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println(cuenta1.getValor());
                    System.out.println(cuenta2.getValor());
                    break;
                case 2:
                    
                    Scanner sp1 = new Scanner(System.in);
                    System.out.println("¿A que cuenta desea sumar: 1 o 2 ?");
                    int resp_cuenta = sp1.nextInt();

                    if (resp_cuenta == 1) {
                        System.out.println("Ingres el valor a su cuenta uno");
                        cuenta1.getValor();
                    } else {
                       System.out.println("Ingres el valor a su cuenta dos");
                        cuenta2.getValor();               }
                    break;
                case 3:
                     Scanner sp2 = new Scanner(System.in);
                    System.out.println("¿A que cuenta desea sumar: 1 o 2 ?");
                    int dif = sp2.nextInt();

                    if (dif == 1) {
                        System.out.println("Ingres el valor a su cuenta uno");
                        cuenta1.setValor(cuenta1.getValor()-sp2.nextInt());
                    } else {
                       System.out.println("Ingres el valor a su cuenta dos");
                        cuenta2.setValor(sp2.nextInt());
                    }
                    break;
                    
                case 4:
                    System.exit(0);
                default:
                    throw new AssertionError();
                    
                  }
              }
            
            }
    public static void main(String[] args) {
        Cuena_uno saldo = new Cuena_uno();
        
        saldo.Banco_GYT();
        
        }
    }

    

          

