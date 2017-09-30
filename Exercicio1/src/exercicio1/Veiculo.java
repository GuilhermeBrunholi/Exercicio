package exercicio1;
public abstract class Veiculo {
    
    public String Modelo;
    public String Fabricante;
    public String Tipo;
    public String Cor;
    public String Ano;
    protected String Placa;
    private String NumChassis;
    public boolean Inicio;
    
    private float StatusGasolina;
    private float Quant;
    
    public void status(){
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Fabricante: " + this.Fabricante);
        System.out.println("Tipo: " + this.Tipo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Ano: " + this.Ano);
        System.out.println("Placa: " + this.Placa);
        System.out.println("Numero Do Chassis: " + this.getNumChassis());
        System.out.println("O veiculos está andando? " + this.andando());
        System.out.println("Motor está funcionando? " + this.statusMotor());
        System.out.println("Quantidade de gasolina: " + this.statusGasolina());
    }
    
    public void Veiculo(String NC){
        this.setNumChassis(NC);
    }
    
    public String getNumChassis() {
        return this.NumChassis;
    }

    public void setNumChassis(String NumChassis) {
        this.NumChassis = NumChassis;
    }
    
    public boolean statusMotor(){
        return true;
    }
    
    public boolean andando(){
        return true;
    }
    
    public boolean statusGasolina(){
        return true;
    }    
    
}
    
    