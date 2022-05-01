/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoradeveiculos;
public class Veiculo 
{
   int id;
   String marca = new String();
   String modelo;
   String cor;
   long chassi;
   int ano;
   int km;
   double custosProd;
   double valorVenda;
   
   public void calculaCustoProd(double custo)
   {
        this.custosProd=custo+((custo*25)/100);
   }
   public void calculaValor(double margemLucro)
   {
        this.valorVenda=custosProd+((custosProd*margemLucro)/100);
   }
   public void cadastroGeralVeiculo()
   {
        this.marca=Mensagens.entradaTratamentoMarca();
        this.modelo=Mensagens.entradaTratamentoModelo();
        this.cor=Mensagens.entradaTratamentoCor();
        this.chassi=Mensagens.entradaTratamentoChassi();
        this.ano=ano=Mensagens.entradaTratamentoAno();
        this.km=Mensagens.entradaTratamentoKM();
       
        calculaCustoProd(Mensagens.entradaTratamentoCusto());
   }
}
