package com.cg.schedulesessions.services;

import java.util.List;

import com.cg.schedulesessions.beans.ScheduledSessions;

public interface ITrainingService {
	public List<ScheduledSessions> getAllSessions();
	public ScheduledSessions getSession(String sessionId);
}
