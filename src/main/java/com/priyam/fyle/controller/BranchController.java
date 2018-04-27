/**
 * 
 */
package com.priyam.fyle.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyam.fyle.repository.BranchRepository;


/**
 * @author priyamgupta
 *
 */
@RestController
@RequestMapping("branch")
public class BranchController {
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private BranchRepository branchRepository;
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public String getBranch() {
		logger.info("Accessing getBranchInfo...");
		return "hello";
	}
	@GetMapping(value = "/{ifsc}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<Branch> getBranchInfo(@PathParam("ifsc") String ifsc) {
		logger.info("Accessing getBranchInfo...");
		return branchRepository.findById(ifsc);
	}
}

