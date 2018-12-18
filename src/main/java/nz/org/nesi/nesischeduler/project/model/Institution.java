package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the institution database table.
 * 
 */
@Entity
@Table(name = "institution")
@NamedQuery(name="Institution.findAll", query="SELECT i FROM Institution i")
public class Institution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	private String gid;

	private String name;

	public Institution() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}