package api.conecta.org.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
 * @Versão da Classe = 1
 */

@Entity
@Table(name = "PESSOA", catalog = "", schema = "public")
public class Pessoa implements Serializable {
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("endereco")
	private String endereco;
	@JsonProperty("numero")
	private String numero;
	@JsonProperty("bairro")
	private String bairro;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("estado")
	private String estado;
	@JsonProperty("cep")
	private String cep;
	@JsonProperty("complemento")
	private String complemento;
	@JsonProperty("data_nascimento")
	private Date data_nascimento;
	@JsonProperty("rg")
	private String rg;
	@JsonProperty("cpf")
	private String cpf;
	@JsonProperty("fone_contato")
	private String fone_contato;
	@JsonProperty("celular")
	private String celular;
	@JsonProperty("e_mail")
	private String e_mail;
	@JsonProperty("sexo")
	private String sexo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone_contato() {
		return fone_contato;
	}

	public void setFone_contato(String fone_contato) {
		this.fone_contato = fone_contato;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
