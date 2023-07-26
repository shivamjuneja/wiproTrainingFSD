package com.stackroute.newz.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/*
 * The class "Reminder" will be acting as the data model for the Reminder Table in the database. 
 * Please note that this class is annotated with @Entity annotation. 
 * Hibernate will scan all package for any Java objects annotated with the @Entity annotation. 
 * If it finds any, then it will begin the process of looking through that particular 
 * Java object to recreate it as a table in your database.
 */
@Table(name= "reminders_data")
@Entity
public class Reminder {
	/*
	 * This class should have three fields (reminderId,schedule,news). Out of these
	 * three fields, the field reminderId should be primary key and auto-generated.
	 * This class should also contain the getters and setters for the fields along
	 * with the no-arg , parameterized constructor and toString method. annotate
	 * news field with @OneToOne and add
	 * 
	 * @JsonIgnore annotation.
	 * 
	 * The data type for schedule field should be LocalDateTime. Please
	 * add @JsonSerialize(using = ToStringSerializer.class) for this field
	 */
	@GeneratedValue
	@Id
	private int reminderId;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime schedule;
	@OneToOne(mappedBy="reminder")
	private News news;

	public Reminder(int reminderId, LocalDateTime schedule, News news) {
     setReminderId(reminderId);
     setSchedule(schedule);
     setNews(news);
	}

	public Reminder() {

	}

	public int getReminderId() {
		return reminderId;
	}

	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}

	public LocalDateTime getSchedule() {
		return schedule;
	}

	public void setSchedule(LocalDateTime schedule) {
		this.schedule = schedule;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Reminder reminder = (Reminder) o;
		return reminderId == reminder.reminderId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reminderId);
	}
}
