package models;

import java.util.*;
import play.data.validation.Constraints.*;
import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class Task extends Model {

	@Id
	private Long id;

	@Required
    private String descricao;
	
	@Required
	private String projeto;
	
	@Required
	private String tarefa;
	
	@Required
	private int prioridade;

	public static Finder<Long,Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		return find.all();
	}
	
	public static void create(Task task) {
		task.save();
	}
	
	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getProjeto() {
		return this.projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getTarefa() {
		return this.tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public int getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

}

