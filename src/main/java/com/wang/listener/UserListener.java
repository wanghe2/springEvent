package com.wang.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.wang.event.UserEvent;
/**
 * springboot中定义listener有好几种方式，这里直接使用注解扫描
 * @author wanghe
 *
 */
@Component
public class UserListener implements ApplicationListener<UserEvent>{

	public void onApplicationEvent(UserEvent event) {
		System.err.println("用户操作监听事件---:"+event.getSource());		
	}

}
