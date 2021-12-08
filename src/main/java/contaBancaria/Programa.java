package contaBancaria;

public class Programa {
    public static void main(String[] args) {

        /*Objeto Conta Bancaria*/
        ContaBancaria bancaria = new ContaBancaria();

        bancaria.setDescricao("Conta bancaria do Dianine");

        System.out.println(bancaria);

        bancaria.sacarDinheiro(500);
        System.out.println(bancaria);

        bancaria.sacarDinheiro(5500);
        System.out.println(bancaria);

        bancaria.depositarDinheiro(1500);
        System.out.println(bancaria);





    }


}
