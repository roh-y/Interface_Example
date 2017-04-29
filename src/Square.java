/**
 * Created by rohityarlagadda on 4/28/17.
 */
public class Square implements IShape{

    int side;
    public Square(int side) {
        this.side = side;
    }


    public void area(){
        int value= side*side;
        System.out.println("Area is " +value);
    }
    public void perimeter(){
        int value=4*side;
        System.out.println("Perimeter is " +value);
    }



}
