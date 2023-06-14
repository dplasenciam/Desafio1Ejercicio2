/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.util.Scanner;
import Entity.Pentagono;
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
    
}
