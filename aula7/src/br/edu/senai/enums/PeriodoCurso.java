package br.edu.senai.enums;

public enum PeriodoCurso {
	TARDE("Ter�a e Quinta", 40, 2500.), NOTURNO("Segunda e Quarta", 20, 1000.), INTEGRAL("Sexta", 80, 3200.);

	// Um construtor no enum ele � privado
	// Serve para organizar a ordem de inser��o dos campos

	private String diasDaSemana;
	private Integer cargaHoraria;
	private Double valor;

	private PeriodoCurso(String diasDaSemana, Integer cargaHoraria, Double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public Double getValor() {
		return valor;
	}

}
