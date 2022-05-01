/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoradeveiculos;
import javax.swing.JOptionPane;

public class VeiculoPasseio extends Veiculo
{
    int qtLugares;
    int qtPortas;
    
    public void calculaValor(double margemLucro, double ipi, double icms)
    {
        this.valorVenda=((custosProd+((custosProd*margemLucro)/100))+ipi+icms);
    }
     public void cadastroVeiculoPasseio()
    {
        cadastroGeralVeiculo();
        calculaValor
        (
            Mensagens.entradaTratamentoMargemLucro(),
            Mensagens.entradaTratamentoIPI(),
            Mensagens.entradaTratamentoICMS()
        );
        this.qtLugares=Mensagens.entradaTratamentoQtLugares();
        this.qtPortas=Mensagens.entradaTratamentoQtPortas();
    }  
    public void apresentarDados()
    {
         JOptionPane.showMessageDialog
        (
            null, 
            "Veiculo de Passeio Cadastrado\n\n "+ 
            "Marca: "+this.marca+
            "\nModelo: "+this.modelo+
            "\nCor: "+this.cor+
            "\nChassi: "+this.chassi+
            "\nAno: "+this.ano+
            "\nKm: "+this.km+
            
            "\nQuantidade de Lugares: "+this.qtLugares+
            "\nQuantidade de Portas: "+this.qtPortas+
              
            "\n\nCustos de Produção: "+this.custosProd+
            "\nvalor da Venda: "+this.valorVenda 
            
         );
    }
     
}
