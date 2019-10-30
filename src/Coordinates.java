public class Coordinates {

    private String name;
    private Double x;
    private Double y;

    public Coordinates(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Coordinates(double x, double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Double getX(){
        return x;
    }

    public Double getY(){
        return y;
    }

    public String getName(){
        return name;
    }

    public double[] getCoordinates(){
        double coordinates [] = {x, y};
        return coordinates;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
