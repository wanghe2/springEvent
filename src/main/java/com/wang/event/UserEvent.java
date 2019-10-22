package com.wang.event;

import org.springframework.context.ApplicationEvent;
/**
 * 自定义事件（进行用户操作时触发事件）
 * @author wanghe
 *
 */
public class UserEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = 1L;

	public UserEvent(Object source) {
		super(source);
	}

}
