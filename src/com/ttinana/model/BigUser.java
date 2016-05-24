/**
 * 
 */
package com.ttinana.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.ttinana.validators.bigUser.IsValidHobby;


/**
 * @author tijana.pavicic
 *
 */
public class BigUser {
	@NotEmpty
	@Pattern(regexp="[^0-9]*")
	String bigUserName;
	@Size(min=2, max=30, message="Please enter Hobby field beetwen {min} and {max}")
	@IsValidHobby
	String bigUserHobby;
	@Max(1000000000)
	Long bigUserMobile;
	@Past
	Date bigUserDoB;
	ArrayList<String> bigUserSkills;
	Address bigUseraddress;
	/**
	 * 
	 */
	public BigUser() {
	}
	/**
	 * @param bigUserName
	 * @param bigUserHobby
	 * @param bigUserMobile
	 * @param bigUserDoB
	 * @param bigUserSkills
	 */
	public BigUser(String bigUserName, String bigUserHobby, Long bigUserMobile,
			Date bigUserDoB, ArrayList<String> bigUserSkills) {
		this.bigUserName = bigUserName;
		this.bigUserHobby = bigUserHobby;
		this.bigUserMobile = bigUserMobile;
		this.bigUserDoB = bigUserDoB;
		this.bigUserSkills = bigUserSkills;
	}

	/**
	 * @return the bigUserName
	 */
	public String getBigUserName() {
		return bigUserName;
	}

	/**
	 * @param bigUserName
	 *            the bigUserName to set
	 */
	public void setBigUserName(String bigUserName) {
		this.bigUserName = bigUserName;
	}

	/**
	 * @return the bigUserHobby
	 */
	public String getBigUserHobby() {
		return bigUserHobby;
	}

	/**
	 * @param bigUserHobby
	 *            the bigUserHobby to set
	 */
	public void setBigUserHobby(String bigUserHobby) {
		this.bigUserHobby = bigUserHobby;
	}

	/**
	 * @return the bigUserMobile
	 */
	public Long getBigUserMobile() {
		return bigUserMobile;
	}

	/**
	 * @param bigUserMobile
	 *            the bigUserMobile to set
	 */
	public void setBigUserMobile(Long bigUserMobile) {
		this.bigUserMobile = bigUserMobile;
	}

	/**
	 * @return the bigUserDoB
	 */
	public Date getBigUserDoB() {
		return bigUserDoB;
	}

	/**
	 * @param bigUserDoB
	 *            the bigUserDoB to set
	 */
	public void setBigUserDoB(Date bigUserDoB) {
		this.bigUserDoB = bigUserDoB;
	}

	/**
	 * @return the bigUserSkills
	 */
	public ArrayList<String> getBigUserSkills() {
		return bigUserSkills;
	}

	/**
	 * @param bigUserSkills
	 *            the bigUserSkills to set
	 */
	public void setBigUserSkills(ArrayList<String> bigUserSkills) {
		this.bigUserSkills = bigUserSkills;
	}

	/**
	 * @return the bigUseraddress
	 */
	public Address getBigUseraddress() {
		return bigUseraddress;
	}

	/**
	 * @param bigUseraddress the bigUseraddress to set
	 */
	public void setBigUseraddress(Address bigUseraddress) {
		this.bigUseraddress = bigUseraddress;
	}

	public static BigUser getInitializedObject() {
		return new BigUser();
	}

}
