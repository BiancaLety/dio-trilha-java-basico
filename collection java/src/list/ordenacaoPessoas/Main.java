package list.ordenacaoPessoas;

public class Main {
    public static void main(String[] args){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("nome2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("nome3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("nome4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarAltura());
    }

}
