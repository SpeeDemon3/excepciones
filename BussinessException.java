/**
 * @author Antonio Ruiz Benito -> SpeedDemoN
 * 
 * Clase para tratar errores de negocio
 * 
 */
public class BussinessException extends Exception {
	
	private ErrorCode errorCode;
	
	public BussinessException(ErrorCode errorCode, String detailMessage) {
		this(errorCode, detailMessage, null);
	}
	
	public BussinessException(ErrorCode errorCode, String message, Throwable cause) {
		super(generateMessage(errorCode, message), cause);
		this.errorCode = errorCode;
	}
		
	private static String generateMessage(ErrorCode error, String message) {
		return error + message;
	}
	
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	
	
	enum ErrorCode {
		NEGATIVE("El número recibido es negativo."), 
		EVEN("El número recibido es par.");
			
		private String message;
			
		ErrorCode(String message) {
			this.message = message;
		}
			
		@Override			
		public String toString() {
			return "ERROR: " + message + "\nDetalle: ";
		}
		
	}
	
}

