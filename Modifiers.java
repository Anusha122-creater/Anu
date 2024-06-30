package apjfsa;

public class Modifiers {
	
	    // Private variable
	    private int privateVariable;
	    
	   //public setter method for public variable
	    public int publicVariable=70;
	    
	    // Protected variable
	    protected int protectedVariable;
	    
	    // Default (package-private) variable
	    int defaultVariable;

		private java.lang.String setpublicVariable;

		
	    
	    // Public setter method for privateVariable
	    public void setPrivateVariable(java.lang.String string) {
	        this.privateVariable = 30;
	    }
	    
	    // Public getter method for privateVariable
	    public int getPrivateVariable() {
	        return this.privateVariable;
	    }
	    
	    // Public setter method for protectedVariable
	    public void setProtectedVariable(java.lang.String string) {
	        this.protectedVariable = 40;
	    }
	    
	    // Public getter method for protectedVariable
	    public int getProtectedVariable() {
	        return this.protectedVariable;
	    }
	    
	    // Public setter method for defaultVariable
	    public void setDefaultVariable(java.lang.String string) {
	        this.defaultVariable = 50;
	    }
	    
	    // Public getter method for defaultVariable
	    public int getDefaultVariable() {
	        return this.defaultVariable;
	    }
	    
	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create a new MyClass object
	        Modifiers M = new Modifiers();
	        
	        // Set values using setter methods
	        M.setPrivateVariable("30");
	        M.setpublicVariable = ("70");
	        M.setProtectedVariable("40");
	        M.setDefaultVariable("50");
	        
	        // Get and print values using getter methods
	        System.out.println("Private Variable: " + M.getPrivateVariable());
	        System.out.println("Public Variable: " + M.publicVariable);
	        System.out.println("Protected Variable: " + M.getProtectedVariable());
	        System.out.println("Default Variable: " + M.getDefaultVariable());
	    }
	}
	
