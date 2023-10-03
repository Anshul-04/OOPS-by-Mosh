import java.util.*;

public class Main {
    public static void main(String[] args) {

        TextBox textBox1 = new TextBox(); // instantiating the TextBox class

       // var textBox1 = new TextBox();  // we can use var keyword also

        textBox1.text = "Hello world";
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box2");
        System.out.println(textBox2.text);

    }
}