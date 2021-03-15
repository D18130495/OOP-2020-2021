package ie.tudublin;

public class Main
{
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