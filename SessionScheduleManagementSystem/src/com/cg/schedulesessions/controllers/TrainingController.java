package com.cg.schedulesessions.controllers;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.schedulesessions.beans.ScheduledSessions;
import com.cg.schedulesessions.services.TrainingServiceImpl;

@Controller
public class TrainingController {
	
	@Autowired(required=true)
	private TrainingServiceImpl service;
	
	@RequestMapping(value="/")
	public ModelAndView getIndexPage() {
		List<ScheduledSessions> aList=service.getAllSessions();
		return new ModelAndView("ScheduledSessions","aList",aList);
	}
	
	@RequestMapping(value="/enrollMe",method=RequestMethod.GET)
	public ModelAndView enrollStudent(@RequestParam("sessionId")String sessionId) throws SecurityException, IllegalStateException, NotSupportedException, SystemException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		ScheduledSessions session=service.getSession(sessionId);
		return new ModelAndView("Success","session",session);
	}
}
