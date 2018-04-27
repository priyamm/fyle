/**
 * 
 */
package com.priyam.fyle.repository;

import org.dom4j.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author priyamgupta
 *
 */
@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {

}
