package com.cg.schedulesessions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.schedulesessions.beans.ScheduledSessions;
import com.cg.schedulesessions.dao.ITrainigDAO;
import com.cg.schedulesessions.exceptions.InvalidInputException;
import com.cg.schedulesessions.exceptions.SessionNotFoundException;

@Service(value = "service")
public class TrainingServiceImpl implements ITrainingService {

	@Autowired
	private ITrainigDAO daoService;

	@Override
	public List<ScheduledSessions> getAllSessions() {
		List<ScheduledSessions> aList = daoService.findAll();
		if (aList == null) {
			throw new SessionNotFoundException("Session details not found");
		}
		return aList;
	}

	@Override
	public ScheduledSessions getSession(String sessionId){
		if (sessionId == null) {
			throw new InvalidInputException("Invalid Session");
		}
		return daoService.findOne(Integer.parseInt(sessionId));
	}
}
