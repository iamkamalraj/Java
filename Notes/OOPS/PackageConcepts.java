package OOPS;

/*Package => It is an encapuslation mechanism to group all the related classes and interface in single module
While using inbuilt classes also, internally sunmicrosystem has used the pacakges to keep the classes.
Objectives of packages
=====================
1. It resolves the name conflicts
2. It imporoves modularity(maintainence) of the application
3. It provides security
4. It helps the programmer to debug the application in a easy way be referring to the pacakges.
packages naming convention followed by sunmicrosystem
=====================================================
StringBuilder
StringBuffer
String
NullPointerException
ArithmeticException
System
Scanner
javac Sample.java => it would just compile the .class file
javac -d . Sample.java
-d => indicates the destination folder where the package should be created.
. => indicates the location where the package should be created.
it represent the curren location.
eg:
package in.ineuron;
public class Sample
{
public static void main(String[] args)
{
System.out.println("Hey i am working with packages");
}
}
upon using the command javac -d . Sample.java
=>java compiler has created the package and stored the .class file inside the package.

Standard Structure of java program
1. package statement(only one should be there)
2. import statement(can be any number)
3. declartion of class/interface/enum (any number, but only one should be marked as public)

refer: packageConcepts.png*/

public class PackageConcepts { 

}
