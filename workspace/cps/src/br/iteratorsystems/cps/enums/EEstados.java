package br.iteratorsystems.cps.enums;

public enum EEstados {
	
	AC("ACRE"),
	AL("ALAGOAS"),
	AP("AMAPA"),
	AM("AMAZONAS"),
	BA("BAHIA"),
	CE("CEAR�"),
	DF("DISTRITO_FEDERAL"),
	GO("GOI�S"),
	ES("ESP�RITO_SANTO"),
	MA("MARANH�O"),
	MT("MATO_GROSSO"),
	MS("MATO_GROSSO_DO_SUL"),
	MG("MINAS_GERAIS"),
	PA("PAR�"),
	PB("PARA�BA"),
	PR("PARAN�"),
	PE("PERNAMBUCO"),
	PI("PIAU�"),
	RJ("RIO_DE_JANEIRO"),
	RN("RIO_GRANDE_DO_NORTE"),
	RS("RIO_GRANDE_DO_SUL"),
	RO("ROND�NIA"),
	RR("ROR�IMA"),
	SP("S�O_PAULO"),
	SC("SANTA_CATARINA"),
	SE("SERGIPE"),
	TO("TOCANTINS");
	
	EEstados(String s){
		this.setNome(s);
	}

	private String nome_completo;
	
	public void setNome(String nome) {
		this.nome_completo = nome;
	}

	public String getNome() {
		return nome_completo;
	}
}
