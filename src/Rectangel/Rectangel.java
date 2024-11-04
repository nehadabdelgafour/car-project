package Rectangel;

public class Rectangel {
    public double length;
    public double width;

    public Rectangel()
    {
        length=11;
        width=22;
        System.out.println("a new room created with " +
                 length + "m lenth and meter width" + width);
    }
    public Rectangel(Double l,Double w)
    {
        length=l;
        width=w;
    }
    public void setLength (double l)
    {
        l=70;

        length=l;

    }
    public void modifyobject(Rectangel r)
    {
        r.length=67;
        r.width=98;
    }
    public Rectangel add(Rectangel room2){
        Rectangel result =new Rectangel();
        result.length= this.length+room2.length;
        result.width=this.width+room2.width;
        return result;
    }
    public void setWidth (double w)
    {
        width=w;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getarea()
    {
        return length*width;
    }

}
