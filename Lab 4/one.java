class one{
    int x;
    one(int z)
  {
      x=z;
  }
 void show()
 {
     System.out.println(x);
 }
}
/* 
Error 
Two.java:5: error: constructor one in class one cannot be applied to given types;
class Two extends one{
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error



*/