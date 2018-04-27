/**
 * 
 */
package com.priyam.fyle.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.priyam.fyle.model.Branches;
import com.priyam.fyle.model.RequestBean;

/**
 * @author priyamgupta
 *
 */
public class BankRepositoryImpl implements BankRepositoryCustom {
	@PersistenceContext
	private EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.priyam.fyle.repository.BankRepositoryCustom#getBankBranchList(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	@Transactional
	public List<Branches> getBankBranchList(RequestBean requestBean) {
		List<Branches> branchList = em.createQuery(
				"SELECT BR FROM Branches BR WHERE BR.bank_id IN (SELECT id FROM Bank WHERE name LIKE UPPER(:bank)) AND BR.city LIKE UPPER(:city)",
				Branches.class)
				.setParameter("bank", requestBean.getBank())
				.setParameter("city", requestBean.getCity())
				.setMaxResults(requestBean.getLimit())
				.setFirstResult(requestBean.getOffset())
				.getResultList();
		return branchList;
	}

}
