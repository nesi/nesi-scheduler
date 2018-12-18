package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the eventlog database table.
 * 
 */
@Entity
@Table(name = "eventlog")
@NamedQuery(name="Eventlog.findAll", query="SELECT e FROM Eventlog e")
public class Eventlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String event;

	private String note;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	public Eventlog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}