package com.eapiis.main.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tprovider")
@Getter
@Setter
public class Provider {
	@Id
	@Column(name = "idProvider")
	private String idProvider;

	@Column(name = "name")
	private String name;

	@Column(name = "createdAt")
	private Date createdAt;

	@Column(name = "updatedAt")
	private Date updatedAt;
}