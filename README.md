# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.
	Created Dog.java, abstract class Animal is in it along with class Dog.

2. What five objects are created in the main?
	Main creates an ArrayList dogs, a new Comparator object, and 3 new Dogs.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
	The constructor call is the new Comparator<Animal>() part of:
	Collections.sort(dogs, new Comparator<Animal>(){ ..}
	The class/interface definition for Comparator is not explicitly seen or declared by us.
	It is part of the java.util package and is brought in by import java.util.Comparator;

