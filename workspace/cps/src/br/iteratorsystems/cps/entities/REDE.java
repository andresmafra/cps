package br.iteratorsystems.cps.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="rede",schema="tabelas",catalog="cps")
public class REDE implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id_rede",unique=true)
	private Integer id_rede;
	@Column(name="nome",length=30)
	private String nome;
	@Column(name="dataultimamodificacao")
	@Temporal(TemporalType.DATE)
	private Date data_ultima_motificacao;
	
	public REDE(){}
	
	public REDE(Integer idRede, String nome, Date dataUltimaMotificacao) {
		super();
		id_rede = idRede;
		this.nome = nome;
		data_ultima_motificacao = dataUltimaMotificacao;
	}
	
	public Integer getId_rede() {
		return id_rede;
	}
	public void setId_rede(Integer idRede) {
		id_rede = idRede;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_ultima_motificacao() {
		return data_ultima_motificacao;
	}
	public void setData_ultima_motificacao(Date dataUltimaMotificacao) {
		data_ultima_motificacao = dataUltimaMotificacao;
	}

	@Override
	public String toString() {
		return this.getId_rede()+" "+this.getNome()+" "+this.getData_ultima_motificacao();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((data_ultima_motificacao == null) ? 0
						: data_ultima_motificacao.hashCode());
		result = prime * result + ((id_rede == null) ? 0 : id_rede.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof REDE)) {
			return false;
		}
		REDE other = (REDE) obj;
		if (data_ultima_motificacao == null) {
			if (other.data_ultima_motificacao != null) {
				return false;
			}
		} else if (!data_ultima_motificacao
				.equals(other.data_ultima_motificacao)) {
			return false;
		}
		if (id_rede == null) {
			if (other.id_rede != null) {
				return false;
			}
		} else if (!id_rede.equals(other.id_rede)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
}
