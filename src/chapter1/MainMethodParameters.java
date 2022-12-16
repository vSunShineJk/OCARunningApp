package chapter1;

public class MainMethodParameters {
    public static void main(String[] args) {
        System.out.println("Sample main method");
    }
}

class MainMethodParameters2{
    public static void main(String args[]) {
        System.out.println("replacing 'String[] args' to --> 'String args[]'");
    }
}

class MainMethodParameters3{
    public static void main(String... args) {
        System.out.println("replacing 'String[] args' to --> 'String... args'");
    }
}

class MainMethodParameters4{
    public static void main(String[] characters) {
        System.out.println("We can even change 'args' variable's name to anything, fo example, 'public static void main(String[] characters)'");
    }
}

