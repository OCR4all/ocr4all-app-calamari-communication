/**
 * File:     Model.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     17.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model;

import java.io.Serializable;
import java.util.List;

/**
 * Define models.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Model implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The booleans.
	 */
	private List<BooleanField> booleans;

	/**
	 * The decimals.
	 */
	private List<DecimalField> decimals;

	/**
	 * The integers.
	 */
	private List<IntegerField> integers;

	/**
	 * The strings.
	 */
	private List<StringField> strings;

	/**
	 * The selects.
	 */
	private List<SelectField> selects;

	/**
	 * Returns the booleans.
	 *
	 * @return The booleans.
	 * @since 17
	 */
	public List<BooleanField> getBooleans() {
		return booleans;
	}

	/**
	 * Set the booleans.
	 *
	 * @param booleans The booleans to set.
	 * @since 17
	 */
	public void setBooleans(List<BooleanField> booleans) {
		this.booleans = booleans;
	}

	/**
	 * Returns the decimals.
	 *
	 * @return The decimals.
	 * @since 17
	 */
	public List<DecimalField> getDecimals() {
		return decimals;
	}

	/**
	 * Set the decimals.
	 *
	 * @param decimals The decimals to set.
	 * @since 17
	 */
	public void setDecimals(List<DecimalField> decimals) {
		this.decimals = decimals;
	}

	/**
	 * Returns the integers.
	 *
	 * @return The integers.
	 * @since 17
	 */
	public List<IntegerField> getIntegers() {
		return integers;
	}

	/**
	 * Set the integers.
	 *
	 * @param integers The integers to set.
	 * @since 17
	 */
	public void setIntegers(List<IntegerField> integers) {
		this.integers = integers;
	}

	/**
	 * Returns the strings.
	 *
	 * @return The strings.
	 * @since 17
	 */
	public List<StringField> getStrings() {
		return strings;
	}

	/**
	 * Set the strings.
	 *
	 * @param strings The strings to set.
	 * @since 17
	 */
	public void setStrings(List<StringField> strings) {
		this.strings = strings;
	}

	/**
	 * Returns the selects.
	 *
	 * @return The selects.
	 * @since 17
	 */
	public List<SelectField> getSelects() {
		return selects;
	}

	/**
	 * Set the selects.
	 *
	 * @param selects The selects to set.
	 * @since 17
	 */
	public void setSelects(List<SelectField> selects) {
		this.selects = selects;
	}

}
