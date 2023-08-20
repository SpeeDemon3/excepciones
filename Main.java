import java.util.Scanner;

/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 */
public class Main {
	
	public static final String TECH_SIN_ARGS = "Mal formato";

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un argumento para convertirlo en entero:");
		
		String arg = sc.nextLine();
		
		int argNumber = 0;
		
		try {
			
			if(arg.isEmpty()) {
				throw new TechnicalException("No has introducido ningun argumento!!!");
			}
			
			argNumber = Function.treatNumber(arg);
			
		} catch (BussinessException be) {
			
			System.out.println("Se ha producido un error funcional.\n" + be);
			
			switch (be.getErrorCode()) {
			case EVEN:
				System.out.println("Debes introducir números impares.");
				break;
			case NEGATIVE:
				System.out.println("Debes introducir números positivos.");
				break;
			}
			
		} catch (TechnicalException te) {
						
			System.err.println("Se ha producido un error técnico.\n" + te);
		
		} catch(NumberFormatException nfe) {
			
			throw new TechnicalException(TECH_SIN_ARGS, nfe);
			
		} finally {
		
			System.out.println("Gracias por utilizar el programa!");
			
		}		
		
		
	}

}
