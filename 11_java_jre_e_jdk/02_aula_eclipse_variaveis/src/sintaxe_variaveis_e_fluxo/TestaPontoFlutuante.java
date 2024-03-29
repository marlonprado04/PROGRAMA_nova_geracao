package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
    public static void main(String[] args) {
	// Criando variável do tipo double
	double salario;
	salario = 1250.70;

	// Printando variável com texto
	System.out.println("Meu salário é: " + salario);

	// O código abaixo funcionaria, pois a variável idade foi criada mais abaixo
	// System.out.println("Minha idade é: " + idade);

	// Adicionando um número inteiro à variável double
	double idade = 23;
	System.out.println("Minha idade é: " + idade);

	// Ao tentar adicionar 0.0 em variável int ele não aceita
	// int valor = 0.0;

	// Fazendo contas com double
	double divisao = 3.14 / 2;
	System.out.println("O resultado é: " + divisao);

	// Dividindo 2 inteiros para demonstrar resultado
	int outraDivisao = 5 / 2; // Retorna 2
	System.out.println("O resultado é: " + outraDivisao);

	// Atribuindo mesma divisão para 2 inteiros
	double novaTentativa = 5 / 2; // Retorna 2.0
	System.out.println("O novo resultado: " + novaTentativa);

	// Atribuindo mesma divisão, agora 1 sendo double
	double maisUmaTentativa = 5.0 / 2; // Retorna 2.5
	System.out.println("O novo resultado: " + maisUmaTentativa);
    }

}
