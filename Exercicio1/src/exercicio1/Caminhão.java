package exercicio1;
public class Caminhão extends Carro{
    private int QuantEixo;
    public String TipoTrabalho;
    
    public void statusCaminhão(){
        System.out.println("Quantidade de Eixo: " + this.getQuantEixo());
        System.out.println("Tipo de trabalho: " + this.getTipoTrabalho());
        System.out.println("Tem engate? " + this.engatado());
        System.out.println("");
    }

    public int getQuantEixo() {
        return this.QuantEixo;
    }

    public void setQuantEixo(int QuantEixo) {
        this.QuantEixo = QuantEixo;
    }

    public String getTipoTrabalho() {
        return this.TipoTrabalho;
    }

    public void setTipoTrabalho(String TipoTrabalho) {
        this.TipoTrabalho = TipoTrabalho;
    }
    
    public boolean engatado(){
        return true;
    }
}

