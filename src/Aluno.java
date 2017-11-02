import java.util.HashMap;
import java.util.*;;

public class Aluno {
	Map<String, ContaLaboratorio> laboratorios = new HashMap<String, ContaLaboratorio>();
	Map<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
	Map<String, ContaCantina> cantinas = new HashMap<String, ContaCantina>();
	Saude saude = new Saude();
	
	public Aluno() {
	}
	
	public void cadastraLaboratorio(String nomeLaboratorio) {
		laboratorios.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio));
	}
	
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) { 
		laboratorios.put(nomeLaboratorio, new ContaLaboratorio(nomeLaboratorio, cota));
	}
	/**
	 * Diminui a quantidade de dados disponiveis ao usuario
	 * @returns void.
	 */
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		laboratorios.get(nomeLaboratorio).consomeEspaco(mbytes);
	}
	/**
	 * Diminui a quantidade de dados não disponiveis ao usuario
	 * @returns void.
	 */
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		laboratorios.get(nomeLaboratorio).liberaEspaco(mbytes);
	}
	 /**
	 * Verifica se a cota de memoria foi atingida
	 * @returns True (atigiu limite de dados) ou False (não atingiu limite).
	 */
	public boolean atingiuCota(String nomeLaboratorio) {
		return laboratorios.get(nomeLaboratorio).atingiuCota();
	}
	/**
	 * Retorna a String que representa as informações da conta do aluno no lab.
	 * @returns a representação em String da conta.
	*/
	public String laboratorioToString(String nomeLaboratorio) {
		return laboratorios.get(nomeLaboratorio).toString();
	}
	/**
	* Constrói uma disciplina a partir de seu nome.
	* Todo aluno começa com o campo CRA como nulo.
	* @param nome o da disciplina
	   */
	public void cadastraDisciplina(String nomeDisciplina) {
		disciplinas.put(nomeDisciplina, new Disciplina(nomeDisciplina));
	}
	/**
	* cadastra as horas de estudo destinadas a tal disciplina
	* @returns void.
	*/
	public void cadastraHoras(String nomeDisciplina, int horas) {
		disciplinas.get(nomeDisciplina).cadastraHoras(horas);
	}
	/**
	* cadastra as notas de a tal disciplina
	* @returns void.
	*/
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		disciplinas.get(nomeDisciplina).cadastraNota(nota, valorNota);
	}
	/**
	* Retorna um boolean que representa a condição do aluno
	* (se foi aprovado ou não).
	* @returns condição do aluno
	*/
	public boolean aprovado(String nomeDisciplina) {
		return disciplinas.get(nomeDisciplina).aprovado();
	}
	/**
	* Retorna a String que representa a disciplina. A representação segue o formato
	* Nome Disciplina = Nome Disciplina".
	* @returns a representação em String de uma disciplina.
	*/
	public String disciplinaToString(String nomeDisciplina) {
		return disciplinas.get(nomeDisciplina).toString();
	}
	/**
	* Constrói uma conta com valor de conta 0 (inicialmente).
	* @param nome da cantina
	*/
	public void cadastraCantina(String nomeCantina) {
		cantinas.put(nomeCantina, new ContaCantina(nomeCantina));
	}
	/**
	*Registra a quantidade de itens comprados e seu respectivo preço
	*
	* @returns void.
	*/
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		cantinas.get(nomeCantina).cadastraLanche(qtdItens, valorCentavos);
	}
	/**
	* Quita o valor passado da conta acumulada. 
	* @returns void.
	*/
	public void pagarConta(String nomeCantina, int valorCentavos) {
		cantinas.get(nomeCantina).pagaConta(valorCentavos);
	}
	 /**
	 * Retorna a String que representa a conta
	 *
	 * @returns a representação em String da conta.
	 */
	public String cantinaToString(String nomeCantina) {
		return cantinas.get(nomeCantina).toString();
	}
	/**
	* Define Saude mental do aluno(a)
	* @returns void.
	*/
	public void defineSaudeMental(String valor) {
		saude.defineSaudeMental(valor);
	}
	/**
	* Define Saude fisica do aluno(a)
	* @returns void.
	*/
	public void defineSaudeFisica(String valor) {
		saude.defineSaudeFisica(valor);
	}
	/**
	* Retorna a String que representa o estado de saude do aluno
	* @returns a representação em String do estado de saude do aluno(a).
	*/
	public String geral() {
		return saude.geral();	
	}

	@Override
	public String toString() {
		return "Aluno [laboratorios=" + laboratorios + ", disciplinas=" + disciplinas + ", cantinas=" + cantinas
				+ ", saude=" + saude + "]";
	}
	
	
}
