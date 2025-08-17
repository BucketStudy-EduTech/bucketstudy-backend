package com.BucketStudy.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "challenges")
public class Challenge {
	
	@Id
	private String id;
	
    private String title;
    private String description;
    private double prizePool;
    private double registrationFee;
    private int teamSize;
    private Date startDate;
    private Date endDate;

    public Challenge() {
    }

	public Challenge(String id, String title, String description, double prizePool, double registrationFee,
			int teamSize, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.prizePool = prizePool;
		this.registrationFee = registrationFee;
		this.teamSize = teamSize;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrizePool() {
		return prizePool;
	}

	public void setPrizePool(double prizePool) {
		this.prizePool = prizePool;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Challenge [id=" + id + ", title=" + title + ", description=" + description + ", prizePool=" + prizePool
				+ ", registrationFee=" + registrationFee + ", teamSize=" + teamSize + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

   
}

