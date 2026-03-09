public class Calculadora {
    private int numero1;
    private int numero2; 
    
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double realizarOperacion(String operacion) {
        switch (operacion) {
            case "+":
                return suma();
            case "-":
                return resta();
            default:
                throw new IllegalArgumentException("Operación no válida.");
        }
    }

    private int suma() {
        return numero1 + numero2;
    }
    
    private int resta() {
        return numero1 - numero2;
    }   
}
