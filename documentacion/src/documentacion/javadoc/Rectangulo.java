package documentacion.javadoc;

public class Rectangulo {
	
    private double longitud;
    
    private double anchura;
    
   
    public Rectangulo(double longitud, double anchura) {
    	
        this.longitud = longitud;
        
        this.anchura = anchura;
    }
    
    public double calcularArea() {
    	
        return longitud * anchura;
    }
    
    public double calcularPerimetro() {
    	
        return 2 * (longitud + anchura);
    }
    
    public double getLongitud() {
    	
        return longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
   
    public double getAnchura() {
        return anchura;
    }
    
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
}
