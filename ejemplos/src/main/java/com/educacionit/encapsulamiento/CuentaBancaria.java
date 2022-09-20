package com.educacionit.encapsulamiento;

public class CuentaBancaria {
	private Long id;
	private Float saldo=0.0F;
	private Boolean activa;
	private String moneda;
	
	
	public void depositarDinero(Float monto) {
		this.saldo = this.saldo + monto;
	}
	
	public void extraerDinero(Float monto) {
		//validaciones
		//reglass
		//llamadas a otros métodos u objetos
		saldo = saldo - monto;
	}
	
	public Float mostrarSaldo() {
		return saldo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Boolean getActiva() {
		return activa;
	}

	public void setActiva(Boolean activa) {
		this.activa = activa;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	

}
