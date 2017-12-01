package fiap.scj.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fiap.scj.struts.bean.Pessoa;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private String mensagem;
	
	@Action(value = "/", results = {
			@Result(name = "success", location = "/WEB-INF/cadastro.jsp")
	})
	public String abrirFormulario() throws Exception {
		pessoa = new Pessoa();
		mensagem = "Formulário aberto";
		return SUCCESS;
	}
	
	@Action(value = "/cadastrar", results = {
			@Result(name = "success", location = "/WEB-INF/sucesso.jsp")
	})
	public String cadastrar() throws Exception {
		System.out.println(this.pessoa);
		mensagem = "Tudo certo com seu cadastro";
		return SUCCESS;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
