package com.capstone.project.service;


import com.capstone.project.logic.Members;

public interface UserService {

	Members getUserOne(String common, String col);

	int userJoin(Members members);

	int setFurn(String route);

}