package Entity;

public class Circulo {
    
    private float radio;
    final String tipo = "circulo";

    public Circulo(){
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
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
