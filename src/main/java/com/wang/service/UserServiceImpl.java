package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.wang.event.UserEvent;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void addUser() {
		System.err.println("模拟增加一个用户");
		applicationEventPublisher.publishEvent(new UserEvent("add :user1")) ;
	}

}
