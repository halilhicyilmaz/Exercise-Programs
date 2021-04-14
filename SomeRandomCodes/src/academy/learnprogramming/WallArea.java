package academy.learnprogramming;

public class WallArea {
    private double width;
    private double height;

    public WallArea(){}

    public WallArea(double width, double height){
        this.width = (width<0) ? 0 : width;
        this.height = (height<0) ? 0 : height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width=(width<0) ? 0 : width;
    }

    public void setHeight(double height){
        this.height=(height<0) ? 0 : height;
    }

    public double getArea(){
        return width*height;
    }
}

