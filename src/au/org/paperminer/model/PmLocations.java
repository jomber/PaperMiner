package au.org.paperminer.model;

// Generated Aug 21, 2013 12:00:35 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * PmLocations generated by hbm2java
 */
@JsonAutoDetect
@Entity
@Table(name = "pm_locations", catalog = "paperminer", uniqueConstraints = @UniqueConstraint(columnNames = {
		"name", "state_code", "country_code" }))
public class PmLocations implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8967984583399576544L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "name", nullable = false, length = 64)
	private String name;
	@Column(name = "state_code")
	private byte stateCode;
	@Column(name = "country_code", nullable = false)
	private short countryCode;
	@Column(name = "latitude", nullable = false, precision = 12, scale = 9)
	private BigDecimal latitude;
	@Column(name = "longitude", nullable = false, precision = 12, scale = 9)
	private BigDecimal longitude;
	@Column(name = "box_nw_lat", precision = 12, scale = 9)
	private BigDecimal boxNwLat;
	@Column(name = "box_nw_lng", precision = 12, scale = 9)
	private BigDecimal boxNwLng;
	@Column(name = "box_se_lat", precision = 12, scale = 9)
	private BigDecimal boxSeLat;
	@Column(name = "box_se_lng", precision = 12, scale = 9)
	private BigDecimal boxSeLng;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", nullable = false, length = 19)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date dateCreated;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pmLocations")
	private List<PmGsRefs> pmGsRefses;

	public PmLocations() {
	}

	public PmLocations(String name, short countryCode, BigDecimal latitude,
			BigDecimal longitude, Date dateCreated) {
		this.name = name;
		this.countryCode = countryCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.dateCreated = dateCreated;
	}

	public PmLocations(String name, byte stateCode, short countryCode,
			BigDecimal latitude, BigDecimal longitude, BigDecimal boxNwLat,
			BigDecimal boxNwLng, BigDecimal boxSeLat, BigDecimal boxSeLng,
			Date dateCreated, List<PmGsRefs> pmGsRefses) {
		this.name = name;
		this.stateCode = stateCode;
		this.countryCode = countryCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.boxNwLat = boxNwLat;
		this.boxNwLng = boxNwLng;
		this.boxSeLat = boxSeLat;
		this.boxSeLng = boxSeLng;
		this.dateCreated = dateCreated;
		this.pmGsRefses = pmGsRefses;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public byte getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(byte stateCode) {
		this.stateCode = stateCode;
	}

	
	public short getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(short countryCode) {
		this.countryCode = countryCode;
	}

	
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	
	public BigDecimal getBoxNwLat() {
		return this.boxNwLat;
	}

	public void setBoxNwLat(BigDecimal boxNwLat) {
		this.boxNwLat = boxNwLat;
	}

	
	public BigDecimal getBoxNwLng() {
		return this.boxNwLng;
	}

	public void setBoxNwLng(BigDecimal boxNwLng) {
		this.boxNwLng = boxNwLng;
	}

	
	public BigDecimal getBoxSeLat() {
		return this.boxSeLat;
	}

	public void setBoxSeLat(BigDecimal boxSeLat) {
		this.boxSeLat = boxSeLat;
	}

	
	public BigDecimal getBoxSeLng() {
		return this.boxSeLng;
	}

	public void setBoxSeLng(BigDecimal boxSeLng) {
		this.boxSeLng = boxSeLng;
	}

	
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonIgnore
	public List<PmGsRefs> getPmGsRefses() {
		return this.pmGsRefses;
	}

	public void setPmGsRefses(List<PmGsRefs> pmGsRefses) {
		this.pmGsRefses = pmGsRefses;
	}

}
