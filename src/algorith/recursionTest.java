package algorith;

public class recursionTest {
public static void main(String[] args) {
	addByone(0);
}
	public static void addByone(int num) {
	num ++;
	addByone(num);
System.out.println(num);
if(num <= 1000) {
	addByone(num);
}
	}
}
