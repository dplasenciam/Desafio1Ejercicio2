package Entity;

public class Rectangulo {
    
    final String tipo = "rectangulo";
    private float base;
    private float altura;

    public Rectangulo(){
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getPerimetro() {
        return perimetro;
    }      
        
}
