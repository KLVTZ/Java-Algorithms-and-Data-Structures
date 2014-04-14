Chapter 7
=========
The following program, although quite complex and at first bizarre, demonstrates the importance of classes and methods within Java’s UI.
One of the key challenges of the following project is to send as arguments a string and integer fields to a class of weather in order to return a string value of the corrected Celsius conversion while making sure to check that the parameters do not exceed range boundaries or limits within their fields.
The first access of this program is to create a String method that will be used to be assigned the value of the method call of toString in relation to weather.
Next, we create a separate file that deals with the class regarding weather.
We entitle it weatherClass.
java.
From within our main CIS111.
java we create a new object of weather that can be used to call out the method toString.
Next we output this value with the help of System.
out.
println(message).
Keep in mind the message we are printing is a returned string that is concatenated by a pre-written string.
In other words, when the message is called out, it directs itself to the returned value it was assigned from the toString.
From the toString method call, lists of comparisons are carried out that verify whether the default values or the newly assigned values are within the range of -51 to +150.
Next, it verifies that your entered arguments of instance variables do not conflict with one another.
To demonstrate such, we’ve two test scenarios that demonstrate the inconsistent weather.
After each call to the ToString method we output the message value on its own line.
Next we create a new object within the weatherClass that allows us to create a new object with a new value data type of String “Sunny” and integer of 70.
The reason for this creation is to verify that our default string, which is set to the same values, indeed does matches.
By using a Boolean equals call method we are able to correctly compare not only the string value entered but also the integer value.
Next, we create a few test scenarios to verify that our program works in its entirety.
Yet, the user should take note that we set a new weather value by the setNew action that calls out another method within the weather object of weatherClass.
Within this method, setNew assigns the newly entered weather and temperature to the private assigned conditions.
This allows the program to work logically in comparing each method call of the toString method while still maintaining each comparison and list.
After such a comparison, and in fact after all conditional comparisons, if both the string and the integer verify to be correct and within range, the program converts the numeric Fahrenheit value to Celsius.
This is completed by a simple equation provided by the textbook.
Within the last bit of our program, we take advantage of testing to make sure that the program informs the user when a temperature and weather condition do not seem logical or out of range.
In our first two testers, we create weather temperatures that exceed the allotted range.
By doing so we can see Java correctly finds these values and informs the user.
The other two situations, one in which it is snowing in over a hundred degree weather and the other is it is sunny when it is below freezing.
In both cases, the program catches the error and informs the user that the following input is illogical.
Ultimately, the program demonstrates the beauty and logic of methods and their classes.
