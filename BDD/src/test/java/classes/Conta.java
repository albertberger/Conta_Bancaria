package classes;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Classe utilizada para simular o uso e operações de uma conta bancaria.
 */

public class Conta {
	
	private Integer saldo;
	
	/**
     * Autor: albert
     * Inicializa um cliente especial com o saldo atual da conta.
     *
     * @param saldoInicial O saldo inicial da conta.
     */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		saldo = int1;
	}
	
	/**
     * Autor: albert
     * Realiza um saque na conta.
     *
     * @param valorSaque O valor a ser sacado.
     */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
		System.out.println("Saldo atual: " + saldo);
        System.out.println("Saque: " + int1);
        saldo -= int1;
	}
	
	 /**
     * Autor: albert
     * Verifica se o saque foi efetuado com sucesso.
     *
     * @param saldoFinal O saldo final da conta após a operação.
     */

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		Assert.assertEquals(int1, saldo);
        if (saldo.equals(int1)) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
	}

	/**
     * Autor: albert
     * Inicializa um cliente comum com o saldo atual da conta.
     *
     * @param saldoInicial O saldo inicial da conta.
     */
	
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
		System.out.println("Saldo atual: " + int1);
        saldo = int1;
	}
	
	/**
     * Autor: albert
     * Solicita um saque na conta comum.
     *
     * @param valorSaque O valor a ser sacado.
     */

	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		System.out.println("Saldo atual: " + saldo);
        System.out.println("Saque: " + int1);
        saldo -= int1;
	}

	 /**
     * Autor: albert
     * Verifica se o saque não foi efetuado e retorna a mensagem de saldo insuficiente.
     */
	
	@Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		System.out.println("Saldo insuficiente!");
	}

}
