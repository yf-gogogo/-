package chapter2_1.Widget;

public abstract class Widget {
    protected String name;

    public abstract void prepare();
    public void DisplayWidget()
    {
        System.out.println(name+" is created;");
    }
    public void setname(String name)
    {
        this.name=name;
    }
}
