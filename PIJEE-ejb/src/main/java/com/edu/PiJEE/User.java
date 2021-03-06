package com.edu.PiJEE;
// Generated 17 nov. 2016 21:49:43 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "room")
public class User implements java.io.Serializable {

	private String id;
	private String firstName;
	private String lastname;
	private Date birthday;
	private Date createDate;
	private String rib;
	private String gender;
	private String country;
	private String street;
	private String mainActivity;
	private String hobbies;
	private boolean smoker;
	private String picture;
	private int zipCode;
	private String email;
	private boolean emailConfirmed;
	private String passwordHash;
	private String securityStamp;
	private String phoneNumber;
	private boolean phoneNumberConfirmed;
	private boolean twoFactorEnabled;
	private Date lockoutEndDateUtc;
	private boolean lockoutEnabled;
	private int accessFailedCount;
	private String userName;
	private String typeOfRental;
	private String discriminator;
	private Set<Carpool> carpools = new HashSet<Carpool>(0);
	private Set<Groupcollocation> groupcollocations = new HashSet<Groupcollocation>(0);
	private Set<Appartement> appartements = new HashSet<Appartement>(0);
	private Set<Aspnetuserclaims> aspnetuserclaimses = new HashSet<Aspnetuserclaims>(0);
	private Set<Discution> discutions = new HashSet<Discution>(0);
	private Set<Appartement> appartements_1 = new HashSet<Appartement>(0);
	private Set<Aspnetuserlogins> aspnetuserloginses = new HashSet<Aspnetuserlogins>(0);
	private Set<Aspnetroles> aspnetroleses = new HashSet<Aspnetroles>(0);
	private Set<Collocationoffre> collocationoffres = new HashSet<Collocationoffre>(0);
	private Set<Alert> alerts = new HashSet<Alert>(0);

	private  List<Comment> comments;
	public User() {
	}

	public User(String id, Date birthday, Date createDate, boolean smoker, int zipCode, boolean emailConfirmed,
			boolean phoneNumberConfirmed, boolean twoFactorEnabled, boolean lockoutEnabled, int accessFailedCount,
			String discriminator) {
		this.id = id;
		this.birthday = birthday;
		this.createDate = createDate;
		this.smoker = smoker;
		this.zipCode = zipCode;
		this.emailConfirmed = emailConfirmed;
		this.phoneNumberConfirmed = phoneNumberConfirmed;
		this.twoFactorEnabled = twoFactorEnabled;
		this.lockoutEnabled = lockoutEnabled;
		this.accessFailedCount = accessFailedCount;
		this.discriminator = discriminator;
	}

