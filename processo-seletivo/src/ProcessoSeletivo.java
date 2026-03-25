import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        System.out.println("Processo seletivo");
        String[] candidatos = {"numero1", "numero2", "numero3","numero4","numero5"};
       /* analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/ 
        //selacaoDeCandidatos();
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do{

            atendeu = atender();
            continuaTentando = !atendeu;

            if (continuaTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }

        }while(continuaTentando && tentativasRealizadas < 3);

            if (atendeu) {
                System.out.println("Conseguimos contato com o " + candidato + " na " + tentativasRealizadas + " tentativa");
            }else{
                System.out.println("Não conseguimos contato com o " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");
            }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
         String[] candidatos = {"numero1", "numero2", "numero3","numero4","numero5"};
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selacaoDeCandidatos(){
        String[] candidatos = {"numero1", "numero2", "numero3","numero4","numero5","numero6", "numero7", "numero8", "numero9", "numero10"};

        int candadatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candadatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candadatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
     static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
     }

     static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
     }

}
