public class Hello{
    interface HelloWorld{
        String hello(String message);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = name -> {return "Hello " + name;};
        System.out.println(helloWorld.hello("Alex"));
    }
}
