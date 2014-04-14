Chapter 9
=========
When John Conway took a look at the entire universe, he saw that math is anything but complicated.
Instead, Mathematics itself was the easy part.
Life on its own was far more complex to explain.
Yet with a simple program, a program in which was governed by three rules, Conway showed that although life may be quite complex, complexity itself can arise from simple rules.
Life, a game which was governed by the most basic ingredients of life, was managed, unlike ours, by only three simple rules.
First, each cell with one or no neighbors dies, as if by loneliness whereas each cell with three neighbors becomes populated.
The second rule, each cell with four or more neighbors dies, as if by overpopulation.
Lastly, each cell with two or three neighbors survives.
Within these rules is what governs the universe that John Conway created and it is through these simple rules that we have developed the simple algorithms that demonstrate the true complexity of life.

Within our program we’ve included three files: a main file that deals with the relative universe of PlayLife.
java, a World.
java class that revolves around the containment of each cell, and a Cell.
java in which returns the proper Boolean values of the program.
Within this universe, we create a few integer variables that will contain row, column, generations, as well as index values.
Next, we create a Boolean test and checker that will be used in our up-coming do loop and for loop.
After which a World My World caller of new world sends a 10 x 10 instance variable argument over to the class of World.
Within this the default class method, the array and its size is sent over to be copied into a cell array in which will then be used as the return argument throughout this entire program.
Moreover, the program defaults all cells to false so that whatever print value does not receive a value will be deemed as false and thus gain the value of a dot for a false value when the toString method is called.
Next, within PlayLife.
java a Scanner is setup into a scan variable and is then instantiated to hold the users initial input.
Next the program informs the user that the following program will output a 10 X 10 life cell that is determined by user allotted input.
The program prompts the user to enter a value.
A do loop is launched to check if whether the coordinates entered for either row or column scanned into do not test within the allotted values.
If the row or column is beyond 9 or less than 0 then the cell itself is out of bound and therefore the do loop can no longer continue because the Boolean value of test will be assigned false and thus ending our loop.
A do loop is most appropriate and logical, as it allows a user to enter a value and then is checked to if whether either values entered are false.
For a row may be correct but perhaps not a column –this test allows us to cover all grounds.
It is then assumed that whenever a user enters out of bound row and columns that the program will end its populating process.
Else, if the user enters correct parameters, then those row and column will be sent as an instant variable argument to the method of make Alive which will work through its method in which will assign the true value to the value of column and row sent as an argument.
The cell’s row and column number will then be made “alive.
” This do loop within the main class of PlayLife.
java will continue until the do loop is given a false value which will only happen upon a user input that is out of bound.
Once this is done, the user will be informed that the populating process has ended.
Next, the user will be prompted to enter a value in which will determine how many generations they would like to see.
If the user enters five, for example, then the progression of five generation will be printed so long as each generation produces a live off spring.
A initial print of my world is created to show generation 1 that was created by the user.
By doing so, the user will see their initial values entered which was created by the to String method.
The toString method prints out a false value as a dot to indicate death and an alive value of an X to indicate a true value.

By doing so, the user can see graphically the initial values and the values of the generations to come.
A for loop is created that will run through the amount of generations indicated by the user.
Each time a my World method of next generation will be called out in which will populate the cell with the entered generation cell and rows.
A checker is then created that will send out the checker of true as an argument to a method of checker within the World.
java class.
The checker will go through each row and see if there is indeed an alive cell.
If all cells are theoretically dead, then the process of displaying generations will end and all dead cells will stop producing because there is no more cells to show or produce.
If this is the case, then a checker will check to see if the statement comes back false, if so then the program will indicate to the user that all cells have stopped populating and thus resulted in ending of all populations.
If this occurs, then the program will exit as its process of population is completed.
Of course, if the process returns true, then we will see the next generation via the print out method of the string method of my world cell.
This process will continue until it has either exercised all generations OR has returned a value of false by the checker.

Ultimately, this program demonstrates a few amazing initiatives that was created by John Conway.
The first is that we have the ability of inputting what cells we would like to see alive and even see a limit of those cells exercised based on how many generation we would like to see cycled.
Not only does the user have the power to see firsthand their own generational creation but see it exercise and reproduce itself upon the three simple rules of life: birth, life, death.
All this is done wonderfully through class methods and the power of two dimensional arrays.


