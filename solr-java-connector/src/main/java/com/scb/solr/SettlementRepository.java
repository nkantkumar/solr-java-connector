package com.scb.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
	public interface SettlementRepository extends SolrCrudRepository<Settlement, String> {
		List<Settlement> findBybranchCode(String name);
	}

