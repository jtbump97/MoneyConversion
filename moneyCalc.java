package Money;

public class moneyCalc {
	
	private int euro;
	private int bitcoin;
	private int usd;
	private int peso;
	private int ethereum;
	private Currency output;

	
	public moneyCalc(int euro, int bitcoin, int usd, int peso, int ethereum, Currency output) {
		this.euro = euro;
		this.bitcoin = bitcoin;
		this.usd = usd;
		this.peso = peso;
		this.ethereum = ethereum;
		this.output = output;
		
	}
	
	public moneyCalc(String inputFile, Currency output) {
		
		if(output == Currency.EURO) {
			
		}
		else if(output == Currency.BITCOIN) {
			
		}
		else if(output == Currency.USD) {
			
		}
		else if(output == Currency.PESO) {
			
		}
		else if(output == Currency.ETHEREUM) {
			
		}	
		
	}
	
	
	
	public int numEuro() {
		return euro;
	}
	
	public int numBitcoin() {
		return bitcoin;
	}
	
	public int numUsd() {
		return usd;
	}
	
	public int numPeso() {
		return peso;
	}
	
	public int numEthereum() {
		return ethereum;
	}
}
