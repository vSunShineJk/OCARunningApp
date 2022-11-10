package mentoring.abu.commandLineRunning;

public class Program {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    /*
    how to run a class from command line ?
        0. locate to location of class
            cd absolute-path
        1. Create bytecode with javac command
            javac Program.java
        2. Run this class using java keyword
            java Program.java

        PS> sometimes u may leave out the extension -> java Program
     */
}