	public User(String id, String firstName, String lastname, Date birthday, Date createDate, String rib, String gender,
			String country, String street, String mainActivity, String hobbies, boolean smoker, String picture,
			int zipCode, String email, boolean emailConfirmed, String passwordHash, String securityStamp,
			String phoneNumber, boolean phoneNumberConfirmed, boolean twoFactorEnabled, Date lockoutEndDateUtc,
			boolean lockoutEnabled, int accessFailedCount, String userName, String typeOfRental, String discriminator,
			Set<Carpool> carpools, Set<Groupcollocation> groupcollocations, Set<Appartement> appartements,
			Set<Aspnetuserclaims> aspnetuserclaimses, Set<Discution> discutions, Set<Appartement> appartements_1,
			Set<Aspnetuserlogins> aspnetuserloginses, Set<Aspnetroles> aspnetroleses,
			Set<Collocationoffre> collocationoffres, Set<Alert> alerts) {
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.birthday = birthday;
		this.createDate = createDate;
		this.rib = rib;
		this.gender = gender;
		this.country = country;
		this.street = street;
		this.mainActivity = mainActivity;
		this.hobbies = hobbies;
		this.smoker = smoker;
		this.picture = picture;
		this.zipCode = zipCode;
		this.email = email;
		this.emailConfirmed = emailConfirmed;
		this.passwordHash = passwordHash;
		this.securityStamp = securityStamp;
		this.phoneNumber = phoneNumber;
		this.phoneNumberConfirmed = phoneNumberConfirmed;
		this.twoFactorEnabled = twoFactorEnabled;
		this.lockoutEndDateUtc = lockoutEndDateUtc;
		this.lockoutEnabled = lockoutEnabled;
		this.accessFailedCount = accessFailedCount;
		this.userName = userName;
		this.typeOfRental = typeOfRental;
		this.discriminator = discriminator;
		this.carpools = carpools;
		this.groupcollocations = groupcollocations;
		this.appartements = appartements;
		this.aspnetuserclaimses = aspnetuserclaimses;
		this.discutions = discutions;
		this.appartements_1 = appartements_1;
		this.aspnetuserloginses = aspnetuserloginses;
		this.aspnetroleses = aspnetroleses;
		this.collocationoffres = collocationoffres;
		this.alerts = alerts;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false, length = 128)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "FirstName")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "Lastname")
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Birthday", nullable = true, length = 19)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate", nullable = true, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "RIB")
	public String getRib() {
		return this.rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	@Column(name = "Gender")
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "Country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "Street")
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "MainActivity")
	public String getMainActivity() {
		return this.mainActivity;
	}

	public void setMainActivity(String mainActivity) {
		this.mainActivity = mainActivity;
	}

	@Column(name = "Hobbies")
	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Column(name = "Smoker", nullable = true)
	public boolean isSmoker() {
		return this.smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	@Column(name = "Picture")
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "ZipCode", nullable = true)
	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "Email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "EmailConfirmed", nullable = true)
	public boolean isEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	@Column(name = "PasswordHash")
	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	@Column(name = "SecurityStamp")
	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	@Column(name = "PhoneNumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "PhoneNumberConfirmed", nullable = true)
	public boolean isPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	@Column(name = "TwoFactorEnabled", nullable = true)
	public boolean isTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LockoutEndDateUtc", length = 19)
	public Date getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	@Column(name = "LockoutEnabled", nullable = true)
	public boolean isLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	@Column(name = "AccessFailedCount", nullable = true)
	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	@Column(name = "UserName")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "TypeOfRental")
	public String getTypeOfRental() {
		return this.typeOfRental;
	}

	public void setTypeOfRental(String typeOfRental) {
		this.typeOfRental = typeOfRental;
	}

	@Column(name = "Discriminator", nullable = true, length = 128)
	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "carpools_users", catalog = "room", joinColumns = {
			@JoinColumn(name = "user_fk", nullable = true, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "carpools_fk", nullable = true, updatable = false) })
	public Set<Carpool> getCarpools() {
		return this.carpools;
	}

	public void setCarpools(Set<Carpool> carpools) {
		this.carpools = carpools;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "collogroups_users", catalog = "room", joinColumns = {
			@JoinColumn(name = "user_fk", nullable = true, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "group_fk", nullable = true, updatable = false) })
	public Set<Groupcollocation> getGroupcollocations() {
		return this.groupcollocations;
	}

	public void setGroupcollocations(Set<Groupcollocation> groupcollocations) {
		this.groupcollocations = groupcollocations;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "appartementuser", catalog = "room", joinColumns = {
			@JoinColumn(name = "User_Id", nullable = true, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Appartement_AppartementId", nullable = true, updatable = false) })
	public Set<Appartement> getAppartements() {
		return this.appartements;
	}

	public void setAppartements(Set<Appartement> appartements) {
		this.appartements = appartements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Aspnetuserclaims> getAspnetuserclaimses() {
		return this.aspnetuserclaimses;
	}

	public void setAspnetuserclaimses(Set<Aspnetuserclaims> aspnetuserclaimses) {
		this.aspnetuserclaimses = aspnetuserclaimses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Discution> getDiscutions() {
		return this.discutions;
	}

	public void setDiscutions(Set<Discution> discutions) {
		this.discutions = discutions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Appartement> getAppartements_1() {
		return this.appartements_1;
	}

	public void setAppartements_1(Set<Appartement> appartements_1) {
		this.appartements_1 = appartements_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Aspnetuserlogins> getAspnetuserloginses() {
		return this.aspnetuserloginses;
	}

	public void setAspnetuserloginses(Set<Aspnetuserlogins> aspnetuserloginses) {
		this.aspnetuserloginses = aspnetuserloginses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "aspnetuserroles", catalog = "room", joinColumns = {
			@JoinColumn(name = "UserId", nullable = true, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "RoleId", nullable = true, updatable = false) })
	public Set<Aspnetroles> getAspnetroleses() {
		return this.aspnetroleses;
	}

	public void setAspnetroleses(Set<Aspnetroles> aspnetroleses) {
		this.aspnetroleses = aspnetroleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Collocationoffre> getCollocationoffres() {
		return this.collocationoffres;
	}

	public void setCollocationoffres(Set<Collocationoffre> collocationoffres) {
		this.collocationoffres = collocationoffres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Alert> getAlerts() {
		return this.alerts;
	}

	public void setAlerts(Set<Alert> alerts) {
		this.alerts = alerts;
	}
    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User(String id, String firstName, String lastname, Date birthday, Date createDate, String gender,
			String country, String street, String mainActivity, String email, String passwordHash, String phoneNumber,
			String userName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.birthday = birthday;
		this.createDate = createDate;
		this.gender = gender;
		this.country = country;
		this.street = street;
		this.mainActivity = mainActivity;
		this.email = email;
		this.passwordHash = passwordHash;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
	}

}
