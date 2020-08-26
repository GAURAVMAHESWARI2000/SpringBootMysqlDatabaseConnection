package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(method=RequestMethod.POST,value="/save")
	public void save(User user) {   //@RequestParam
	userService.save(user);	
	}

}
