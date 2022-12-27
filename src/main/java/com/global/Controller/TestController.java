package com.global.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.global.Entity.Test;
import com.global.Service.TestService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@PostMapping("/Add")
	public ResponseEntity<HashMap<String, String>> add(@RequestBody Test  t,HttpServletRequest r) {
		 
//		 testService.getClientIp(r);
		
		 Test t1=new Test();
		 t1.setIpAddressTest(t.getIpAddressTest());
		 if(t.getIpAddressTest().equals(testService.getClientIp(r))) {
			 
			 HashMap<String, String> message = new HashMap<>();
			 message.put("message", "Your IP Address is" +" "+ testService.getClientIp(r));
		     return ResponseEntity.status(HttpStatus.OK).body(message);
		 }else{
				
				HashMap<String, String> message = new HashMap<>();
				message.put("message", "Ip Address is error");
			    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
			}
		 /*
		
		String x=testService.getClientIp(r);
		 
		if(testService.getClientIp(r).endsWith(x)) {
			
			HashMap<String, String> message = new HashMap<>();
			message.put("message", "Your IP Address is" +" "+ testService.getClientIp(r));
		    return ResponseEntity.status(HttpStatus.OK).body(message);	
		}else if(!testService.getClientIp(r).equalsIgnoreCase(x)){
			
			HashMap<String, String> message = new HashMap<>();
			message.put("message", "Ip Address is error");
		    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		}else {
			return null;
		}
		*/
	//	String clientIp = testService.getClientIp(r);
		
		// return ("your IP Address is : " +clientIp);
	}

}
