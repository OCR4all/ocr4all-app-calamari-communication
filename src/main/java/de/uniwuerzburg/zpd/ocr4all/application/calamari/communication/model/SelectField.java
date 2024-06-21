/**
 * File:     SelectField.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     17.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines string fields.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class SelectField extends Field<Object> {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * True if multiple options can be selected at once.
	 */
	@JsonProperty("multiple-options")
	private boolean isMultipleOptions;

	/**
	 * The items.
	 */
	private List<Item> items;

	/**
	 * Returns true if multiple options can be selected at once.
	 *
	 * @return True if multiple options can be selected at once.
	 * @since 1.8
	 */
	@JsonGetter("multiple-options")
	public boolean isMultipleOptions() {
		return isMultipleOptions;
	}

	/**
	 * Set to true if multiple options can be selected at once.
	 *
	 * @param isMultipleOptions The multiple options flag to set.
	 * @since 1.8
	 */
	public void setMultipleOptions(boolean isMultipleOptions) {
		this.isMultipleOptions = isMultipleOptions;
	}

	/**
	 * Returns the items.
	 *
	 * @return The items.
	 * @since 1.8
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Set the items.
	 *
	 * @param items The items to set.
	 * @since 1.8
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * Defines items.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 1.8
	 */
	public static class Item implements Serializable {
		/**
		 * The serial version UID.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * True if selected.
		 */
		@JsonProperty("selected")
		private boolean isSelected;

		/**
		 * The value.
		 */
		private String value;

		/**
		 * The description. Null if not defined.
		 */
		private String description;

		/**
		 * True if disabled.
		 */
		@JsonProperty("disabled")
		private boolean isDisabled;

		/**
		 * Returns true if selected.
		 *
		 * @return True if selected.
		 * @since 1.8
		 */
		@JsonGetter("selected")
		public boolean isSelected() {
			return isSelected;
		}

		/**
		 * Set to true if selected.
		 *
		 * @param isSelected The selected flag to set.
		 * @since 1.8
		 */
		public void setSelected(boolean isSelected) {
			this.isSelected = isSelected;
		}

		/**
		 * Returns the value.
		 *
		 * @return The value.
		 * @since 1.8
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Set the value.
		 *
		 * @param value The value to set.
		 * @since 1.8
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/**
		 * Returns the description.
		 *
		 * @return The description.
		 * @since 1.8
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Set the description.
		 *
		 * @param description The description to set.
		 * @since 1.8
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * Returns true if disabled.
		 *
		 * @return True if disabled.
		 * @since 1.8
		 */
		@JsonGetter("disabled")
		public boolean isDisabled() {
			return isDisabled;
		}

		/**
		 * Set to true if disabled.
		 *
		 * @param isDisabled The disabled flag to set.
		 * @since 1.8
		 */
		public void setDisabled(boolean isDisabled) {
			this.isDisabled = isDisabled;
		}
	}

}
