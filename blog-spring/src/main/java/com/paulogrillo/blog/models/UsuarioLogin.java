package com.paulogrillo.blog.models;

public class UsuarioLogin {
	
private String nome;
	
	private long id;
	
	private String usuario;
	
	private String senha;
	
	private String token;

	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getUsuario(){
		return usuario;
	}

	public String getToken(){
		return token;
	}

	public void setToken(String token){
		this.token = token;
	}

	public void setUsuario(String usuario){
		this.usuario = usuario;
	}

	public String getSenha(){
		return senha;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id = id;
	}
	
	
}
