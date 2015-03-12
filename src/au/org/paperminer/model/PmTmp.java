package au.org.paperminer.model;

// Generated Aug 21, 2013 12:00:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PmTmp generated by hbm2java
 */
@Entity
@Table(name = "pm_tmp", catalog = "paperminer")
public class PmTmp implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3176662094185105228L;
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "troveId", column = @Column(name = "trove_id", nullable = false)),
			@AttributeOverride(name = "name", column = @Column(name = "name", nullable = false, length = 64)),
			@AttributeOverride(name = "stateCode", column = @Column(name = "state_code", nullable = false)),
			@AttributeOverride(name = "countryCode", column = @Column(name = "country_code", nullable = false)) })
	private PmTmpId id;
	@Column(name = "frequency", nullable = false)
	private Integer frequency;

	public PmTmp() {
	}

	public PmTmp(PmTmpId id, Integer frequency) {
		this.id = id;
		this.frequency = frequency;
	}

	
	public PmTmpId getId() {
		return this.id;
	}

	public void setId(PmTmpId id) {
		this.id = id;
	}

	
	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

}
