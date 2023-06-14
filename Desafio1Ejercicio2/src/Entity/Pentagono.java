/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author drome
 */
public class Pentagono {
    final String tipo = "pentagono";
    private float apotema;
    private float perimetro;
    private float lado;

    public Pentagono() {
    }

    public Pentagono(float apotema, float perimetro, float lado) {
        this.apotema = apotema;
        this.perimetro = perimetro;
        this.lado = lado;
    }
    
    
    
    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
    
    
    
    
    
    
}
