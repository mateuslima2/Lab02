/**
* Representação de uma conta em laboratorio de um aluno(a)
*
* @author Mateus de Lima
*/
public class ContaLaboratorio {
	private String nomeLab;
	private int dados;
	private int limDados;
	
	 /**
	   * Constrói uma conta no laboratorio com o limite de dados default
	   * @param nome do laboratorio
	   */
	public ContaLaboratorio(String nomeLab) {
		this.nomeLab = nomeLab;
		this.limDados = 2000;
		this.dados = 0;
	}
	 /**
	   * Constrói uma conta no laboratorio com o limite de dados default
	   * @param nome do laboratorio
	   */
	public ContaLaboratorio(String nomeLab, int cota) {
		this.nomeLab = nomeLab;
		this.limDados = cota;
		this.dados = 0;
	}

	 /**
	 * Diminui a quantidade de dados disponiveis ao usuario
	 * @returns void.
	 */
	public void consomeEspaco(int mbytes) {
		dados += mbytes;
	}
	
	 /**
	 * Diminui a quantidade de dados não disponiveis ao usuario
	 * @returns void.
	 */
	public void liberaEspaco(int mbytes) {
		dados -= mbytes;
	}
	
	 /**
	 * Verifica se a cota de memoria foi atingida
	 * @returns True (atigiu limite de dados) ou False (não atingiu limite).
	 */
	public boolean atingiuCota() {
		if (dados >= limDados)
			return true;
		return false;
	}
	
	/**
	 * Retorna a String que representa as informações da conta do aluno no lab.
	 *
	 * @returns a representação em String da conta.
	*/
	@Override
	public String toString() {
		return nomeLab + " " + dados + "/" + limDados ;
	}



	
	
	

	
}
