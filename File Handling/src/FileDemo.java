//File(IO Package)
//==============
//  Agenda:
//1. File
//2. FileWriter
//3. FileReader
//4. BufferedWriter
//5. BufferedReader
//
//File:
//  File f=new File("abc.txt");
// This line 1st checks whether abc.txt file is already available (or) not, if it is
//already available then "f" simply refers that file.
//  If it is not already available then it won't create any physical file just
//creates a java File object represents name of the file.
//
//Example:
//import java.io.*;
//class FileDemo{
//      public static void main(String[] args)throws IOException{
//            File f=new File("abc.txt");
//            System.out.println(f.exists());//false
//
//           f.createNewFile();
//           System.out.println(f.exists());//true
//      }
//}
//1st run
//=======
//false
//true
//
//2nd run
//======
//true
//true
//
//=> A java File object can represent a directory also.
//Example:
//import   java.io.File;
//import   java.io.IOException;
//
//class FileDemo{
//  public static void main(String[] args)throws IOException{
//      File f=new File("cricket123");
//      System.out.println(f.exists());//false
//
//     f.mkdir();//Creates a new directory
//     System.out.println(f.exists());//true
//  }
//}
//1st run
//=======
//false
//true
//
//2nd run
//======
//true
//true
//
//Note: In UNIX everything is a file, java "file IO" is based on UNIX operating
//system
//             hence in java also we can represent both files and directories by File
//object only.
//
//
//Constructors of File class
//==========================
// File f=new File(String fname)
// File f=new File(String directoryName,String fileName);
// File f=new File(File f,String fileName);
//
//File class constructors
//========================
//1. File f=new File(String name);
//    => Creates a java File object that represents name of the file or directory in
//current working directory.
//            eg#1. File f=new File("abc.txt");
//
//2. File f=new File(String subdirname,String name);
//    => Creates a File object that represents name of the file or directory present
//in specified sub directory.
//            eg#1. File f1=new File("abc");
//                        f1.mkdir();
//                           File f2=new File("abc","demo.txt");
//                        f2.createNewFile();
//
//3. File f=new File(File subdir,String name);
//            eg#1.File f1=new File("abc");
//                        f1.mkdir();
//                      File f2=new File(f1,"demo.txt");
//                        f2.createNewFile();
//
//Requirement
//===========
//=> Write code to create a file named with demo.txt in current working directory.
//            cwd
//             |=> abc.txt
//
//Program:
//import java.io.*;
//class FileDemo{
//      public static void main(String[] args)throws IOException{
//            File f=new File("demo.txt");
//            f.createNewFile();
//      }
//}
//Requirement
//=> Write code to create a directory named with IPLTeam in current working directory
//and create a file named with abc.txt in that directory.
//             cwd
//               |=> IPLTeam
//                      |=> abc.txt
//Program:
//import java.io.*;
//class FileDemo{
//  public static void main(String[] args)throws IOException{
//        File f1=new File("IPLTeam");
//        f1.mkdir();
//        File f2=new File("IPLTeam","abc.txt");
//        f2.createNewFile();
//    }
//}
//
//Requirement: Write code to create a file named with rcb.txt present in D:\IPLTeam
//folder.
//                  D
//                  |=> IplTeam
//                        |-> rcb.txt
//Program:
//import java.io.*;
//class FileDemo{
//      public static void main(String[] args)throws IOException{
//            File f=new File("D:\\IPLTeam","rcb.txt");
//            f.createNewFile();
//      }
//}
//Assuming C:\\IPLTeam should be already available otherwise it would result in
//"FileNotFoundException".
//