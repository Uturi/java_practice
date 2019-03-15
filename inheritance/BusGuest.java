public class BusGuest {
	public static void main(String[] args) {
		Bus b1 = new Bus("6515", "½Ã³»¹ö½º", "°í½ÃÃÌ");
		System.out.println("b1 >> "+ b1.busInfo()+ "ÇöÀç ½Â°´Àº "+b1.sumCount+" ¸í");

		int people = 2;
		b1.getOn(people);
		System.out.println("ÀÌ¹ø¿¡ Å¾½ÂÇÑ ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		people = 6;
		b1.getOn(people);
		System.out.println("ÀÌ¹ø¿¡ Å¾½ÂÇÑ ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		people = 10;
		b1.getOn(people);
		System.out.println("ÀÌ¹ø¿¡ Å¾½ÂÇÑ ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		people = 40;
		b1.getOn(people);
		System.out.println("ÀÌ¹ø¿¡ Å¾½ÂÇÑ ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		people = 10;
		b1.getOut(people);
		System.out.println("ÀÌ¹ø¿¡ ³»¸° ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		people = 35;
		b1.getOut(people);
		System.out.println("ÀÌ¹ø¿¡ ³»¸° ½Â°´ ¼ö´Â "+people+"¸í ÇöÀç ½Â°´ ¼ö´Â " +b1.sumCount+"¸í");
		
	}
}
