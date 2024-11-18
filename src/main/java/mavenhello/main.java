package mavenhello;

public class main {
	public static void main(String[] args) {
        System.out.println(new main().getGreeting());
    }

    public String getGreeting() {
        return "Hello, Jenkins Pipeline!";
    }
}
