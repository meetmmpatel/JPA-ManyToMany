package com.example.jpa.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "tags")
public class Tag implements Serializable {

	private static final long serialVersionUID = 5757912774364551750L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max = 100)
	@NaturalId
	private String name;

	@ManyToMany(fetch = FetchType.LAZY, 
			cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "tags")
	private Set<Post> posts = new HashSet<>();

	public Tag(@NotNull @Size(max = 100) String name) {
		super();
		this.name = name;
	}

	public Tag() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

}