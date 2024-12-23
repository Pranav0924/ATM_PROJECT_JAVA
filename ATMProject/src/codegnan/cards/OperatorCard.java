package codegnan.cards;

import com.codegnan.Interface.IATMService;
import com.codegnan.customexception.InsufficientBalanceException;
import com.codegnan.customexception.InsufficientMachineBalanceException;
import com.codegnan.customexception.InvalidAmountException;
import com.codegnan.customexception.NotAOperatorException;

public class OperatorCard implements IATMService{
	
	private int pinNumber;
	private long id;
	private String name;
	private final String type = "operator";
	
	public OperatorCard(long id,int pin, String name) {
		id = id;
		pinNumber = pin;
		this.name=name;
		
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount) throws InvalidAmountException, InsufficientBalanceException,
			InsufficientMachineBalanceException, InsufficientBalanceException, InsufficientMachineBalanceException {
		
		return 0;
	}

	@Override
	public double depositAmount(double dptAmount) throws InvalidAmountException {
		
		return 0;
	}

	@Override
	public double checkBalance() {
		
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		
		
	}

	@Override
	public int getPinNumber() {
		
		return pinNumber;
	}

	@Override
	public String getUserName() {
		
		return name;
	}

	@Override
	public int getChances() {
		
		return 0;
	}

	@Override
	public void decreaseChances() {
		
	}

	@Override
	public void resetPinChances() {
		
		
	}

	@Override
	public void getMiniStatement() {
		
		
	}

	
}