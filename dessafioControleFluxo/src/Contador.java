import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Informar o primeiro número:");
            int n1 = entrada.nextInt();
            System.out.println("Informar o segundo número:");
            int n2 = entrada.nextInt();
            
            interacaoFor(n1, n2);

    }
    public static void interacaoFor(int num1, int num2){
        
        try{
            if(num1 > num2){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");    
            }

            int contador = num2 - num1;

            for(int i = 1; i <= contador; i++){
               
                System.out.println("Imprimindo o número " + i);   
        }


        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
