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
    
    Scanner leer = new Scanner(System.in);

    public Pentagono crearPentagono(){
        
        
        System.out.println("Digite valor Lado");
        float lado = leer.nextFloat();
        System.out.println("Digite valor Apotema");
        float apotema = leer.nextFloat();
        float perimetro = 5 *lado;
        Pentagono p1 = new Pentagono(lado, apotema, perimetro);
        return p1;
    } 
    
    public void calcularAreaPentagono(Pentagono p){
        float area;
        area = (p.getPerimetro() * p.getApotema()) /2;
        p.setArea(area);
    }
     
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
                t.setAltura(altura);
                break;
            }
        }
        
        return t;
          
    }

    public void calcularAreaTriangulo(Triangulo t){
        float area;
        area = (t.getAltura() * t.getBase())/2;
        t.setArea(area);
    }
    
    public float getAreaTriangulo(Triangulo t){
        return t.getArea();
    }


    public Circulo crearCirculo(){
        
        float radio;
        
        System.out.println("Usted está creando un circulo");
        Circulo circ = new Circulo();  
        while(true){
            System.out.print("Ingrese el radio: ");
            radio = leer.nextFloat();
            
            if (radio<0){
                System.out.println("Por favor ingrese un valor de radio positivo\nIntente nuevamente");
            } else{
                circ.setRadio(radio);
                break;
            }
        }       
        return circ;         
    }

    public void calcularAreaCirculo(Circulo circ){
        float area;
        area = Math.PI * Math.Pow(circ.getRadio(),2);
        circ.setArea(area);
    }
    
    public float getAreaCirculo(Circulo circ){
        return circ.getArea();
    }

    public void calcularPerimetroCirculo(Circulo circ){
        float perimetro;
        perimetro = 2* Math.PI * (circ.getRadio());
        circ.setPerimetro(perimetro);
    }
    
    public float getPerimetroCirculo(Circulo circ){
        return circ.getPerimetro();
    }
    

    
    public float getAreaPentagono(Pentagono p){
        return p.getArea();
    }


public Rectangulo crearRectangulo(){
        
        float base;
	float altura;
        
        System.out.println("Usted está creando un rectángulo");
        Rectangulo rect = new Rectangulo();  
        while(true){
            System.out.print("Ingrese la base: ");
            base = leer.nextFloat();
            
            if (base<=0){
                System.out.println("Por favor ingrese un valor positivo para la base\nIntente nuevamente");
            } else{
                rect.setBase(base);
                break;
            }
        }
        while(true){
            System.out.print("Ingrese la altura: ");
            altura = leer.nextFloat();
            
            if (altura<=0){
                System.out.println("Por favor ingrese un valor positivo para la altura\nIntente nuevamente");
            } else{
                rect.setBase(base);
                break;
            }
        }
       
        return rect;         
    }

    public void calcularAreaRectangulo(Rectangulo rect){
        float area;
        area = (rect.getBase())*(rect.getAltura());
        rect.setArea(area);
    }
    
    public float getAreaRectangulo(Rectangulo rect){
        return rect.getArea();
    }

    public void calcularPerimetroRectangulo(Rectangulo rect){
        float perimetro;
        perimetro = 2*(rect.getBase()+rect.getAltura());
        rect.setPerimetro(perimetro);
    }
    
    public float getPerimetroRectangulo(Rectangulo rect){
        return rect.getPerimetro();
    }    


public Rombo crearRombo(){
        
        float diagMayor;
	float diagMenor;
        
        System.out.println("Usted está creando un rombo");
        Rombo rom = new Rombo();  
        while(true){
            System.out.print("Ingrese la diagonal mayor: ");
            diagMayor = leer.nextFloat();
            
            if (diagMayor<=0){
                System.out.println("Por favor ingrese un valor positivo para la diagonal mayor\nIntente nuevamente");
            } else{
                rom.setDiagMayor(diagMayor);
                break;
            }
        }
        while(true){
            System.out.print("Ingrese la diagonal menor: ");
            diagMenor = leer.nextFloat();
            
            if (diagMenor<=0){
                System.out.println("Por favor ingrese un valor positivo para la diagonal menor\nIntente nuevamente");
            } else{
                rom.setDiagMenor(diagMenor);
                break;
            }
        }
       
        return rom;         
    }

    public void calcularAreaRombo(Rombo rom){
        float area;
        area = (rom.getDiagMayor())*(rom.getDiagMenor())/2;
        rom.setArea(area);
    }
    
    public float getAreaRombo(Rombo rom){
        return rom.getArea();
    }

    public void calcularPerimetroRombo(Rombo rom){
        float a, b, c, perimetro;
	a = (rom.getDiagMayor())/2;
	b = (rom.getDiagMenor())/2;
	c = Math.Pow((Math.Pow(a,2) + Math.Pow(b,2)),0.5)
        perimetro = 4*c;
        rom.setPerimetro(perimetro);
    }
    
    public float getPerimetroRombo(Rombo rom){
        return rom.getPerimetro();
    }	

	
}
