class mother{
    int x;
  static void show()
    {
        System.out.println(" hello world ");
    }
}
/* if mother is static only 

Main.java:14: error: incompatible types: mother cannot be converted to child
	child c1=new mother();
	         ^
child.java:3: error: show() in child cannot override show() in mother
   void  show()
         ^






*/