package com.scb.solr;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "settlement")
public class Settlement {
	@Id
	@Field
	private String id;
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuyCcy() {
		return buyCcy;
	}

	public void setBuyCcy(String buyCcy) {
		this.buyCcy = buyCcy;
	}

	public String getSellCcy() {
		return sellCcy;
	}

	public void setSellCcy(String sellCcy) {
		this.sellCcy = sellCcy;
	}

	public Integer getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Integer buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Integer getSellAmount() {
		return sellAmount;
	}

	public void setSellAmount(Integer sellAmount) {
		this.sellAmount = sellAmount;
	}
	@Field
	private String branchCode;

	@Field
	private String buyCcy;
	
	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	@Field
	private String sellCcy;
	
	@Field
	private Integer buyAmount;
	
	@Field
	private Integer sellAmount;
	
	public Settlement() {
	}

}
