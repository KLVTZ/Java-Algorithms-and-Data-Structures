Chapter 4
=========
The following program takes two words as input from the keyboard, one representing User ID and the other Password.
By using if/else statements, we can compare the data entered to the correct data needed by the user.
As always, we import our java utility library for scanner in order to accept user inputted data.
Next, we define a few string variables.
The string userID and password will represent the User ID and password entered by the user.
Next we define a value for scanner by calling out its class of Scanner and method of in.
Next, we output a simple string informing the user to log-in.
The user is then prompted to enter their userID which is assigned to the string userID and their password which is assigned to the string password.
Next we take advantage of the conditional if/else statements.
The advantage of these statements lies within its’ concrete logic.
Our first if statement creates the condition in which the string userID and password must equal the string value of “admin” and “open.
” As a result, this creates a final decision in which the user must enter the correct conditions in order to execute its statement.
In this instance, if both conditions are true, then the system will output Welcome.
Else if the userID is correct but the password is not, then the system will print “wrong password.
” In the same case, if the password is correct but the User ID is not, the system will print the string “wrong user ID.
” It’s of particular interest to consider the two above conditions as they reflect the basis of De Morgan’s Law -- that true and false is False.
Therefore, the two conditions required that one statement must be true and the other must be false.
The conditional false statement had to occur in order for one of the conditions to execute.
Lastly, we include an else statement that is executed if all else statements are false.
That is, if the user inputted data does not satisfy one of the three conditions.
Then the else statement will simply output that the user has inputted a “wrong ID and Password.”
Ultimately, the following program reflects the power of if/else statements in relation to string values. As a result, the logic reflected here demonstrates the beauty of conditions.
