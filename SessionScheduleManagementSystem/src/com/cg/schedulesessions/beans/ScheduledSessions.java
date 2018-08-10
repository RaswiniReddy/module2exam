package com.cg.schedulesessions.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.internal.NotNull;

@Entity
public class ScheduledSessions {
	@NotNull
	@Id
	private int id;
	@NotNull
	private String name;
	@NotNull
	private int duration;
	@NotNull
	private String faculty;
	@NotNull
	private String mode1;

	public ScheduledSessions(int id, String name, int duration, String faculty, String mode1) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}

	public ScheduledSessions() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMode1() {
		return mode1;
	}

	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty + ", mode1="
				+ mode1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + id;
		result = prime * result + ((mode1 == null) ? 0 : mode1.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + duration;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledSessions other = (ScheduledSessions) obj;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (id != other.id)
			return false;
		if (mode1 == null) {
			if (other.mode1 != null)
				return false;
		} else if (!mode1.equals(other.mode1))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (duration != other.duration)
			return false;
		return true;
	}

}
