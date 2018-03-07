public class HelloWorld {
    public static String hello(String name) {
        if (name == null){
            return "Hello, World!";
        }
        if (name.equals("")) {
            return "Hello, World!";
        } 
        return "Hello, " + name + "!";
    }
}
