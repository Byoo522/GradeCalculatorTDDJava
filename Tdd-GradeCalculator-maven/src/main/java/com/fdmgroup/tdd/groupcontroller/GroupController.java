package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService {

	DatabaseReader dbRead;

	public GroupController(DatabaseReader dbRead) {
		this.dbRead = dbRead;
	}

	@Override
	public Map<String, Trainee> getAllTrainees() {
		Map<String, Trainee> trainees = dbRead.readGroup();
		return trainees;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		
	}

	
	
}
