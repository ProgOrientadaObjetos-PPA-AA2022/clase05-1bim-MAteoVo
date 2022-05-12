/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        String hood;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del barrio");
        hood = sc.nextLine();
        Barrio br = new Barrio(hood);
        System.out.println("Ingrese el nombre de la persona: ");
        String nom = sc.nextLine();
        System.out.println("Ingrese numero de cedula: ");
        String ced = sc.nextLine();
        Persona pr = new Persona(nom,ced,br);
        System.out.printf("%s\n", pr);
    }
}
