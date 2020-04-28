package com.kushkumardhawan.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class Shops {

	
	@Id
	@GeneratedValue(generator = "shops_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "shops_id_seq", sequenceName = "public.shops_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "owner")
	private String owner;

	@Column(name = "location")
	private String location;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Shops [id=" + id + ", name=" + name + ", owner=" + owner + ", location=" + location + "]";
	}

}
