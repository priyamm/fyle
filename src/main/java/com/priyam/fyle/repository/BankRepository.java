/**
 * 
 */
package com.priyam.fyle.repository;

import java.util.List;

import org.dom4j.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.priyam.fyle.model.Bank;

/**
 * @author priyamgupta
 *
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

	/**
	 * @param bank
	 * @param city
	 * @return
	 */
//	@Query("SELECT BR FROM BRANCHES BR WHERE BR.BANK_ID IN (SELECT ID FROM BANKS WHERE NAME = 'STATE BANK OF INDIA') AND BR.CITY = 'MUMBAI'")
//	List<Branch> findBranchList(String bank, String city);

}
