/**
 * 
 */
package com.ttinana.model;

/**
 * @author tijana.pavicic
 *
 */
public class User {
	String formName;
	String formHobby;

	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @param formName
	 * @param formHobby
	 */
	public User(String formName, String formHobby) {
		this.formName = formName;
		this.formHobby = formHobby;
	}

	/**
	 * @return the formName
	 */
	public String getFormName() {
		return formName;
	}

	/**
	 * @param formName
	 *            the formName to set
	 */
	public void setFormName(String formName) {
		this.formName = formName;
	}

	/**
	 * @return the formHobby
	 */
	public String getFormHobby() {
		return formHobby;
	}

	/**
	 * @param formHobby
	 *            the formHobby to set
	 */
	public void setFormHobby(String formHobby) {
		this.formHobby = formHobby;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((formHobby == null) ? 0 : formHobby.hashCode());
		result = prime * result
				+ ((formName == null) ? 0 : formName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (formHobby == null) {
			if (other.formHobby != null)
				return false;
		} else if (!formHobby.equals(other.formHobby))
			return false;
		if (formName == null) {
			if (other.formName != null)
				return false;
		} else if (!formName.equals(other.formName))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// return super.toString();
		return this.getFormName() + this.getFormHobby();
	}

}
