package exercicio1;
public class Exercicio1 {
    public static void main(String[] args) {
        Carro CR1 = new Carro();
        CR1.Modelo = "UNO";
        CR1.Fabricante = "FIAT";
        CR1.Tipo = "Carro";
        CR1.Cor = "Preto";
        CR1.Ano = "2017";
        CR1.Placa = "UNO-2017";
        CR1.setNumChassis("12QC34D5DS566D77Z");
        CR1.status();
        CR1.Janelas = true;
        CR1.Porta = 4;
        CR1.setPotenciaMotor(2.0f);
        CR1.statusCarro();
        CR1.statusGasolina();
        
        Moto M1 = new Moto();
        M1.Modelo = "CB 300 R";
        M1.Fabricante = "HONDA";
        M1.Tipo = "MOTO";
        M1.Cor = "Vermelho";
        M1.Ano = "2015";
        M1.Placa = "CBB-2015";
        M1.setNumChassis("11Q2345SS6DD7");
        M1.status();
        M1.setCilindradas(300);
        M1.statusMoto();
        
        Caminhão C1 = new Caminhão();
        C1.Modelo = "VW 24250";
        C1.Fabricante = "Volkswagen";
        C1.Tipo = "Caminhão";
        C1.Cor = "Branco";
        C1.Ano = "2010";
        C1.Placa = "CMN-2010";
        C1.setQuantEixo(4);
        C1.TipoTrabalho = "Transporte de Alimentos";
        C1.setNumChassis("123ASF3DR4567");
        C1.status();
        C1.statusCaminhão();
    }    
}