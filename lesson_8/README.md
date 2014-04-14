Chapter 8
=========
The following program demonstrates the usability and powerful application of arrays and its single dimensional matrix.
Arrays can allow you the ability of storing values and using it as a means of comparing and using data throughout your program.
As with most majority Java Applications, we have two files.
One is the main application and the other is the class of methods that are called out to carry special task needed by the main program.
We created our main class with two imports, a decimal format that will format a double value as a means of simplifying its output and a scanner in order to accept user inputted arguments.
The first variable created is the integer of students which will hold the number of students entered by a user.
Next we instantiate the student grades in which will be accessed at sent as an argument.
Next we prompt the user for a specific number of students in a class.
Following this, we then assign the entered value to the student grades argument which will send that number over to the Grade Calculator Class.
Within the class we have quite a few specialties built within the program itself.
For one, the number sent as an argument determines automatically the length of the array and therefore the array itself is not predefined by any preset number.

This allows the user a freedom of choice.
Next we use Java’s utility library of Random in order to generate a random number between 0-100 in the arrays.
This allows each student to have their own unique grade.
Next, the main form calls out the sort grades method in which sorts the array in descending order from least to greatest.
It also creates a backup array that stores each of the same value into a backup array.
As a result, we can output ordered list correctly.
Next a method call of student grades determines if the backup array does indeed match the original array –by comparison it does and thus returns a string statement.
Next a few method calls are called one by another that determines the highest grade on the list, the average grade among the list, the median grade that lies in the middle on the list, and even the most occurring number in the list.
These abilities are all carried out by simple algorithms that beautifully demonstrate the application of iteration within arrays.
For example, the maximum grade finder simply uses a comparison of each element array and then assigning the highest number to the max value that is returned.
Or the average merely uses the arithmetic comparison of total and number of students.
Even median and mode grades use a fairly simple comparison that easily returns the wanted valued.
By understanding the application of each, it’s clear that arrays allow a special way of organizing and comparing large amount of data within a considerably quick time reference.
