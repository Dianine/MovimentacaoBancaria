package contaBancaria;

public class ContaBancaria {

    /*VARIAVEIS*/
    private String descricao;
    private double saldo = 10000;


    /*METODO 01 - Sacar*/
    public void sacarDinheiro(double saque){
        saldo -= saque;
    }

    /*METODO 02 - Depositar*/
    public void depositarDinheiro(double deposito){
        saldo += deposito;
    }

    /*Get e Set*/

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldo() {
        return saldo;
    }

    /*toString*/
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
