package exercicio1;
public class Moto extends Veiculo {
    
    private int Cilindradas;
    
    public void statusMoto(){
        System.out.println("Cilindradas do Motor: " + this.getCilindradas() + "CC");
        System.out.println("Está empinando ? " + this.empina());
        System.out.println("");
    }

    public int getCilindradas() {
        return this.Cilindradas;
    }

    public void setCilindradas(int Cilindradas) {
        this.Cilindradas = Cilindradas;
    }
    
    public boolean empina(){
        return true;
    }
}