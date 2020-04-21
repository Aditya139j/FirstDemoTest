package com.nt.boot.examle3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDaoRepository extends JpaRepository<MX_REGMTB, Long> {

	public MX_REGMTB findByUserId(String userId);

}
