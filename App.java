public class App {
    public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int t = a;
	a = b;
	b = t;
	System.out.println(a);
	System.out.println(b);

	int y = (int)0.25;
	
	System.out.println(y);
    }
}
