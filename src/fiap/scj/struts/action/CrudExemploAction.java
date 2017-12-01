package fiap.scj.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class CrudExemploAction extends ActionSupport{

	private String mensagem;
	
	@Action(value = "welcome", results = {
			@Result(name = "success", location = "/WEB-INF/sucesso.jsp")
	})
	public String execute() throws Exception {
		mensagem = "Olá mundo";
		return SUCCESS;
	}
	
	@Action(value = "test", results = {
			@Result(name = "success", location = "/WEB-INF/sucesso.jsp")
	})
	public String test() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		mensagem = request.getParameter("param");
		return SUCCESS;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
