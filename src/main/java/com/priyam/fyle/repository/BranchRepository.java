/**
 * 
 */
package com.priyam.fyle.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.priyam.fyle.model.Branches;

/**
 * @author priyamgupta
 *
 */
@Repository
public interface BranchRepository extends JpaRepository<Branches, String> {

	/**
	 * @param ifsc
	 * @return
	 */
	Optional<Branches> findByIfsc(String ifsc);
	
	/**
	 * @param bank
	 * @param city
	 * @return
	 */
	@Query(value = "SELECT BR FROM BRANCHES BR WHERE BR.BANK_ID IN (SELECT ID FROM BANKS WHERE NAME = 'STATE BANK OF INDIA') AND BR.CITY = 'MUMBAI'", 
			nativeQuery=true)
	Iterable<Branches> findBranchList(String bank, String city);


}
