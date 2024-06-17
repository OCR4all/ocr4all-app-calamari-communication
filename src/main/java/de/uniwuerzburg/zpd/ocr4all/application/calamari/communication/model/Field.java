/**
 * File:     Field.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     17.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines fields.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Field<T> implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The argument.
	 */
	private String argument;

	/**
	 * The default value. Null if not required.
	 */
	@JsonProperty("default")
	private T defaultValue;

	/**
	 * The label.
	 */
	private String label;

	/**
	 * The description. Null if no description is required.
	 */
	private String description;

	/**
	 * The placeholder. Null if no placeholder is required.
	 */
	private String placeholder;

	/**
	 * True if the field is disabled.
	 */
	@JsonProperty("disabled")
	private boolean isDisabled;

	/**
	 * Returns the argument.
	 *
	 * @return The argument.
	 * @since 1.8
	 */
	public String getArgument() {
		return argument;
	}

	/**
	 * Set the argument.
	 *
	 * @param argument The argument to set.
	 * @since 1.8
	 */
	public void setArgument(String argument) {
		this.argument = argument;
	}

	/**
	 * Returns the default value. Null if not required.
	 *
	 * @return The default value. Null if not required.
	 * @since 17
	 */
	public T getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Set the default value. Null if not required.
	 *
	 * @param defaultValue The default value to set.
	 * @since 17
	 */
	public void setDefaultValue(T defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * Returns the label.
	 *
	 * @return The label.
	 * @since 1.8
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Set the label.
	 *
	 * @param label The label to set.
	 * @since 1.8
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Returns the description.
	 *
	 * @return The description. Null if no description is required.
	 * @since 1.8
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description. Null if no description is required.
	 *
	 * @param description The description to set.
	 * @since 1.8
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the placeholder.
	 *
	 * @return The placeholder. Null if no placeholder is required.
	 * @since 1.8
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * Set the placeholder. Null if no placeholder is required.
	 *
	 * @param placeholder The placeholder to set.
	 * @since 1.8
	 */
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	/**
	 * Returns true if the field is disabled.
	 *
	 * @return True if the field is disabled.
	 * @since 1.8
	 */
	@JsonGetter("disabled")
	public boolean isDisabled() {
		return isDisabled;
	}

	/**
	 * Set to true if the field is disabled.
	 *
	 * @param isDisabled The disabled flag to set.
	 * @since 1.8
	 */
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

}
