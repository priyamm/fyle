/**
 * 
 */
package com.priyam.fyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyam.fyle.model.Bank;

/**
 * @author priyamgupta
 *
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long>, BankRepositoryCustom {

}
