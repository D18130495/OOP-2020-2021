package ie.tudublin;

public class Main
{
    public void loops()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    public static void main(String[] args)
    {
        Main main = new Main();
        main.loops();
    }
} 