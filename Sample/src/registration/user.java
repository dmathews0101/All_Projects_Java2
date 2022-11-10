package registration;



	import java.io.Serializable;

	/**
	 * JavaBean class used in jsp action tags.
	 * @author Ramesh Fadatare
	 */
	public class user implements Serializable {
	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
	  
	    private String username;
	    private String password;
	    private String mail;
	    private int dob;
	
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getmail() {
	        return mail;
	    }
	    public void setmail(String mail) {
	        this.mail = mail;
	    }
	    public int getdob() {
	        return dob;
	    }
	    public void setdob(int dob2) {
	        this.dob = dob2;
	    }
	}
