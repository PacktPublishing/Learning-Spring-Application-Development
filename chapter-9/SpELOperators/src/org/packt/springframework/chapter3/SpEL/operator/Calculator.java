package org.packt.springframework.chapter3.SpEL.operator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

	/* Relational operators */

	@Value("#{1 == 1}")	// true
	private boolean isEqual;

	@Value("#{1 != 1}") // false
	private boolean isNotEqual;

	@Value("#{1 < 1}")	// false
	private boolean isLessThan;

	@Value("#{1 <= 1}")	// true
	private boolean isLessThanOrEqual;

	@Value("#{1 > 1}")	// false
	private boolean isGreaterThan;

	@Value("#{1 >= 1}")	// true
	private boolean isGreaterThanOrEqual;

	/* Logical operators , numberBean.no == 999 */

	@Value("#{numberBean.no == 999 and numberBean.no < 900}")	// false
	private boolean isAnd;

	@Value("#{numberBean.no == 999 or numberBean.no < 900}")	// true
	private boolean isOr;

	@Value("#{!(numberBean.no == 999)}")	// false
	private boolean isNot;

	/* Mathematical operators */

	@Value("#{1 + 1}")	// 2.0
	private double addition;

	@Value("#{1 - 1}")	// 0.0
	private double subtraction;

	@Value("#{1 * 1}")	// 1.0
	private double multiplication;

	@Value("#{10 / 2}")	// 5.0
	private double division;

	@Value("#{10 % 10}")	// 0.0
	private double modulus;

	public boolean isEqual() {
		return isEqual;
	}

	public void setEqual(boolean isEqual) {
		this.isEqual = isEqual;
	}

	public boolean isNotEqual() {
		return isNotEqual;
	}

	public void setNotEqual(boolean isNotEqual) {
		this.isNotEqual = isNotEqual;
	}

	public boolean isLessThan() {
		return isLessThan;
	}

	public void setLessThan(boolean isLessThan) {
		this.isLessThan = isLessThan;
	}

	public boolean isLessThanOrEqual() {
		return isLessThanOrEqual;
	}

	public void setLessThanOrEqual(boolean isLessThanOrEqual) {
		this.isLessThanOrEqual = isLessThanOrEqual;
	}

	public boolean isGreaterThan() {
		return isGreaterThan;
	}

	public void setGreaterThan(boolean isGreaterThan) {
		this.isGreaterThan = isGreaterThan;
	}

	public boolean isGreaterThanOrEqual() {
		return isGreaterThanOrEqual;
	}

	public void setGreaterThanOrEqual(boolean isGreaterThanOrEqual) {
		this.isGreaterThanOrEqual = isGreaterThanOrEqual;
	}

	public boolean isAnd() {
		return isAnd;
	}

	public void setAnd(boolean isAnd) {
		this.isAnd = isAnd;
	}

	public boolean isOr() {
		return isOr;
	}

	public void setOr(boolean isOr) {
		this.isOr = isOr;
	}

	public boolean isNot() {
		return isNot;
	}

	public void setNot(boolean isNot) {
		this.isNot = isNot;
	}

	public double getAddition() {
		return addition;
	}

	public void setAddition(double addition) {
		this.addition = addition;
	}

	public double getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(double subtraction) {
		this.subtraction = subtraction;
	}

	public double getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(double multiplication) {
		this.multiplication = multiplication;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
	}

	public double getModulus() {
		return modulus;
	}

	public void setModulus(double modulus) {
		this.modulus = modulus;
	}

}
