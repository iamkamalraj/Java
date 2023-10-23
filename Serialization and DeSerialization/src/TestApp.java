//Agenda
//======
//1. Serialization
//2. Deserialization
//3. transient keyword
//4. static Vs transient
//5. transient Vs final
//6. Object graph in serialization.
//7. customized serialization.
//8. Serialization with respect inheritance.
//9. Externalization
//10. Difference between Serialization & Externalization
//11. SerialVersionUID
//
//Serialization: (1.1 v)
//=> The process of saving (or) writing state of an object to a file is called
//serialization but strictly speaking it is the process of converting an
//       object from java supported form to either network supported form (or) file
//supported form.
//
//=> By using FileOutputStream and ObjectOutputStream classes we can achieve
//serialization process.
//                             |=> writeObject(Object obj)
//
//         Ex: using flipkart booking an iPhone and iPhone reaching to the user.
//
//
//De-Serialization:
//=> The process of reading state of an object from a file is called DeSerialization
//but strictly speaking it is the process of converting an
//       object from file supported form (or) network supported form to java
//supported form.
//=> By using FileInputStream and ObjectInputStream classes we can achieve
//DeSerialization.
//                              |=> readObject()
//
//eg#1.
import   java.io.FileOutputStream;
import   java.io.IOException;
import   java.io.ObjectOutputStream;
import   java.io.FileInputStream;
import   java.io.ObjectInputStream;
import   java.io.Serializable;

class Dog implements Serializable{
      int i=10;
      int j=20;
}

