public class Repetição
{   
    public static void main(String[] args) 
    {
        int x=13, z=8;

        //Do...While executa a menos 1 vez a repetição e valida a condição no final
        do
        {
            System.out.println("Você não tem permissão para entrar ainda");
                x++;
        }
        while(x<10);

        //for vai executar ate a condição ser diferente de forma finita
        for(int i = 0; i<10; i++)
        {
            System.out.println("Valor:"+i);
        }
         
        //while é uma estrutura de repetição simples vai validar e executar, se for falso não entra nenhuma vez
        while(z<10)
        {
            System.out.println("Você não tem permissão para entrar ainda");
                z++;
        }
    }

}