import java.util.Scanner;


    public class Contador {
    public static void main(String[] args) {
   
        Scanner terminal = new Scanner(System.in);

                System.out.println("Usuário, digite um primeiro parâmetro.");
                int parametroUm =  terminal.nextInt();
                System.out.println("Usuário, digite um segundo parâmetro."); 
                int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois); 
               if (parametroUm >= parametroDois);
        }catch (ParametrosInvalidosException exception) {
            
        
        }
    }     
        
        static void contar 
            (int parametroUm, int parametroDois ) throws  ParametrosInvalidosException {
                
                int contagem = parametroDois - parametroUm;
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");

            for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
    
    
    
    
    
    
    
    }