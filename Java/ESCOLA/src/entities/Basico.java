package entities;

public class Basico extends Estudante{

	//Atributos
	private int diaAniversario;

	//Contrutor
	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}

	//Encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//Método
	public void bonusAniversario(int diaAtual) {
		if(this.getDiaAniversario() == diaAtual) {
			super.incluirPontos(super.getPontos() * 0.1);
		}
	}
}
