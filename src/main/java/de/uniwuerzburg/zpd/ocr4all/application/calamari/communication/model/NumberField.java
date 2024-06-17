/**
 * File:     NumberField.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     17.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model;

/**
 * Defines number fields.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class NumberField<T extends Number> extends Field<T> {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The legal number intervals. Null if not defined.
	 */
	private T step;

	/**
	 * The minimum value. Null if not defined.
	 */
	private T minimum;

	/**
	 * The maximum value. Null if not defined.
	 */
	private T maximum;

	/**
	 * Returns the legal number intervals.
	 *
	 * @return The legal number intervals. Null if not defined.
	 * @since 1.8
	 */
	public T getStep() {
		return step;
	}

	/**
	 * Set the legal number intervals. Null if not defined.
	 *
	 * @param step The legal number intervals to set.
	 * @since 1.8
	 */
	public void setStep(T step) {
		this.step = step;
	}

	/**
	 * Returns the minimum value.
	 *
	 * @return The minimum value. Null if not defined.
	 * @since 1.8
	 */
	public T getMinimum() {
		return minimum;
	}

	/**
	 * Set the minimum value. Null if not defined.
	 *
	 * @param minimum The minimum value to set.
	 * @since 1.8
	 */
	public void setMinimum(T minimum) {
		this.minimum = minimum;
	}

	/**
	 * Returns the maximum value.
	 *
	 * @return The maximum value. Null if not defined.
	 * @since 1.8
	 */
	public T getMaximum() {
		return maximum;
	}

	/**
	 * Set the value. Null if not defined.
	 *
	 * @param maximum The maximum value to set.
	 * @since 1.8
	 */
	public void setMaximum(T maximum) {
		this.maximum = maximum;
	}

}
