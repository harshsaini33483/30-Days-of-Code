import java.math.*;
class Solution{
	public static void main(String[] args) {
		BigDecimal bd=new BigDecimal("2");
		MathContext mc = new MathContext(1000);
		BigDecimal ba=new BigDecimal("7");
		
		System.out.println(bd.sqrt(mc));
	}
}