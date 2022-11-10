package com.isimtl.java2.model;

public class Student {
	private static final int[] MAX_FIELD_LENGTH = {10,25,25,15};
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastNme) {
		this.lastName = lastNme;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toPaddingString()
	{
		return toPaddingString(" ");
	}
	
	public  String toPaddingHTMLString(String pPadding)
	{
		StringBuilder builder = new StringBuilder("");
		builder.append("<tr>");
		builder.append("<td>");
		builder.append(paddedValue(String.valueOf(getId()),MAX_FIELD_LENGTH[0],pPadding));
		builder.append("</td");
		builder.append("<td>");
		builder.append(paddedValue(getFirstName(),MAX_FIELD_LENGTH[1],pPadding));
		builder.append("</td>");
		builder.append("<td>");
		builder.append(paddedValue(getLastName(),MAX_FIELD_LENGTH[2],pPadding));
		builder.append("</td>");
		builder.append("<td>");
		builder.append(paddedValue(getUserName(),MAX_FIELD_LENGTH[3],pPadding));
		builder.append("</td>");
		builder.append("<td>");
		//paddedValue("Priyankkumar Sunilbhai",25) ---> "Priyankkumar Sunilbhai"
		

		return builder.toString();
	}
	
	
	public static String toHTMLHeaderString(String pPadding)
	{
		StringBuilder builder = new StringBuilder("");
		
		builder.append("<tr>");
		builder.append("<th>");
		builder.append(paddedValue("ID",MAX_FIELD_LENGTH[0],pPadding));
		builder.append("</th");
		builder.append("<th>");
		builder.append(paddedValue("First Name",MAX_FIELD_LENGTH[1],pPadding));
		builder.append("</th>");
		builder.append("<th>");
		builder.append(paddedValue("Last Name",MAX_FIELD_LENGTH[2],pPadding));
		builder.append("</th>");
		builder.append("<th>");
		builder.append(paddedValue("User Name",MAX_FIELD_LENGTH[3],pPadding));
		builder.append("</th>");
		builder.append("<tr>");
		//paddedValue("Priyankkumar Sunilbhai",25) ---> "Priyankkumar Sunilbhai"
		

		return builder.toString();
	}
	
	
	public String toPaddingString(String pPadding)
	{
		StringBuilder builder = new StringBuilder("");
		builder.append("|");
		builder.append(paddedValue(String.valueOf(getId()),MAX_FIELD_LENGTH[0],pPadding));
		builder.append("|");
		builder.append(paddedValue(getFirstName(),MAX_FIELD_LENGTH[1],pPadding));
		builder.append("|");
		builder.append(paddedValue(getLastName(),MAX_FIELD_LENGTH[2],pPadding));
		builder.append("|");
		builder.append(paddedValue(getUserName(),MAX_FIELD_LENGTH[3],pPadding));
		builder.append("|");
		//paddedValue("Priyankkumar Sunilbhai",25) ---> "Priyankkumar Sunilbhai"
		

		return builder.toString();
	}
	
	private String paddedValue(String pRawValue, int pValueLength)
	{
		return paddedValue(pRawValue, pValueLength, " ");
		
	}	
	
	private static String paddedValue(String pRawValue, int pValueLength, String pPadding) 
	{
		
		//return pRawValue.concat(new String(" ", pValueLength));
		String paddedStr = pRawValue;
		int strLength = pRawValue.length();
		
		if(strLength > pValueLength)
		{
			return pRawValue.substring(0, pValueLength);
		}
		
		for(int i=0;i<pValueLength - strLength;i++)
		{
			paddedStr += pPadding;
		}
		return paddedStr;
		
	}
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastNme=" + lastName + ", userName=" + userName
				+ "]";
	}
	
	
	
}
