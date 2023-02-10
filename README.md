# Year-11-CS-Unit-6-Quiz-Dog

# class Dog

1. A Dog class will have <b>three</b> instance variables. Ensure that each instance variable is declared as <b>private</b>.  
* age
* name
* color (String)
2. A Dog class will have <b>two</b> constructors. 
* The first constructor will be <b>parameterless</b> and will initialize age to 0, and name and color to empty Strings. 
* The second constructor will have <b>three</b> parameters. The three parameters will be used to initialize the three instance variables. 
3. A Dog class will have a <b>getter</b> method for each instance variable.
4. A Dog class will have a <b>setter</b> method for each instance variable.
5. A Dog class will have a <b>private</b> method called <b>addOneAge</b> that is parameterless and increments the age of the Dog.
6. A Dog class will have a method called <b>birthday</b> that calls addOneAge and returns the age of the Dog.
7. A Dog class will have a <b>toString</b> method that returns, for example, a String in the following format:
* "The dog is named Marlo and is 5 years old. This dog is black."

# class DogMaker

Inside the main method ...

1. Create a Dog object. The reference to this Dog object should be called <b>dog</b>. The Dog's name should be Jill, age 2, colour black and tan. This should be done in a <b>single</b> statement.
2. Use a <b>setter</b> method to change the Dog's name from Jill to Jessie.
3. Call the <b>addOne</b> method to increase the age of Jessie to 3.
4. Use a <b>getter</b> method and <b>print</b> statement to print out the age of Jessie. Print out the age only, and use the println method to print. Do this using a <b>single</b> statement.
5. Call the <b>birthday</b> method and store this into a variable called <b>age</b>.
6. Print out the contents of the variable called <b>age</b>. Use the println method to print.
7. Print out the current state of the Dog object. That is, print the <b>reference</b> to the Dog object. This will automatically call the toString method. 
