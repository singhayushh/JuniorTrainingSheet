import java .awt.*;
class ChoiceExample
{
    ChoiceExample()
    {
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(100,100, 75,75);
        c.add("Java");
        c.add("Python");
        c.add("C++");
        c.add("C#");
        c.add("C");
        c.add("Lua");
        c.add("Ruby");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ChoiceExample();
    }
}
