package br.com.impacta.models;

import br.com.impacta.lab.Pessoa;

public class PessoaFisica implements Pessoa {

    private String documento;
		private String tipo;

  public PessoaFisica(String doc , String tipo){
    this.documento = doc;
    this.tipo = tipo;
  }

    public void setDocumento(String doc){

      this.documento = doc;
    }


	  public String falarDocumento(){
      return  this.documento;
    }
 

    public void setTipo(String tipo){

      this.tipo = tipo;
    }

    public String getTipo(){
      return this.tipo;
    }

}