package com.samples.rate.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rate {
    @Id
    @Column(length=40)
    @GeneratedValue(generator="randomId")
    @GenericGenerator(name="randomId", strategy="com.samples.rate.domain.RandomIdGenerator")
    private String id;

    private String originPostalCode;
    
    private String destinationPostalCode;
    
    private String packageType;
    
    private String serviceType;
    
    private double rate;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the originPostalCode
	 */
	public String getOriginPostalCode() {
		return originPostalCode;
	}

	/**
	 * @param originPostalCode the originPostalCode to set
	 */
	public void setOriginPostalCode(String originPostalCode) {
		this.originPostalCode = originPostalCode;
	}

	/**
	 * @return the destinationPostalCode
	 */
	public String getDestinationPostalCode() {
		return destinationPostalCode;
	}

	/**
	 * @param destinationPostalCode the destinationPostalCode to set
	 */
	public void setDestinationPostalCode(String destinationPostalCode) {
		this.destinationPostalCode = destinationPostalCode;
	}

	/**
	 * @return the packageType
	 */
	public String getPackageType() {
		return packageType;
	}

	/**
	 * @param packageType the packageType to set
	 */
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}
    
    
    
    
}
