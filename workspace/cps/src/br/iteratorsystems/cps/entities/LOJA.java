package br.iteratorsystems.cps.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "loja", schema = "tabelas", catalog = "cps")
public class LOJA implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(nullable = false)
	private Integer id_loja;
	@Column(nullable = false)
	private String razaosocial;
	@Column(nullable = false)
	private String nomefantasia;
	@Column(nullable = false, unique = true)
	private String cnpj;
	@Column(nullable = true, unique = true)
	private String inscricaoestadual;
	@Column(nullable = true, unique = true)
	private String inscricaomunicipal;
	@Column(nullable = true, unique = false, name = "nomedoresponsavelpelaloja")
	private String responsavel;
	@Column(nullable = false, unique = false)
	private String pais;
	@Column(nullable = false, length = 2)
	private String estado;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String bairro;
	@Column(nullable = false)
	private String logradouro;
	@Column(nullable = false)
	private Integer numero;
	@Column(nullable = true)
	private String complemento;
	@Column(nullable = false)
	private String cep;
	@Column(name = "dataultimamodificacao", nullable = false)
	private Date modificacao;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_rede", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private REDE rede;

	public LOJA() {
	}

	public LOJA(Integer idLoja,String razaosocial,
			String nomefantasia, String cnpj, String inscricaoestadual,
			String inscricaomunicipal, String responsavel, String pais,
			String estado, String cidade, String bairro, String logradouro,
			Integer numero, String complemento, String cep, Date modificacao,
			REDE rede) {
		super();
		id_loja = idLoja;
		this.razaosocial = razaosocial;
		this.nomefantasia = nomefantasia;
		this.cnpj = cnpj;
		this.inscricaoestadual = inscricaoestadual;
		this.inscricaomunicipal = inscricaomunicipal;
		this.responsavel = responsavel;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.modificacao = modificacao;
		this.rede = rede;
	}

	/**
	 * @return the id_loja
	 */
	public Integer getId_loja() {
		return id_loja;
	}

	/**
	 * @param idLoja
	 *            the id_loja to set
	 */
	public void setId_loja(Integer idLoja) {
		id_loja = idLoja;
	}

	/**
	 * @return the razaosocial
	 */
	public String getRazaosocial() {
		return razaosocial;
	}

	/**
	 * @param razaosocial
	 *            the razaosocial to set
	 */
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	/**
	 * @return the nomefantasia
	 */
	public String getNomefantasia() {
		return nomefantasia;
	}

	/**
	 * @param nomefantasia
	 *            the nomefantasia to set
	 */
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the inscricaoestadual
	 */
	public String getInscricaoestadual() {
		return inscricaoestadual;
	}

	/**
	 * @param inscricaoestadual
	 *            the inscricaoestadual to set
	 */
	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	/**
	 * @return the inscricaomunicipal
	 */
	public String getInscricaomunicipal() {
		return inscricaomunicipal;
	}

	/**
	 * @param inscricaomunicipal
	 *            the inscricaomunicipal to set
	 */
	public void setInscricaomunicipal(String inscricaomunicipal) {
		this.inscricaomunicipal = inscricaomunicipal;
	}

	/**
	 * @return the responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel
	 *            the responsavel to set
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro
	 *            the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro
	 *            the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the modificacao
	 */
	public Date getModificacao() {
		return modificacao;
	}

	/**
	 * @param modificacao
	 *            the modificacao to set
	 */
	public void setModificacao(Date modificacao) {
		this.modificacao = modificacao;
	}

	public String toString() {
		return this.id_loja + " " + this.razaosocial + " "
				+ this.nomefantasia + " " + this.cnpj + " "
				+ this.inscricaoestadual + " " + this.inscricaomunicipal + " "
				+ this.responsavel + " " + this.pais + " " + this.estado + " "
				+ this.cidade + " " + this.bairro + " " + this.logradouro + " "
				+ this.numero + " " + this.complemento + " " + this.cep + " "
				+ this.modificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id_loja == null) ? 0 : id_loja.hashCode());
		result = prime
				* result
				+ ((inscricaoestadual == null) ? 0 : inscricaoestadual
						.hashCode());
		result = prime
				* result
				+ ((inscricaomunicipal == null) ? 0 : inscricaomunicipal
						.hashCode());
		result = prime * result
				+ ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result
				+ ((modificacao == null) ? 0 : modificacao.hashCode());
		result = prime * result
				+ ((nomefantasia == null) ? 0 : nomefantasia.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result
				+ ((razaosocial == null) ? 0 : razaosocial.hashCode());
		result = prime * result
				+ ((responsavel == null) ? 0 : responsavel.hashCode());
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
		if (!(obj instanceof LOJA)) {
			return false;
		}
		LOJA other = (LOJA) obj;
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (cep == null) {
			if (other.cep != null) {
				return false;
			}
		} else if (!cep.equals(other.cep)) {
			return false;
		}
		if (cidade == null) {
			if (other.cidade != null) {
				return false;
			}
		} else if (!cidade.equals(other.cidade)) {
			return false;
		}
		if (cnpj == null) {
			if (other.cnpj != null) {
				return false;
			}
		} else if (!cnpj.equals(other.cnpj)) {
			return false;
		}
		if (complemento == null) {
			if (other.complemento != null) {
				return false;
			}
		} else if (!complemento.equals(other.complemento)) {
			return false;
		}
		if (estado == null) {
			if (other.estado != null) {
				return false;
			}
		} else if (!estado.equals(other.estado)) {
			return false;
		}
		if (id_loja == null) {
			if (other.id_loja != null) {
				return false;
			}
		} else if (!id_loja.equals(other.id_loja)) {
			return false;
		}
		if (inscricaoestadual == null) {
			if (other.inscricaoestadual != null) {
				return false;
			}
		} else if (!inscricaoestadual.equals(other.inscricaoestadual)) {
			return false;
		}
		if (inscricaomunicipal == null) {
			if (other.inscricaomunicipal != null) {
				return false;
			}
		} else if (!inscricaomunicipal.equals(other.inscricaomunicipal)) {
			return false;
		}
		if (logradouro == null) {
			if (other.logradouro != null) {
				return false;
			}
		} else if (!logradouro.equals(other.logradouro)) {
			return false;
		}
		if (modificacao == null) {
			if (other.modificacao != null) {
				return false;
			}
		} else if (!modificacao.equals(other.modificacao)) {
			return false;
		}
		if (nomefantasia == null) {
			if (other.nomefantasia != null) {
				return false;
			}
		} else if (!nomefantasia.equals(other.nomefantasia)) {
			return false;
		}
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		if (pais == null) {
			if (other.pais != null) {
				return false;
			}
		} else if (!pais.equals(other.pais)) {
			return false;
		}
		if (razaosocial == null) {
			if (other.razaosocial != null) {
				return false;
			}
		} else if (!razaosocial.equals(other.razaosocial)) {
			return false;
		}
		if (responsavel == null) {
			if (other.responsavel != null) {
				return false;
			}
		} else if (!responsavel.equals(other.responsavel)) {
			return false;
		}
		return true;
	}

}
