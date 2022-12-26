package day33_Statics;

public class TestObj {
 static Water water;
 public TestObj(String  color){
 water=new Water(color);
}

}
class Water{
 String color;
 public Water(String color){
  this.color=color;
 }
}
