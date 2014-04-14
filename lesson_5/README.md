Chapter 6 
=========
The following program allows the user to input a decimal value and have its value converted to base two binary.
By using two simple while loops, we are able to take advantage of Java's simple conditional testing.
As always, we make use of Java’s Utility Library of Scanner in which the user enters their desired input variable and is assigned to the entered Number variable.
Then the entered Number variable is pretested by the while loop making sure that its value does not equal 0.
After, a remainder is assigned the MOD value by 2 and then an if statement is launched that checks to see if the MOD remainder value does not equal 0.
If there is indeed a remainder, then the holder string is assigned the value of 1.
Else, if there is no remainder, then the string holder is concatenated the value of 0.
Once this while loop no longer is true, the index is assigned the length value of the string and decrements it by one in order to create the pre assigned boundary value.
Next we use a second while loop to assign the base value string the string value but backwards.
This algorithm solves the common problem arising from converting base 10 to base 2 and thus allows us to output converted decimals greater than 1024.
In other words, a simpler algorithm exists but its integer value is bounded by a smaller value.
This method allows for a larger decimal input by the user.
Ultimately, the following program demonstrates the power of while loops within Java.
