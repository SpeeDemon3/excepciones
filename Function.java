

public class Function {
	
	public static int  treatNumber(String arg) throws BussinessException {
		
		int number = Integer.parseInt(arg);
		
		notEvenNumbers(number);
		notNegativeNumbers(number);
		
		number *= number;

		System.out.println("El resultado es: " + number);
		
		return number;

	}
	
	
	public static void notEvenNumbers(int number) throws BussinessException {
		
		if (number % 2 == 0) {
			throw new BussinessException(BussinessException.ErrorCode.EVEN, "No se permite números pares!!!");
		}
		
	}
	
	public static void notNegativeNumbers(int number) throws BussinessException {
		
		if (number < 0) {
			throw new BussinessException(BussinessException.ErrorCode.NEGATIVE, "No se permiten números negativos!!!");
		}
		
	}

}
