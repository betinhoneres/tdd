package modulo1.exercicio.lista;

import java.util.Calendar;

public class Resumo {

	private Calendar data;
	private double maior;
	private double menor;

	public Resumo(Calendar data, double maior, double menor) {
		this.data = data;
		this.maior = maior;
		this.menor = menor;
	}
	public Calendar getData() {
		return data;
	}
	public double getMaior() {
		return maior;
	}
	public double getMenor() {
		return menor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		long temp;
		temp = Double.doubleToLongBits(maior);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(menor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resumo other = (Resumo) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(maior) != Double.doubleToLongBits(other.maior))
			return false;
		if (Double.doubleToLongBits(menor) != Double.doubleToLongBits(other.menor))
			return false;
		return true;
	}

}