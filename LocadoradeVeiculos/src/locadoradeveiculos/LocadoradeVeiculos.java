
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadoradeveiculos;
public class LocadoradeVeiculos 
{
    public static void main(String[] args) 
    {
        int conferir=0;
        int contador=0;
        String tipoVeiculo;
         
        Mensagens.abertura();
        while(conferir==0)
        {
            if(contador>0)
            {
               int novamente=Mensagens.escolherNovoVeiculo();
               if(novamente==1)
               {
                   Mensagens.finalizar();
               } 
            }
            tipoVeiculo=Mensagens.escolherTipoVeiculo();
            
            if(tipoVeiculo.contains("Passeio"))
            {
                VeiculoPasseio veiculo1=new VeiculoPasseio();
                veiculo1.cadastroVeiculoPasseio();
                veiculo1.apresentarDados();
                contador=contador+1;
            }
            else if(tipoVeiculo.contains("Carga"))
            {
                VeiculoCarga veiculo2=new VeiculoCarga();
                veiculo2.CadastroVeiculoCarga();
                veiculo2.apresentarDados();
                contador=contador+1;
            }
            else if (tipoVeiculo.contains("Sair"))
            {
                Mensagens.finalizar();
            }
        }    
    }    
}

