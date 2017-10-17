package com.mikespider.api.urlApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mikespider.springbootMagic.service.UrlService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/urlApi")
public class UrlApi {
	@Autowired
	UrlService urlService;
	@ApiOperation(value="获取用户名")
	@RequestMapping(value="/urlName",method=RequestMethod.GET)
	public String getUrlName() {
		return urlService.getString();
	}
}
