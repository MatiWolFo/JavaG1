package com.generation.F220601.models;
//THIS IS ALL AN EXAMPLE
public class MishiExample extends PetCat{
	private Boolean netMishi;

	/**
	 * 
	 */
	public MishiExample() {
		super();
	}

	/**
	 * @param netMishi
	 */
	public MishiExample(Boolean netMishi) {
		super();
		this.netMishi = netMishi;
	}

	public Boolean getNetMishi() {
		return netMishi;
	}

	public void setNetMishi(Boolean netMishi) {
		this.netMishi = netMishi;
	}

	@Override
	public String toString() {
		return "MishiExample [netMishi=" + netMishi + "]";
	}
	
}
