package com.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserAppInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user_appInfo", catalog = "appstore")
public class TUserAppInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String appName;
	private String appVersion;
	private String mac;
	private Timestamp time;
	private String packageName;

	// Constructors

	/** default constructor */
	public TUserAppInfo() {
	}

	/** full constructor */
	public TUserAppInfo(String appName, String appVersion, String mac,
			Timestamp time, String packageName) {
		this.appName = appName;
		this.appVersion = appVersion;
		this.mac = mac;
		this.time = time;
		this.packageName = packageName;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "appName")
	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Column(name = "appVersion")
	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Column(name = "mac")
	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@Column(name = "time", length = 19)
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@Column(name = "packageName")
	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

}