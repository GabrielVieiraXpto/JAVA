/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoradeveiculos;
import javax.swing.JOptionPane;

public class VeiculoCarga extends Veiculo
{
    String tipodeCarga;
    float capacidade;
    char tamanho;
    boolean tracaoDupla;
    
    public void calculaValor(double margemLucro, double ipi, double icms, double cofins)
    {
        this.valorVenda=((custosProd+((custosProd*margemLucro)/100))+ipi+icms+cofins);
    }
     public void CadastroVeiculoCarga()
    {
        cadastroGeralVeiculo();
        calculaValor
        (
            Mensagens.entradaTratamentoMargemLucro(),
            Mensagens.entradaTratamentoIPI(),
            Mensagens.entradaTratamentoICMS(),
            Mensagens.entradaTratamentoCOFINS()
        ); 
        this.tipodeCarga=Mensagens.entradaTratamentoTipoCarga();
        this.capacidade=Mensagens.entradaTratamentoQtCapacidade();
        this.tamanho=Mensagens.escolherTamanhoVeiculo();
        this.tracaoDupla=Mensagens.escolherTracaoDupla();
    }
    public void apresentarDados()
    {
        JOptionPane.showMessageDialog
        (
            null, 
            "Veiculo de Carga Cadastrado\n\n"+
            "Marca: "+this.marca+
            "\nModelo: \t"+this.modelo+
            "\nCor: \t"+this.cor+
            "\nChassi: "+this.chassi+
            "\nAno: "+this.ano+
            "\nKm: "+this.km+
            
            "\nTipo de Carga: "+this.tipodeCarga+
            "\nCapacidade: "+this.capacidade+
            "\nTamanho: "+this.tamanho+
            "\nTracao Dupla: "+this.tracaoDupla+   
                
            "\n\nCustos de Produção: "+this.custosProd+
            "\nvalor da Venda: "+this.valorVenda     
        );
     }
     
}
