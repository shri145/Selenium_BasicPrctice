package interviewProgram;

//interface declaration
interface TestInterface { 
  // static method definition
  static void static_print()    { 
      System.out.println("TestInterface::static_print ()"); 
  } 
  // abstract method declaration 
  void nonStaticMethod(String str); 
} 
 
//Interface implementation 
class TestClass implements TestInterface { 
  // Override interface method
  @Override
  public void nonStaticMethod(String str)   { 
      System.out.println(str); 
  } 
}
public class InterfaceEx{
	  public static void  main(String[] args)   { 
      TestClass classDemo = new TestClass(); 
 
      // Call static method from interface 
      TestInterface.static_print(); 
 
      // Call overridden method using class object 
      classDemo.nonStaticMethod("TestClass::nonStaticMethod ()"); 
  } 
}
