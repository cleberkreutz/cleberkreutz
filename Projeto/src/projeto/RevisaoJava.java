package projeto;

public class RevisaoJava {

    //método de inicialização da classe
    public static void main(String[] args) {
        System.out.println("1 + 2");
        System.out.println(1 + 2);
        
        //declarar variável do tipo inteiro
        int valor;
        //atribuir o valor retornado do método SOMAR
        //somarNumeros é estático, logo, não precisa inicializar a classe Funcoes
        valor = Funcoes.somarNumeros(2, 8);
        System.out.println("RESULTADO DA SOMA = " + valor);
        
        //Criando uma instância de uma classe
        Funcoes func = new Funcoes();
        valor = func.subtrairNumeros(2, 8);
        System.out.println("RESULTADO DA SUBTRAÇÃO = " + valor);
    }
    
    
    
    
}


