/**
 * Created by rohityarlagadda on 4/28/17.
 */
public class Main {
    public static void main(String[] args){
        IShape a= new Square(2);
        a.area();
        a.perimeter();

        IShape b= new Rectangle(2,3);
        b.area();
        b.perimeter();

    }

}
