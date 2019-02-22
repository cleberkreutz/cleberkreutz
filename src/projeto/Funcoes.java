package projeto;

public class Funcoes {
    
    //método que soma 2 números
    /*
        modificador de acesso (public, private)
        public = torna o método disponível para todo o projeto
        static = Não faz-se necessário instanciar a classe para utilizar o método/função
        int = é o retorno do método (void = método sem retorno)
        somarNumeros = nome do método
    */
    public static int somarNumeros(int valor1, int valor2){
        int resultado = valor1 + valor2;
          
        return resultado;
    }
    
    public static int somarNumeros(int[] numeros){
        int resultado = 0;
        
        for(int var : numeros){
            System.out.println(var);
        }
        return resultado;
    }
    
    public int subtrairNumeros(int valor1, int valor2){
        int resultado = valor1 - valor2;
        return resultado;
    }
   
    
}
