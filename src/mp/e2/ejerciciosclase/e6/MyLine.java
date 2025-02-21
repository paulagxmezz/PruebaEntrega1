package mp.e2.ejerciciosclase.e6;

public class MyLine {
    private MyPoint begin ;

    private MyPoint end;
    private MyPoint x;
    private MyPoint y;
    public MyLine(int x1, int y1, int x2, int y2 ){
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin(){
        return begin;
    }
    public void  setBegin(MyPoint begin){
        this.begin = begin;
    }
    public MyPoint getEnd(){
        return end;

    }
    public void  setEnd(MyPoint end){
        this.end = end;
    }
    public int getBegingX(){
        return begin.getX();
    }
    public void setBegingX(int x){
        begin.setX(x);
    }
    public int getBegingY(){
        return begin.getY();

    }
    public void setBegingY(int y){
        begin.setY(y);

    }
    public int getEndX(){
        return end.getX();

    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getBeginXY (){
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int x,int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int[] getEndXY (){
        return new int[]{end.getX(), end.getY()};

    }
    public void setEndXY(int x,int y){
        end.setX(x);
        end.setY(y);
    }
    public double getLength(){
        return end.distance()-begin.distance();
    }
    public String toString(){
        return "MyLine[begin="+ begin + ", end="+ end + "]";

    }



}

