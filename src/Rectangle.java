/**
 * Created by rohityarlagadda on 4/28/17.
 */
public class Rectangle implements IShape{

        Integer length;
     // Wrapper Class's
        Integer breadth;

    public Rectangle(int length,int breadth) {
        this.length=length;
        this.breadth=breadth;
    }

     public void area(){
         int value=length*breadth;
         System.out.println("Area is" +value);
     }
     public void perimeter(){
         int value = 2*(length+breadth);
         System.out.println("Perimeter is" +value);
     }

}
