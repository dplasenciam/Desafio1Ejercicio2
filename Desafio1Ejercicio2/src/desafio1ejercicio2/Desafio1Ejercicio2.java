/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1ejercicio2;
import Entity.*;
import Service.FigurasService;
import java.util.Scanner;


/**
 *
 * @author Daniel Plasencia
 */
public class Desafio1Ejercicio2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        int ele;
        FigurasService fs = new FigurasService();
        
        while(true){
            System.out.println("Elija una figura");
            System.out.println("1.Triangulo\n2.Pentagano");
            ele = leer.nextInt();
            switch(ele){
                case 1:
                    Triangulo t = fs.crearTriangulo();
                    fs.calcularAreaTriangulo(t);
                    System.out.println("El area del triangulo es "+fs.getAreaTriangulo(t));
                    break;
                case 2:
                    Pentagono p = fs.crearPentagono();
                    fs.calcularAreaPentagono(p);
                    System.out.println("El area del pentagono es "+fs.getAreaPentagono(p));
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta!!\n");
            }
        }
        
        
        
    }
    
}
