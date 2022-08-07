public class cricle{
   protected double radius;
 public void circle(double radius){

 }

    @Override
    public String toString() {
        return "cricle{" +
                "radius=" + radius +
                '}';
    }

    public Object getPerimeter() {
        return null;
    }
    public Object getArea(){
        return null;
    }
   public interface GeometricObject {
     public double getPerimeter();
     public double getArea();
   }

   public class ResizableCircle{
     double redius;

       @Override
       public String toString() {
           return "ResizableCircle{" +
                   "redius=" + redius +
                   '}';
       }
       public void resize(int percent){
           int redius= (int) (percent/100.0);

       }
   }
 public interface Resizale{
     public void resize(int percent);

 }

}
