package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_facility database table.
 * 
 */
@Entity
@Table(name="project_facility")
@NamedQuery(name="ProjectFacility.findAll", query="SELECT p FROM ProjectFacility p")
public class ProjectFacility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false)
	protected Long id;
	
	@ManyToOne
	@JoinColumn(name = "facilityId")
	private Facility facility;

	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project project;

	public ProjectFacility() {
	}

	public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProjectId(Project project) {
		this.project = project;
	}

}