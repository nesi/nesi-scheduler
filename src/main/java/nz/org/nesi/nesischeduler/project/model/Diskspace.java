package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the diskspace database table.
 * 
 */
@Entity
@Table(name="diskspace")
@NamedQueries({@NamedQuery(name="Diskspace.findAll", query="SELECT d FROM Diskspace d"),
	@NamedQuery(name="Diskspace.findByCode", query="SELECT d FROM Diskspace d where d.fileset like :projectCode")})
public class Diskspace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date awarded;

	private String awarder;

	@Temporal(TemporalType.DATE)
	private Date expiry;

	private String fileset;

	private String note;

	private int quota;

	@Temporal(TemporalType.DATE)
	private Date revoked;

	private String revoker;

	public Diskspace() {
	}

	public Diskspace(Date awarded, String awarder, Date expiry, String fileset, String note, int quota) {
		super();
		this.awarded = awarded;
		this.awarder = awarder;
		this.expiry = expiry;
		this.fileset = fileset;
		this.note = note;
		this.quota = quota;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAwarded() {
		return this.awarded;
	}

	public void setAwarded(Date awarded) {
		this.awarded = awarded;
	}

	public String getAwarder() {
		return this.awarder;
	}

	public void setAwarder(String awarder) {
		this.awarder = awarder;
	}

	public Date getExpiry() {
		return this.expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getFileset() {
		return this.fileset;
	}

	public void setFileset(String fileset) {
		this.fileset = fileset;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getQuota() {
		return this.quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public Date getRevoked() {
		return this.revoked;
	}

	public void setRevoked(Date revoked) {
		this.revoked = revoked;
	}

	public String getRevoker() {
		return this.revoker;
	}

	public void setRevoker(String revoker) {
		this.revoker = revoker;
	}

}