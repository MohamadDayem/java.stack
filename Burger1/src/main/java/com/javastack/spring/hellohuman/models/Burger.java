package com.javastack.spring.hellohuman.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity

@Table(name="burgers")
public class Burger {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
  
  @NotNull
  @Size(min=1, max=255, message="Burger name not be null")
  private String name;
  
  
  @NotNull
  @Size(min=1, max=255, message="Restaurannt name not be null")
  private String restaurant;
  
  @NotNull
  @Min(1)
  @Max(5)
  private int rating;
  
  @NotNull
  @Size(min=1, max=255, message="Restaurannt name not be null")
  private String notes;
  
  @Column(updatable=false)
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date createdAt;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date updatedAt;
 

  public Burger () {
	  
  }
  


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRestaurant() {
	return restaurant;
}

public void setRestaurant(String restaurant) {
	this.restaurant = restaurant;
}



public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
}
@PrePersist
protected void onCreate(){
    this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updatedAt = new Date();
}
}
