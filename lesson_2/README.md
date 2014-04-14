Chapter 3
=========
The following program allows users to calculate the future value of investment within the condtion of submitted information.
By taking advantage of Java's Class Libraries, we are able to access the information submitted by the user and then calculate it.
The program prompts the user as to the purpose of the program and then creates the constructor that uses the class of scanner and its method of in.
By doing so, we can call out the method for scan and assign the user inputted data to a variable of double and/or integer.
After the user inputs their principle investment, the value of that is assigned to the integer of principle.
The same applies to double interest.
Next, the program assigns the double value of five/ten/twentyYears to the value of the compound interest formula.
That is, finalValue = principle * (1 + interesRate)^numberOfYears.
By using the class of Math and its method POW, we are able to indicate the years by raising the value to the appropriate power.
The order of operations reflects that the calculations are carried out correctly.
Lastly, by taking advantage of the java.text package, we are able to format our final results within a currency format. Ultimately, the following program demonstrates the power of classes and its methods. By implementing them within our code, we are able to create a dynamic program that can handle user submitted data and use it to calculate the correct values.
