package com.cloudzoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudzoo.service.BgmService;
import com.cloudzoo.utils.CloudZooJSONResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="背景音乐业务的接口", tags= {"背景音乐业务的controller"})
@RequestMapping("/bgm")
public class BgmController {
	
	@Autowired
	private BgmService bgmService;
	
	@ApiOperation(value="获取背景音乐列表", notes="获取背景音乐列表的接口")
	@PostMapping("/list")
	public CloudZooJSONResult list() {
		return CloudZooJSONResult.ok(bgmService.queryBgmList());
	}
	
}
