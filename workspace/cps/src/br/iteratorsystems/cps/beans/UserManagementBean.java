package br.iteratorsystems.cps.beans;

import java.util.Date;

import br.iteratorsystems.cps.common.FindAddress;

public class UserManagementBean extends FindAddress{
	
	private String nome;
	private String sobrenome;
	private Date aniversario;
	private String cpf;
	private String rg;
	private String orgao_expeditor;
	private String email;
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String ddd_tel_res;
	private String tel_res;
	private String ddd_tel_cel;
	private String tel_cel;
	private String senha_antiga;
	private String nova_senha;
	private String confirma_senha;
	private FindAddress findAddress;
	
	public UserManagementBean(){}

	public void find(){
		findAddress = new FindAddress();
		findAddress.find(this.getCep());
		
		this.setLogradouro(findAddress.getLogradouro());
		this.setBairro(findAddress.getBairro());
		this.setCidade(findAddress.getCidade());
		this.setEstado(findAddress.getEstado());
		findAddress = null;
	}
	
	public void salva(){
		System.out.println(this.getNome());
		System.out.println(this.getAniversario());
		System.out.println(this.getEmail());
		System.out.println(this.getCep());
		System.out.println(this.getTel_cel());
		System.out.println(this.getSenha_antiga());
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the aniversario
	 */
	public Date getAniversario() {
		return aniversario;
	}

	/**
	 * @param aniversario the aniversario to set
	 */
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the orgao_expeditor
	 */
	public String getOrgao_expeditor() {
		return orgao_expeditor;
	}

	/**
	 * @param orgaoExpeditor the orgao_expeditor to set
	 */
	public void setOrgao_expeditor(String orgaoExpeditor) {
		orgao_expeditor = orgaoExpeditor;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the ddd_tel_res
	 */
	public String getDdd_tel_res() {
		return ddd_tel_res;
	}

	/**
	 * @param dddTelRes the ddd_tel_res to set
	 */
	public void setDdd_tel_res(String dddTelRes) {
		ddd_tel_res = dddTelRes;
	}

	/**
	 * @return the tel_res
	 */
	public String getTel_res() {
		return tel_res;
	}

	/**
	 * @param telRes the tel_res to set
	 */
	public void setTel_res(String telRes) {
		tel_res = telRes;
	}

	/**
	 * @return the ddd_tel_cel
	 */
	public String getDdd_tel_cel() {
		return ddd_tel_cel;
	}

	/**
	 * @param dddTelCel the ddd_tel_cel to set
	 */
	public void setDdd_tel_cel(String dddTelCel) {
		ddd_tel_cel = dddTelCel;
	}

	/**
	 * @return the tel_cel
	 */
	public String getTel_cel() {
		return tel_cel;
	}

	/**
	 * @param telCel the tel_cel to set
	 */
	public void setTel_cel(String telCel) {
		tel_cel = telCel;
	}

	/**
	 * @return the senha_antiga
	 */
	public String getSenha_antiga() {
		return senha_antiga;
	}

	/**
	 * @param senhaAntiga the senha_antiga to set
	 */
	public void setSenha_antiga(String senhaAntiga) {
		senha_antiga = senhaAntiga;
	}

	/**
	 * @return the nova_senha
	 */
	public String getNova_senha() {
		return nova_senha;
	}

	/**
	 * @param novaSenha the nova_senha to set
	 */
	public void setNova_senha(String novaSenha) {
		nova_senha = novaSenha;
	}

	/**
	 * @return the confirma_senha
	 */
	public String getConfirma_senha() {
		return confirma_senha;
	}

	/**
	 * @param confirmaSenha the confirma_senha to set
	 */
	public void setConfirma_senha(String confirmaSenha) {
		confirma_senha = confirmaSenha;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
