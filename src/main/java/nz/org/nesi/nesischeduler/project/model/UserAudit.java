package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_audit database table.
 * 
 */
@Entity
@Table(name="user_audit")
@NamedQueries({@NamedQuery(name="UserAudit.findAll", query="SELECT u FROM UserAudit u")})
public class UserAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String action;

	private byte isAdmin;

	private String notes;

	private Timestamp timestamp;

	private int userId;

	public UserAudit() {
	}

	public UserAudit(String action, byte isAdmin, String notes, int userId) {
		super();
		this.action = action;
		this.isAdmin = isAdmin;
		this.notes = notes;
		this.timestamp = timestamp;
		this.userId = userId;
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public byte getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(byte isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}