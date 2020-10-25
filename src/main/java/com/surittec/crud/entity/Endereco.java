package com.surittec.crud.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data	
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 8)
	@NotNull
	private String cep;

	@NotNull
	private String logradouro;
	
	@NotNull
	private String bairro;
	
	@NotNull
	private String localidade;
	
	@Size(max = 2)
	@NotNull
	private String uf;
	
	@Size(max = 100)
	private String complemento;
	
	private Integer ddd; 
	
	private String gia;
	
	private Integer ibge;
   
	private Integer siafi;
	
	@OneToOne(targetEntity=Cliente.class, fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn
	private Cliente cliente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public <Optional> Integer getDdd() {
		return ddd;
	}
	public <Optional> void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public <Optional> String getGia() {
		return gia;
	}
	public <Optional> void setGia(String gia) {
		this.gia = gia;
	}
	public <Optional> Integer getIbge() {
		return ibge;
	}
	public <Optional> void setIbge(Integer ibge) {
		this.ibge = ibge;
	}
	public <Optional> Integer getSiafi() {
		return siafi;
	}
	public <Optional> void setSiafi(Integer siafi) {
		this.siafi = siafi;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", "
				+ "cep=" + cep + ", "
						+ "logradouro=" + logradouro + 
						", bairro=" + bairro
				+ ", localidade=" + localidade +
				", uf=" + uf + 
				", complemento=" + complemento + 
				", cliente=" + cliente
				+ "]";
	}	
}
