import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("greeting") + ", " + name;
  }

  public static void main(String[] args) {
    //oh yay I fixed a bug!!
    String language = args[0];
    String country = args[1];
<<<<<<< HEAD
    String name = args[2].toUpperCase();
=======
    String name = "##"+args[2]+"##";
>>>>>>> feature-2
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}
