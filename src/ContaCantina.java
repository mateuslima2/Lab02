import java.util.ArrayList;

/**
* Representação de uma conta em uma cantina da universidade.
*
* @author Mateus de Lima
*/
public class ContaCantina {
	private String nomeCantina;
	private int debito;
	private int itens = 0;
	private ArrayList<String> detalhes = new ArrayList<String>(); 
	
	/**
	* Constrói uma conta com valor de conta 0 (inicialmente).
	*
	* @param nome da cantina
	*/
	public ContaCantina(String nomeCantina) {
		this.nomeCantina = nomeCantina;
	}
    /**
    *Registra a quantidade de itens comprados e seu respectivo preço
    *
    * @returns void.
    */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		debito += valorCentavos;
		itens+= qtdItens;
	}
	/**
	*Registra a quantidade de itens comprados, seu respectivo preço e os detalhes da compra
	* @returns void.
	*/
	public void cadastrarLanche(int qtdItens, int valorCentavos, String detalhes) {
		debito += valorCentavos;
		itens+= qtdItens;
		this.detalhes.add(detalhes);
	}
	/**
	*Mostra os detalhes das ultimas 5 compras feitas na cantina
	* @returns String com detalhes das ultimas contas.
	*/
	public String listarDetalhes() {
		String aux = "";
		for(int i = detalhes.size()-1; i > (detalhes.size()-6); i--) {
			aux += detalhes.get(i) + "\n";
		}
		return aux;
	}
    /**
    * Quita o valor passado da conta acumulada. 
    *
    * @returns void.
    */
	public void pagaConta(int valorCentavos) {
		debito -= valorCentavos;	
	}
	
    /**
    * Retorna a String que representa a conta
    *
   * @returns a representação em String da conta.
   */
	@Override
	public String toString() {
		return  nomeCantina +" "+ itens +" " + debito ;
	}



	
	
	
	
}
