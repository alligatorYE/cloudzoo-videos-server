package com.cloudzoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudzoo.pojo.Users;
import com.cloudzoo.service.crud.UserCRUDService;
import com.cloudzoo.utils.CloudZooJSONResult;

@RestController
@RequestMapping("/crud")
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService userCRUDService;
	
	@RequestMapping("/save")
	public CloudZooJSONResult save() {
		
		Users user = new Users("1001", "test-saveuser-1001",
				"123456", "/path", "动物云", null, null, null);
		userCRUDService.saveUser(user);
		
		return CloudZooJSONResult.ok();
	}
	
	@RequestMapping("/update")
	public CloudZooJSONResult update() {
		
		Users user = new Users("1001", "test-saveuser-1111",
				"77777", "/path000", "动物云好牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return CloudZooJSONResult.ok();
	}
	
	@RequestMapping("/update2")
	public CloudZooJSONResult update2() {
		
		Users user = new Users("1001", null,
				"9999", "/path000999", "来了就说点什么吧", null, null, null);
		userCRUDService.updateUser(user);
		
		return CloudZooJSONResult.ok();
	}
	
	@RequestMapping("/delUser")
	public CloudZooJSONResult delUser() {
		
		userCRUDService.delete();
		
		return CloudZooJSONResult.ok();
	}
}
