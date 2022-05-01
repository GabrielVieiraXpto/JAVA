/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoradeveiculos;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
 public final class Mensagens 
{
    static void abertura()
    {
        JOptionPane.showMessageDialog(null, "Cadastro de Veiculos");
    }
    static void finalizar()
    {
        JOptionPane.showMessageDialog(null, "Cadastro Finalizado");
        System.exit(0);
    }
    static void erro()
    {
        JOptionPane.showMessageDialog(null, "Texto Digitado Incorretamente, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    static int escolherNovoVeiculo()
    {
        int escolha = JOptionPane.showConfirmDialog(null,"Cadastrar um novo veiculo?", "Escolha um",JOptionPane.YES_NO_OPTION);
        
        if(escolha !=0&&escolha!=1)
        {
            Mensagens.finalizar();
        }
        return escolha;
    }
    static String escolherTipoVeiculo()
    {
        Object[] tamanhos = { "Passeio", "Carga", "Sair" }; 
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha o tipo de veiculo: ", "veiculos", JOptionPane.INFORMATION_MESSAGE, null, tamanhos, tamanhos [0]);
        
        if(tamanhos[0] !=selectedValue &&tamanhos[1] !=selectedValue&&tamanhos[2] !=selectedValue )
        {
            Mensagens.finalizar();
        }
        String escolha=String.valueOf(selectedValue);
        return escolha;
    }
    static char escolherTamanhoVeiculo()
    {
        char tamanho='1';
        try
        {
            Object[] tamanhos = { 'P', 'M', 'G' }; 
            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha o tamanho do veiculo", "tamanhos", JOptionPane.INFORMATION_MESSAGE, null, tamanhos, tamanhos [0]);
            tamanho =(char)selectedValue;
        }
        catch(RuntimeException x)
        {
            finalizar();
        }
        return tamanho;
    }
    static boolean escolherTracaoDupla()
    {
        String verificador;          
        int escolha =JOptionPane.showConfirmDialog(null,"O veiculo Possui tração Dupla?", "Escolha um",JOptionPane.YES_NO_OPTION);  
        verificador=String.valueOf(escolha);
            
        if(verificador.contains("-1"))
        {
            finalizar();
        }
        boolean tracaoDupla=false;
        
        if(escolha==0)
        {
            tracaoDupla=true;
        }    
        return tracaoDupla;
    }
    static String entradaTratamentoMarca()
    {
        int conferir=0;
        String marca=new String();
        
        while(conferir==0)
        {
            marca=JOptionPane.showInputDialog(null,"Digite a marca: "); 
            
            if(marca==null)
            {
                finalizar();
            }
            else if(marca.isEmpty())
            {
                erro();
            } 
            else 
            {
                conferir=1;
            }
        }
        return marca;
    }
    static String entradaTratamentoModelo()
    {
        int conferir=0;
        String modelo=new String();
        
        while(conferir==0)
        {
            modelo=JOptionPane.showInputDialog(null,"Digite o modelo: ");
            
            if(modelo==null)
            {
                finalizar();
            }
            else if(modelo.isEmpty())
            {
                erro();
            }
            else 
            {
                conferir=1;
            }
        }
        return modelo;
    }
    static String entradaTratamentoCor()
    {
        int conferir=0;
        String cor=new String();
        
        while(conferir==0)
        {
            cor=JOptionPane.showInputDialog(null,"Digite a cor: ");
            if(cor==null)
            {
                finalizar();
            }
            else if(cor.isEmpty())
            {
                erro();
            }
            else 
            {
                conferir=1;
            }
        }
        return cor;
    }
    static long entradaTratamentoChassi()
    {
        int conferir=0;
        String escolha;
        long chassi=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o chassi: ");
                if(escolha==null)
                {
                    finalizar();
                }
                chassi=Long.parseLong(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return chassi;
    }
    static int entradaTratamentoAno()
    {
        int conferir=0;
        String escolha;
        int ano=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o ano: ");
                if(escolha==null)
                {
                    finalizar();
                }
                ano=Integer.parseInt(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return ano;
    }
    static int entradaTratamentoKM()
    {
        int conferir=0;
        String escolha;
        int km=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite km: ");
                if(escolha==null)
                {
                    finalizar();
                }
                km=Integer.parseInt(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return km;
    }
    static double entradaTratamentoCusto()
    {
        int conferir=0;
        String escolha;
        double custo=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o custo: ");
                if(escolha==null)
                {
                    finalizar();
                }
                custo = Double.parseDouble(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return custo;
    }
    static double entradaTratamentoMargemLucro()
    {
        int conferir=0;
        String escolha;
        double margemLucro=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o valor percentual da margem de lucro: ");
                if(escolha==null)
                {
                    finalizar();
                }
                margemLucro = Double.parseDouble(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return margemLucro;
    }
    static double entradaTratamentoIPI()
    {
        int conferir=0;
        String escolha;
        double ipi=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o valor do IPI: ");
                if(escolha==null)
                {
                    finalizar();
                }
                ipi = Double.parseDouble(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return ipi;
    }
    static double entradaTratamentoICMS()
    {
        int conferir=0;
        String escolha;
        double icms=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o valor do ICMS: ");
                if(escolha==null)
                {
                    finalizar();
                }
                icms = Double.parseDouble(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return icms;
    }
    static double entradaTratamentoCOFINS()
    {
        int conferir=0;
        String escolha;
        double cofins=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite o valor do COFINS: ");
                if(escolha==null)
                {
                    finalizar();
                }
                cofins = Double.parseDouble(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return cofins;
    }
    static int entradaTratamentoQtLugares()
    {
        int conferir=0;
        String escolha;
        int lugares=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite a quantidade de lugares: ");
                if(escolha==null)
                {
                    finalizar();
                }
                lugares = Integer.parseInt(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return lugares;
    }
    static int entradaTratamentoQtPortas()
    {
        int conferir=0;
        String escolha;
        int portas=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite a quantidade de portas: ");
                if(escolha==null)
                {
                    finalizar();
                }
                portas = Integer.parseInt(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return portas;
    }
    static String entradaTratamentoTipoCarga()
    {
        int conferir=0;
        String tipoCarga=new String();
        
        while(conferir==0)
        {
            tipoCarga=JOptionPane.showInputDialog(null,"Digite o tipo de carga: ");
            if(tipoCarga==null)
            {
                finalizar();
            }
            else if(tipoCarga.isEmpty())
            {
                erro();
            }
            else 
            {
            conferir=1;
            }
        }
        return tipoCarga;
    }
    static float entradaTratamentoQtCapacidade()
    {
        int conferir=0;
        String escolha;
        float capacidade=0;

        while( conferir==0)
        {
           try
            {
                escolha=JOptionPane.showInputDialog(null,"Digite a capacidade: ");
                if(escolha==null)
                {
                    finalizar();
                }
                capacidade = Float.parseFloat(escolha);
                conferir=1;
            }
            catch( RuntimeException x)
            {
                erro();
            }
        } 
        return capacidade;
    }
}
