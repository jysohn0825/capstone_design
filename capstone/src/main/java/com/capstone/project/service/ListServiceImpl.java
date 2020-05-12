package com.capstone.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.project.dao.ListDAO;
import com.capstone.project.logic.Lists;

@Service
public class ListServiceImpl implements ListService{
   
   @Autowired
   ListDAO listDAO;
   
   @Override
   public List<Lists> getListOne(String type, String brand, String price) {
      return listDAO.getListOne( type, brand, price);
   }
   
   @Override
   public List<Lists> getBasketList(String ID){
	   return listDAO.getBasketList(ID);
   }
   
}