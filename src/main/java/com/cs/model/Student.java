package com.cs.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="stdtab ")
public class Student {
	 @Id
	 @Column(name="sid")
	 private Integer id;
	 @Column(name="sname")
	 private String stdName;
	 @Column(name="sfee")
	 private Double stdFee;
	 @Column(name="sgen")
	 private String stdGen;
	 
	 @ElementCollection
	 @CollectionTable(name="coursetab", 
	 joinColumns = @JoinColumn(name="sid"))
	 @Column(name="cname")
	 private List<String> courses;
	 
	 @ElementCollection
	 @CollectionTable(name="langstab",
	 joinColumns = @JoinColumn(name="sid"))
	 @Column(name="langNames   ")
	 private List<String> langs;
}
