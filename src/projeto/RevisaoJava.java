package projeto;

public class RevisaoJava {

    //método de inicialização da classe
    public static void main(String[] args) {
        
        System.out.println("Olá Mundo");
        int resultado = Funcoes.somarNumeros(1, 2);
        System.out.println("Resultado = " + resultado);
        
        //criamos uma instância de Funcoes
        Funcoes func = new Funcoes();
        resultado = func.subtrairNumeros(4, 1);
        System.out.println("Resultado = " + resultado);
        
        imprimirMensagem("TESTE 1");
        imprimirMensagem("TESTE 2");
        imprimirMensagem("TESTE 3");
        
        for(int i = 0; i <10; i++){
            System.out.println("valor de i = " + i);
        }
        
        int x = 15;
        while( x < 18 ){
            System.out.println("Sem permissão!!!");
            x++;
        }
        
        int[] numeros = {11,3,12,4,50,50};
        
        System.out.println("ENCHANCED FOR");
        for(int var : numeros){
            System.out.println(var);
        }
        
        System.out.println("FOR COMUM");
        for(int var = 0; var < numeros.length; var++){
            System.out.println(numeros[var]);
        }
        
        resultado = Funcoes.somarNumeros(numeros);
        System.out.println("RESULTADO DA SOMA = " + resultado);
        
    }
    
    public static void imprimirMensagem(String par1){
        System.out.println();
    }
    
}