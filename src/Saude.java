/**
* Representa o estado de saude do aluno, levando em consideração
* a saude mental e fisica
*
* @author Mateus de Lima
*/
public class Saude {
	private String sFisica;
	private String sMental;
	private String emoji = "";
	
	 /**
	 * Constrói um estado de saude do aluno, que é boa por default
	 */
	public Saude() {
		this.sFisica = "boa";
		this.sMental = "boa";
	}
	
	/**
	* Define Saude mental do aluno(a)
	* @returns void.
	*/
	public void defineSaudeMental(String valor) {
		this.sMental = valor;
	}
	
	/**
	* Define emoji que define sua saude
	* @returns void.
	*/
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}
	
	/**
	* Define a saude fisica do aluno(a)
	* @returns void
	*/
	public void defineSaudeFisica(String valor) {
		this.sFisica = valor;
	}

	/**
	* Retorna a String que representa o estado de saude do aluno
	* @returns a representação em String do estado de saude do aluno(a).
	*/
	public String geral() {
		if ((sFisica.equals("boa"))&&(sMental.equals("boa"))) 
			if (emoji.equals("<(^_^<)"))
				return "boa "+ emoji;
			else
				return "boa";
		
		if((sFisica.equals("boa"))&&(sMental.equals("fraca")) || ((sFisica.equals("fraca"))&&(sMental.equals("boa")))) 
			return "ok";
		
		return "fraca " + emoji;
		}
	}
	
