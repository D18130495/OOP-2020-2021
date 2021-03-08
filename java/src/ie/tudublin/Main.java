package ie.tudublin;

public class Main
{
    public void arrays()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }
    public void loops()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

<<<<<<< HEAD

=======
    public void arrays()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }
    
>>>>>>> 1d929a5fde2c32c05586db81341eeb20de57dd28
    public void life()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life1());
    }
    
    public void colorfulLife()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ColorfulLife());
    }

    public void starMap()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
    public void gantt()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Gantt());
    }

    public void audio1()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.audio1();
    }
} 