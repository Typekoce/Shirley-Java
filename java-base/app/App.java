public class App {

  public static void main(String[]  args){

    AppController cont = new AppController();

    cont.data.setData("foo","bar");

    cont.run("home");

  }
}