public class TestApp {
      public static void main(String[] args)throws
IOException,ClassNotFoundException {

             Dog d1=new Dog();

             System.out.println("serialization started");
             FileOutputStream fos= new FileOutputStream("abc.ser");
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             oos.writeObject(d1);
             System.out.println("Serialization ended");


           System.out.println("Deserialization started");
           FileInputStream fis=new FileInputStream("abc.ser");
           ObjectInputStream ois=new ObjectInputStream(fis);
           Dog d2=(Dog) ois.readObject();
           System.out.println("Deserialization ended");

           System.out.println("Dog object data");
           System.out.println(d2.i+"\t" +d2.j);

      }
}
//eg#2.
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//
//class Dog implements Serializable{
//       int i=10;
//       int j=20;
//}
//
//class Cat implements Serializable{
//      int i=100;
//      int j=200;
//}
//
//public class TestApp {
//      public static void main(String[] args)throws
//IOException,ClassNotFoundException {
//
//           Dog d1=new Dog();
//           Cat c1=new Cat();
//
//           System.out.println("serialization started");
//           FileOutputStream fos= new FileOutputStream("abc.ser");
//           ObjectOutputStream oos=new ObjectOutputStream(fos);
//           oos.writeObject(d1);
//           oos.writeObject(c1);
//           System.out.println("Serialization ended");
//
//
//           System.out.println("Deserialization started");
//           FileInputStream fis=new FileInputStream("abc.ser");
//           ObjectInputStream ois=new ObjectInputStream(fis);
//           Dog d2=(Dog) ois.readObject();
//           Cat c2=(Cat) ois.readObject();
//           System.out.println("Deserialization ended");
//
//           System.out.println("Dog object data");
//           System.out.println(d2.i+"\t" +d2.j);
//
//           System.out.println("Cat object data");
//           System.out.println(c2.i+"\t" +c2.j);
//     }
//}
//
//Output
//serialization started
//Serialization ended
//Deserialization started
//Deserialization ended
//Dog object data
//10      20
//Cat object data
//100     200
//
//Note:
//1. We can perform Serialization only for Serilizable objects.
//2. An object is said to be Serilizable if and only if the corresponding class
//implements Serializable interface.
//3. Serializable interface present in java.io package and does not contain any
//methods. It is marker interface.
//      The required ability will be provided automatically by JVM.
//4. We can add any no. Of objects to the file and we can read all those objects from
//the file but    in which order we wrote objects in the
//    same order only the objects will come back. That is order is important.if
//there is a mismatch in order it would result in
//   "ClassCastException".
//5. If we are trying to serialize a non-serializable object then we will get
//RuntimeException    saying "NotSerializableException"
//
//
//Transient keyword:
//1. transient is the modifier applicable only for variables,but not for classes and
//methods.
//2. While performing serialization if we don't want to save the value of a
//particular variable to    meet security constant such type of variable ,
//    then we should declare that variable with    "transient" keyword.
//3. At the time of serialization JVM ignores the original value of transient
//variable and save   default value to the file .
//4. That is transient means "not to serialize".
//
//eg#1.
//import   java.io.FileOutputStream;
//import   java.io.IOException;
//import   java.io.ObjectOutputStream;
//import   java.io.FileInputStream;
//import   java.io.ObjectInputStream;
//import   java.io.Serializable;
//
//
//class Dog implements Serializable{
//      int i=10;
//      transient int j=20;
//}
//
//public class TestApp {
//      public static void main(String[] args)throws
//IOException,ClassNotFoundException {
//
//             Dog d1=new Dog();
//             System.out.println("serialization started");
//             FileOutputStream fos= new FileOutputStream("abc.ser");
//             ObjectOutputStream oos=new ObjectOutputStream(fos);
//             oos.writeObject(d1);
//             System.out.println("Serialization ended");
//
//
//             System.out.println("Deserialization started");
//             FileInputStream fis=new FileInputStream("abc.ser");
//             ObjectInputStream ois=new ObjectInputStream(fis);
//             Dog d2=(Dog) ois.readObject();
//             System.out.println("Deserialization ended");
//
//             System.out.println("Dog object data");
//             System.out.println(d2.i+"\t" +d2.j);
//
//      }
//}
//Output
//serialization started
//Serialization ended
//Deserialization started
//Deserialization ended
//Dog object data
//10      0
//
//static Vs transient :
//1. static variable is not part of object state hence they won't participate in
//serialization   because of this declaring a static variable as
//    transient there is no use.
//
//import   java.io.FileOutputStream;
//import   java.io.IOException;
//import   java.io.ObjectOutputStream;
//import   java.io.FileInputStream;
//import   java.io.ObjectInputStream;
//import   java.io.Serializable;
//
//class Dog implements Serializable{
//       static transient int i=10;
//       int j=20;
//}
//
//public class TestApp {
//      public static void main(String[] args)throws
//IOException,ClassNotFoundException {
//
//             Dog d1=new Dog();
//
//             System.out.println("serialization started");
//             FileOutputStream fos= new FileOutputStream("abc.ser");
//             ObjectOutputStream oos=new ObjectOutputStream(fos);
//             oos.writeObject(d1);
//
//             System.out.println("Serialization ended");
//
//
//             System.out.println("Deserialization started");
//             FileInputStream fis=new FileInputStream("abc.ser");
//             ObjectInputStream ois=new ObjectInputStream(fis);
//             Dog d2=(Dog) ois.readObject();
//
//             System.out.println("Deserialization ended");
//
//             System.out.println("Dog object data");
//             System.out.println(d2.i+"\t" +d2.j);
//      }
//}
//Output
//serialization started
//Serialization ended
//Deserialization started
//Deserialization ended
//Dog object data
//10      20
//
//Transient Vs Final:
//1. final variables will be participated into serialization directly by their
//values.
//     Hence declaring a final variable as transient there is no use.
//        //the compiler assign the value to final variable
//
//eg: final int x= 10;
//      int y = 20;
//      System.out.println(x);// compiler will replace this as System.out.println(20)
//becoz x is final.
//      System.out.println(y);
//
//import   java.io.FileOutputStream;
//import   java.io.IOException;
//import   java.io.ObjectOutputStream;
//import   java.io.FileInputStream;
//import   java.io.ObjectInputStream;
//import   java.io.Serializable;
//
//class Dog implements Serializable{
//     int i=10;
//     transient final int j=20;
//}
//
//
//public class TestApp {
//      public static void main(String[] args)throws
//IOException,ClassNotFoundException {
//
//             Dog d1=new Dog();
//
//             System.out.println("serialization started");
//             FileOutputStream fos= new FileOutputStream("abc.ser");
//             ObjectOutputStream oos=new ObjectOutputStream(fos);
//             oos.writeObject(d1);
//
//             System.out.println("Serialization ended");
//
//
//             System.out.println("Deserialization started");
//             FileInputStream fis=new FileInputStream("abc.ser");
//	          ObjectInputStream ois=new ObjectInputStream(fis);
//           Dog d2=(Dog) ois.readObject();
//
//           System.out.println("Deserialization ended");
//
//           System.out.println("Dog object data");
//           System.out.println(d2.i+"\t" +d2.j);
//
//      }
//}
//Output
//Serialization started
//Serialization ended
//Deserialization started
//Deserialization ended
//Dog object data
//10      20
//
//
//Declaration output
//================
//1.
//int i=10;
//int j=20;
//output:: 10   20
//
//2.
//transient int i=10;
//int j=20;
//output:: 0 20
//
//3.
//transient int i=10;
//transient static int j=20;
//output:: 0 20
//
//4.
//transient final int i=10;
//transient int j=20;
//output:: 10 0
//
//5.
//transient final int i=10;
//transient static int j=20;
//output: 10 20
//
//Note:
//We can serialize any no of objects to the file but in which order we serialized in
//the same order only we have to deserialize,
//if we change the order then it would result in "ClassCastException".
//
//Example :
//Dog d1=new Dog( );
//Cat c1=new Cat( );
//Rat r1=new Rat( );
//
//FileOutputStreamfos=new FileOutputStream("abc.ser");
//ObjectOutputStreamoos=new ObjectOutputStream(fos);
//oos.writeObject(d1);
//oos.writeObject(c1);
//oos.writeObject(r1);
//
//FileInputStreamfis=new FileInputStream("abc.ser");
//ObjectInputStreamois=new ObjectInputStream(fis);
//Dog d2=(Dog)ois.readObject();
//Cat c2=(Cat)ois.readObject();
//Rat r2=(Rat)ois.readObject();
//
//=> If we don't know the order of Serialization then we need to use the following
//code
//      FileInputStream fis =new FileInputStream("abc.ser");
//      ObjectInputStream ois=new ObjectInputStream(fis);
//
//     Object obj=ois.readObject();/runtime object can be Dog,Cat,Rat
//     if(obj instanceof Dog){
//           Dog d=(Dog)obj;// parent type type casting
//           //perform operation related to Dog
//     }
//     if(obj instanceof Cat){
//           Cat C=(Cat)obj;
//         //perform operation related to Cat
//     }
//     if(obj instanceof Rat){
//            Rat r=(Rat)obj;
//          //perform operation related to Rat
//     }
//

