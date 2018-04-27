/**
 * 
 */
package com.priyam.fyle.repository;

import java.util.List;

import com.priyam.fyle.model.Branches;
import com.priyam.fyle.model.RequestBean;

/**
 * @author priyamgupta
 *
 */
public interface BankRepositoryCustom {
	List<Branches> getBankBranchList(RequestBean requestBean);
}
