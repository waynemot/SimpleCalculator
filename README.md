# SimpleCalculator
A simple calculator pedagogue in Java for use in teaching exercises

This is an Eclipse project so you can use the Import function of Eclipse to pull it into your workspace.  As the name and description imply, this is a pedagogue for teaching several aspects of programming.  The provided source has no GUI, intentionally, since testing GUI's isn't easy in Java.  The classes provided are simple enough that the subject can be used for teaching JUnit test development, and the undocumented nature of the source allows using it to teach Javadoc (used as a subject for the students to do Javadoc on.)  The third use I envision for this is for teaching fault insertion and/or mutation testing, since it is again simple yet affords enough functionality that a student will learn the rudiments of mutation testing (by executing their JUnit/testNG tests on it once the mutation is applied.)

It should be noted that there is an intentional bug within the code (which I will not reveal the location of here) thus tests written for this subject should reveal that bug if you have properly implemented the test cases for all of the functions of the calculator classes and methods.
