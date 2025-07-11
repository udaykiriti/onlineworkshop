package com.studentworkshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;  
import java.time.LocalTime;  

@Entity
@Table(name = "registrations")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long workshopId; 
    private String workshopName; 
    private String username; 
    private String email; 
    private LocalDate date; 
    private LocalTime time; 

    public Registration() {}

    public Registration(Long workshopId, String workshopName, String username, String email, LocalDate date, LocalTime time) {
        this.workshopId = workshopId;
        this.workshopName = workshopName;
        this.username = username;
        this.email = email;
        this.date = date; 
        this.time = time; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(Long workshopId) {
        this.workshopId = workshopId;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() { 
        return date;
    }

    public void setDate(LocalDate date) { 
        this.date = date;
    }

    public LocalTime getTime() { 
        return time;
    }

    public void setTime(LocalTime time) { 
        this.time = time;
    }
}
