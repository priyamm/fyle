/**
 * 
 */
package com.priyam.fyle.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyam.fyle.repository.BankRepository;

/**
 * @author priyamgupta
 *
 */
@RestController
@RequestMapping("bank")
public class BankController {
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private BankRepository bankRepository;
	
	@GetMapping(value = "{bank}/{city}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Branch> getBranchList(@PathParam("bank") String bank, @PathParam("city") String city) {
		logger.info("Accessing getBranchList...");
		return null;
	}
	
}
