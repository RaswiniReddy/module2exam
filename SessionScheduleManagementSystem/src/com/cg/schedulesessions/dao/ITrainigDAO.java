package com.cg.schedulesessions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.schedulesessions.beans.ScheduledSessions;

public interface ITrainigDAO extends JpaRepository<ScheduledSessions, Integer> {
}
