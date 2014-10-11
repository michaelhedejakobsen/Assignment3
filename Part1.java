import javax.swing.JOptionPane;

/**
 * Purpose: Prompt user for username, password, and account type.
 *@author Michael Hede Jakobsen
 * Date: 10 October 2014
 *
 * Pseudo code / Algorithm:
 *1. START
 *2. INITIALIZE String uname, pass, inputPass, inputName, accountType, accountMichael, and int attempt
 *3. LOOP - do this while attempt <=2
 *4.	INPUT/OUTPUT - Dialog box PROMPT user for user name
 *5. 		CONDITION - IF the inputName is the same as uname
 *6. 			LOOP - do this while attempt<=2
 *7.				INPUT/OUTPUT - Dialog box PROMPT user for password
 *8. 					CONDITION - IF inputPass is the same as pass
 *9.						QUIT the loop
 *10.					CONDITION - ELSE
 *11. 						OUTPUT - Dialog box PROMPT it is the wrong password
 *12.						INCREMENT attempt by 1
 *13. 		CONDITION - ELSE
 *14.		 	OUTPUT - Dialog box PROMPT it is the wrong user name
 *15.			INCREMENT attempt
 *16. END LOOP
 *17. CONDITION - IF the inputName is NOT the same as uname OR inputPass is NOT the same as pass AND attempt = 2
 *18. 	OUTPUT - Dialog box PROMPT user that account is locked
 *19.	EXIT program
 *20. Create array of strings: choices
 *21. 	LOOP - do this while accountMichael != accountType
 *22. 		Cast accountType to String - Dialog box with drop down list - PROMPT user for selection
 *23. 		SWITCH CASE - based on accountType
 *24.			CASE - accountType = Admin
 *25.				CONDITION - IF the accountType is the same as accountMichael
 *26.					OUTPUT - Dialog box PROMPT "Welcome Admin"
 *27.					QUIT the loop
 *28.			CASE - accountType = Student
 *29.				CONDITION - IF the accountType is the same as accountMichael
 *30.					OUTPUT - Dialog box PROMPT "Welcome Student"
 *31.					QUIT the loop
 *32.			CASE - accountType = Staff
 *33.				CONDITION - IF the accountType is the same as accountMichael
 *34.					OUTPUT - Dialog box PROMPT "Welcome Staff"
 *35.					QUIT the loop
 *36. EXIT the program
 */
public class Part1 {

	public static void main(String[] args) {
		//Initialize variables
		String uname = "Michael";
		String pass= "csc200";
		String inputPass = "";
		String inputName = "";
		int attempt = 0;
		String accountMichael = "Admin";
		String accountType;
		
		//LOOP - do this while attempt <=2
		do{
		
		//INPUT/OUTPUT - Dialog box PROMPT user for user name
		inputName = JOptionPane.showInputDialog("Enter username");	
		
		//CONDITION - IF the inputName is the same as uname
		if(uname.equals(inputName))
		{
			//LOOP - do this while attempt<=2
			do
			{
				//INPUT/OUTPUT - Dialog box PROMPT user for password
				inputPass = JOptionPane.showInputDialog("Please enter password");
				
				//CONDITION - IF inputPass is the same as pass
				if(inputPass.equals(pass))
				{
					//QUIT the loop
					break;
				}
				//CONDITION - ELSE
				else
					//OUTPUT - Dialog box PROMPT it is the wrong password
					JOptionPane.showMessageDialog(null, "Wrong password");
					//INCREMENT attempt by 1
					attempt++;
				
			}while(attempt<=2);
			
			if(uname.equals(inputName))
			break;
		
		}
		//CONDITION - ELSE
		else
			
			//OUTPUT - Dialog box PROMPT it is the wrong user name
			JOptionPane.showMessageDialog(null, "Invalid Username");
			//INCREMENT attempt by 1
			attempt++;

		}while(attempt<=2);
		
		//Boolean = inputName is NOT the same as uname OR inputPass is NOT the same as pass AND attempt = 2
		boolean allNotOk = (!inputPass.equals(pass) || !uname.equals(inputName) && attempt==2);
		
		//CONDITION - IF allNotOk is true
		if (allNotOk)
		{
			//OUTPUT - Dialog box PROMPT user that account is locked
			JOptionPane.showMessageDialog(null,"Your account has been locked - Contact Administrator");	
			//Exit program
			System.exit(attempt = 2);
		}
		
		//Create array of strings: choices
		String[] choices = { "Admin", "Student", "Staff"};

		//LOOP - do this while accountMichael != accountType
		do
		{
			//Cast accountType to String - Dialog box with drop down list - PROMPT user for selection
			accountType=(String)JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
		
			//SWITCH CASE - based on accountType
			switch (accountType)
			{
				//CASE - accountType = Admin
				case "Admin":
					//CONDITION - IF the accountType is the same as accountMichael
					if(accountType.equalsIgnoreCase(accountMichael))
					{
						//OUTPUT - Dialog box PROMPT "Welcome Admin"
						JOptionPane.showMessageDialog(null,"Welcome Admin");
						//QUIT the loop	
						break;	
					}
				//CASE - accountType = Student
				case "Student":
					//CONDITION - IF the accountType is the same as accountMichael
					if(accountType.equalsIgnoreCase(accountMichael))
					{
						//OUTPUT - Dialog box PROMPT "Welcome Student"
						JOptionPane.showMessageDialog(null,"Welcome Student");
						//QUIT the loop	
						break;
					}
				//CASE - accountType = Staff
				case "Staff":
					//CONDITION - IF the accountType is the same as accountMichael
					if(accountType.equalsIgnoreCase(accountMichael))
					{
						//OUTPUT - Dialog box PROMPT "Welcome Staff"
						JOptionPane.showMessageDialog(null,"Welcome Staff");
						//QUIT the loop	
						break;
					}
			}
		}while(!accountMichael.equalsIgnoreCase(accountType));
		//EXIT the program
		System.exit(attempt=3);
	}
}