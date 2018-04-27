/**
 * 
 */
package com.priyam.fyle.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyam.fyle.helpers.Constants;
import com.priyam.fyle.helpers.FieldValidation;
import com.priyam.fyle.helpers.Messages;
import com.priyam.fyle.helpers.ResponseCode;
import com.priyam.fyle.model.Branches;
import com.priyam.fyle.model.RequestBean;
import com.priyam.fyle.model.StatusCode;
import com.priyam.fyle.repository.BankRepository;
import com.priyam.fyle.repository.BranchRepository;

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

	@Autowired
	private BranchRepository branchRepository;

	@GetMapping(value = "{ifsc}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseCode getBranchInfo(@Valid @PathVariable("ifsc") String ifsc) {
		logger.info("Accessing getBranchInfo...{}", ifsc);
		Optional<Branches> branch = branchRepository.findById(ifsc);
		ResponseCode response = new ResponseCode(branch, StatusCode.RECORD_FETCHED.getValue(), Boolean.TRUE,
				Messages.RECORD_FETCHED);
		return response;
	}

	@PostMapping(value = "list", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseCode getBranchList(@RequestBody RequestBean requestBean) {
		logger.info("Accessing getBranchList...");
		if (!FieldValidation.isValidString(requestBean.getBank())
				|| !FieldValidation.isValidString(requestBean.getCity()))
			return new ResponseCode(null, StatusCode.INVALID_INPUT.getValue(), Boolean.FALSE, Messages.INVALID_INPUT);
		if (!FieldValidation.isValidInteger(requestBean.getOffset()))
			requestBean.setOffset(Constants.DEFAULT_OFFSET);
		if (!FieldValidation.isValidInteger(requestBean.getLimit()))
			requestBean.setLimit(Constants.DEFAULT_LIMIT);
		List<Branches> branchList = bankRepository.getBankBranchList(requestBean);
		ResponseCode response = new ResponseCode(branchList, StatusCode.RECORD_FETCHED.getValue(), Boolean.TRUE,
				Messages.RECORD_FETCHED);
		return response;
	}
}
