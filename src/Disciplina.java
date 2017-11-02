import java.util.Arrays;
/**
* Representação de uma disciplina escolar. Toda disciplina precisa ter um nome. E para os alunos de tal  disciplina
* a notas, média e horas de estudo de aluno.
* @author Mateus de Lima
*/

public class Disciplina {
	private double media = 0;
	private String nomeDis;
	private int horasEstudo;
	private double[] notas = {0,0,0,0};
	private int numNotas = 4;
	private double[] pesos = {1,1,1,1};
	private boolean dif = false;
	
   /**
   * Constrói uma disciplina a partir de seu nome.
   * Todo aluno começa com o campo CRA como nulo.
   *
   * @param nome o da disciplina
   */
	public Disciplina(String nomeDis) {
		this.nomeDis = nomeDis;
	}
	
	/**
	* Constrói uma disciplina a partir de seu nome e numero de notas.
	* Todo aluno começa com o campo CRA como nulo.
	* @param nome o da disciplina
	*/
	public Disciplina(String nomeDis, int numNotas) {
		this.nomeDis = nomeDis;
		this.numNotas = numNotas;
		
	}
	
	/**
	* Constrói uma disciplina a partir de seu nome, numero de notas e pesos de cada nota.
	* Todo aluno começa com o campo CRA como nulo.
	* @param nome o da disciplina
	*/
	public Disciplina(String nomeDis, int numNotas, double[] peso) {
		this.nomeDis = nomeDis;
		this.numNotas = numNotas;
		this.pesos = peso;
		this.dif = true;

	}
	
	/**
	* cadastra as horas de estudo destinadas a tal disciplina
	* @returns void.
	*/
	public void cadastraHoras(int horas) {
		this.horasEstudo = horas;		
	}
	
	/**
	* cadastra as notas da disciplina
	* @returns void.
	*/
	public void cadastraNota(int nota, double valorNota) {
		notas[nota-1] = valorNota;
	}
	
	/**
	* Retorna um boolean que representa a condição do aluno
	* (se foi aprovado ou não).
	* @returns condição do aluno
	*/
	public boolean aprovado() {
		double soma = 0;
		
		if(dif) {
			for(int i = 0; i < numNotas; i++) {
				soma += notas[i]*pesos[i];
				media = soma/10;
			}
		}else {
		
			for(int i = 0; i < numNotas; i++) {
				soma += notas[i];
				media = soma/numNotas;
			}
		}
		
		if(media >= 7.0) 
			return true;			
		else 
			return false;
	}
	
	/**
	* Retorna a String que representa a disciplina. A representação segue o formato
	* “Nome Disciplina = Nome Disciplina".
	* @returns a representação em String de uma disciplina.
	*/
	@Override
	public String toString() {
		return nomeDis +" "+ horasEstudo + " " + numNotas+" "+ media + "" +
				Arrays.toString(notas);
	}


}
