package exercicio1;
public class Carro extends Veiculo{
    public int Porta;
    public boolean Janelas;
    private float PotenciaMotor;
    
    public void statusCarro(){
        System.out.println("Tem porta aberta? " + this.Porta);
        System.out.println("Tem alguma janela aberta? " + this.Janelas);
        System.out.println("Potentia do motor: " + this.getPotenciaMotor());
        System.out.println("");
    }

    public int getPorta() {
        return this.Porta;
    }

    public void setPorta(int Porta) {
        this.Porta = Porta;
    }

    public boolean getJanelas() {
        return this.Janelas;
    }

    public void setJanelas(boolean Janelas) {
        this.Janelas = Janelas;
    }

    public float getPotenciaMotor() {
        return this.PotenciaMotor;
    }

    public void setPotenciaMotor(float PotenciaMotor) {
        this.PotenciaMotor = PotenciaMotor;
    }
    
}

