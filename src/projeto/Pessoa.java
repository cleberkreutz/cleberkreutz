package projeto;

/**
 *
 * @author jonasdhein
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorConta;     
    private double chequeEspecial;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public boolean credito(double valorTransferencia){
        //testar junto com o chequeEspecial
        if(valorTransferencia <= (this.valorConta + this.chequeEspecial)){
            this.valorConta -= valorTransferencia;
            System.out.println("Transferência realizada.\n");
            return true;
        }else{
            System.out.println("Transferência não realizada.\n");
            return false;
        }
    }
    
    public void debito(double valor){
        this.valorConta += valor;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\nLimite: R$ " + chequeEspecial + "\nSaldo: R$ " + valorConta;
    }
    
}
