package com.ttinana.bindingeditors;

import java.beans.PropertyEditorSupport;

public class BigUserNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String bigUserName)throws IllegalArgumentException {
				
		if(bigUserName.contains("Mr.") || bigUserName.contains("Ms.")) {

			setValue(bigUserName);
		
		} else {

			bigUserName = "Ms."+bigUserName;
			
			setValue(bigUserName); 
		}
	}
	

}
