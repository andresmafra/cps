package br.iteratorsystems.cps.enums;

public enum EEstados {
	
	AC("ACRE"),
	AL("ALAGOAS"),
	AP("AMAPA"),
	AM("AMAZONAS"),
	BA("BAHIA"),
	CE("CEARÁ"),
	DF("DISTRITO_FEDERAL"),
	GO("GOIÁS"),
	ES("ESPÍRITO_SANTO"),
	MA("MARANHÃO"),
	MT("MATO_GROSSO"),
	MS("MATO_GROSSO_DO_SUL"),
	MG("MINAS_GERAIS"),
	PA("PARÁ"),
	PB("PARAÍBA"),
	PR("PARANÁ"),
	PE("PERNAMBUCO"),
	PI("PIAUÍ"),
	RJ("RIO_DE_JANEIRO"),
	RN("RIO_GRANDE_DO_NORTE"),
	RS("RIO_GRANDE_DO_SUL"),
	RO("RONDÔNIA"),
	RR("RORÂIMA"),
	SP("SÃO_PAULO"),
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
