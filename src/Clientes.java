/*
RAFAEL SILVA DE PAULA - SENAC FRANCA
 */
public class Clientes {

    public static void main(String[] args) {

        String Cliente1 = "RAFAEL SILVA DE PAULA";
        String Cliente2 = "PEDRO LUCAS ARAÚJO";
        String Cliente3 = " HUGO GABRIEL DE CASTRO";


        int anoDeNascimentoRafael= 1988 ;
        int anoDeNascimentoPedro= 1996;
        int anoDeNascimentoHugo= 2010;


        int idadeRafael = (2024-anoDeNascimentoRafael);
        int idadePedro = (2024 -anoDeNascimentoPedro);
        int idadeHugo =(2024 -anoDeNascimentoHugo);

        System.out.println("\n\n\n\n\n---Listagem dos Clientes--- ");
        System.out.println("________________________________________\n");
        System.out.println("Nome: " + Cliente1 + "\n");
        System.out.println("Ano de Nascimento: " + anoDeNascimentoRafael);
        System.out.println("________________________________________");
        System.out.println("\nNome: " + Cliente2 + "\n");
        System.out.println("Ano de Nascimento: " + anoDeNascimentoPedro);
        System.out.println("\nNome: " + Cliente3 + "\n");
        System.out.println("Ano de Nascimento: " + anoDeNascimentoHugo + "\n\n\n");

        if (idadeRafael >= 60)
        {
            System.out.println("A Característica Etária do " +Cliente1 +  " é IDOSO");
        }
        else if (idadeRafael >= 30 && idadeRafael <= 59)
        {
            System.out.println("A Característica Etária do "+Cliente1 + " é ADULTO");
        }
        else if (idadeRafael >= 18 && idadeRafael <= 29)
        {
            System.out.println("A Característica Etária do " +Cliente1 + " é JOVEM");
        }
        else
        {
            System.out.println("A Característica Etária do " +Cliente1 + "ADOLESCENTE\n\n\n");
        }

        if (idadePedro >= 60)
        {
            System.out.println("A Característica Etária do " +Cliente2 +  " é IDOSO");
        }
        else if (idadePedro >= 30 && idadePedro <= 59)
        {
            System.out.println("A Característica Etária do "+Cliente2 + " é ADULTO");
        }
        else if (idadePedro >= 18 && idadePedro <= 29)
        {
            System.out.println("A Característica Etária do " +Cliente2 + " é JOVEM");
        }
        else
        {
            System.out.println("A Característica Etária do " +Cliente2 + "  ADOLESCENTE\n\n\n");
        }

        if (idadeHugo >= 60)
        {
            System.out.println("A Característica Etária do " +Cliente3 +  " é IDOSO");
        }
        else if (idadeHugo >= 30 && idadeHugo <= 59)
        {
            System.out.println("A Característica Etária do "+Cliente3 + " é ADULTO");
        }
        else if (idadeHugo >= 18 && idadeHugo <= 29)
        {
            System.out.println("A Característica Etária do " +Cliente3 + " é JOVEM");
        }
        else
        {
            System.out.println("A Característica Etária do " +Cliente3 + "  ADOLESCENTE\n\n\n");
        }





/*
Regra de negócio
Classificação etária
Se idade <= 17 então "ADOLESCENTE"
Se idade >= 18 E idade <=29 então "JOVEM"
Se idade >=30 E idade <=59 então "ADULTO"
Se idade >= 60 então "IDOSO"
 */

    }

}