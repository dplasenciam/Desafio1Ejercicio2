/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entity.Pentagono;
import Entity.Triangulo;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Daniel Plasencia
 */
public class FigurasService {
    

    public Pentagono crearPentagono(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite valor Lado");
        float lado = leer.nextFloat();
        System.out.println("Digite valor Apotema");
        float apotema = leer.nextFloat();
        float perimetro = 6 *lado;
        Pentagono p1 = new Pentagono(lado, apotema, perimetro);
        return p1;
    } 
    

    Scanner leer = new Scanner(System.in);
    
    public Triangulo crearTriangulo(){
        
        float base,altura;
        
        System.out.println("Usted está creando un triangulo");
        Triangulo t = new Triangulo();  
        while(true){
            System.out.print("Ingrese la base: ");
            base = leer.nextFloat();
            
            if (base<0){
                System.out.println("Usted no ingreso una base mayor a 0\nIntente de nuevo");
            } else{
                t.setBase(base);
                break;
            }
        }
        while(true){
            System.out.print("Ingrese la altura: ");
            altura = leer.nextFloat();
            
            if (altura<0){
                System.out.println("Usted no ingreso una altura mayor a 0\nIntente de nuevo");
            } else{
                t.setBase(base);
                break;
            }
        }
        
        return t;
          
    }

    public void calcularAreaTriangulo(Triangulo t){
        float area;
        area = t.getAltura()*t.getBase();
        t.setArea(area);
    }
    
    public float getAreaTriangulo(Triangulo t){
        return t.getArea();
    }

}
