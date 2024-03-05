package src;
import java.awt.*;

public class Ray{
    private Point entryPoint;//axial coord of hexagons from which is enters

    private Point direction;//directions of array movement;

    private Point exitPoint;
    public Ray(Point entryPoint,Point direction){
        if(direction.x < -1 || direction.y<-1 || direction.x > 1 || direction.y>1){
            throw new IllegalArgumentException("direction out of range");
        }
        this.entryPoint = entryPoint;
        this.direction = direction;
    }

    public Point getEntryPoint(){
        return this.entryPoint;
    }

    public Point getDirection(){
        return this.direction;
    }

    public void setDirection(Point direction){
        if(direction.x < -1 || direction.y<-1 || direction.x > 1 || direction.y>1){
            throw new IllegalArgumentException("direction out of range");
        }
        this.direction = direction;
    }


    public void setExitPoint(Point exitPoint){
        this.exitPoint = exitPoint;
    }


}

