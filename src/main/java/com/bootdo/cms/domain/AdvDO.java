package com.bootdo.cms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-12-15 16:54:50
 */
public class AdvDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String img;
	//
	private String member;
	//
	private BigDecimal price;
	//
	private BigDecimal totalprice;
	//
	private String stat;
	//
	private String location;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * 获取：
	 */
	public String getImg() {
		return img;
	}
	/**
	 * 设置：
	 */
	public void setMember(String member) {
		this.member = member;
	}
	/**
	 * 获取：
	 */
	public String getMember() {
		return member;
	}
	/**
	 * 设置：
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：
	 */
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	/**
	 * 设置：
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}
	/**
	 * 获取：
	 */
	public String getStat() {
		return stat;
	}
	/**
	 * 设置：
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 获取：
	 */
	public String getLocation() {
		return location;
	}
}
