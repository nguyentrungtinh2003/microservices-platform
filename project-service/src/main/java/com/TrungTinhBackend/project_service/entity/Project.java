package com.TrungTinhBackend.project_service.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Project {
    private Long id;
    private String name;
    private String description;
    private String img;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean deleted;

    public Project() {
    }

    public Project(Long id, String name, String description, String img, LocalDate startDate, LocalDate endDate, boolean deleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.img = img;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deleted = deleted;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
