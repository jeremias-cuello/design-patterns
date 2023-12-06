
public class CuentaAH implements ICuenta{

	public CuentaAH(double saldo) {
		this.setTipo("ahorro");
		this.setSaldo(saldo);
	}
	
	private String tipo;
	private double saldo;
	
	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo > 0) this.saldo = saldo;
		else throw new Error("saldo negativo");
	}
	
	public void setTipo(String tipo) {
		if(tipo == "ahorro") this.tipo = tipo;
		else throw new Error("tipo incorrecto");
	}

	@Override
	public ICuenta clonar() {
		CuentaAH cuenta = null;
		try {
			cuenta = (CuentaAH) clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return cuenta;
	}
	
	@Override
	public String toString() {
		return "CuentaAhorro{ Tipo: " + this.getTipo() + " - Saldo: " + this.getSaldo() + "}";
	}
	
}
