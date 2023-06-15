package Entity;

public class Rombo {
    
    final String tipo = "rombo";
    private float diagMayor;
    private float diagMenor;

    public Rombo(){
    }

    public Rombo(float diagMayor, float diagMenor) {
        this.diagMayor = diagMayor;
        this.diagMenor = diagMenor;
    }
    
    public void setDiagMayor(float diagMayor) {
        this.diagMayor = diagMayor;
    }

    public float getDiagMayor() {
        return diagMayor;
    }

    public void setDiagMenor(float diagMenor) {
        this.diagMenor = diagMenor;
    }

    public float getDiagMenor() {
        return DiagMenor;
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
