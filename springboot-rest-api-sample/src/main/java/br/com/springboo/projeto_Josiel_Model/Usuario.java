package br.com.springboo.projeto_Josiel_Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity	//entidade
@SequenceGenerator(name ="seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)//SequenciaGerador de cód para usuário
public class Usuario implements Serializable {
	
	private static final long  serialVersionUID = 1L; //serialVersion identificando se a versão do objeto é compatível com a versão da classe que serializou este
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;
	private String nome;
	private String idade;
	private String cpf;
	private String telefone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
