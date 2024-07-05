/**
 * File:     RecognitionModelField.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     02.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines recognition model fields for models.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class RecognitionModelField extends Field<Object> {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * /** The minimum version. Null if not set.
	 */
	@JsonProperty("minimum-version")
	private String minimumVersion;

	/**
	 * The maximum version. Null if not set.
	 */
	@JsonProperty("maximum-version")
	private String maximumVersion;

	/**
	 * True if multiple models can be selected.
	 */
	@JsonProperty("multiple-models")
	private boolean isMultipleModels;

	/**
	 * The suffix for the model file names.
	 */
	private String suffix;

	/**
	 * Returns the minimum version. Null if not set.
	 *
	 * @return The minimum version. Null if not set.
	 * @since 17
	 */
	public String getMinimumVersion() {
		return minimumVersion;
	}

	/**
	 * Set the minimum version. Null if not set.
	 *
	 * @param minimumVersion The minimum version to set.
	 * @since 17
	 */
	public void setMinimumVersion(String minimumVersion) {
		this.minimumVersion = minimumVersion;
	}

	/**
	 * Returns the maximum version. Null if not set.
	 *
	 * @return The maximum version. Null if not set.
	 * @since 17
	 */
	public String getMaximumVersion() {
		return maximumVersion;
	}

	/**
	 * Set the maximum version. Null if not set.
	 *
	 * @param maximumVersion The maximum version to set.
	 * @since 17
	 */
	public void setMaximumVersion(String maximumVersion) {
		this.maximumVersion = maximumVersion;
	}

	/**
	 * Returns true if multiple models can be selected.
	 *
	 * @return True if multiple models can be selected.
	 * @since 17
	 */
	@JsonGetter("multiple-models")
	public boolean isMultipleModels() {
		return isMultipleModels;
	}

	/**
	 * Set to true if multiple models can be selected.
	 *
	 * @param isMultipleModels The multiple models flag to set.
	 * @since 17
	 */
	public void setMultipleModels(boolean isMultipleModels) {
		this.isMultipleModels = isMultipleModels;
	}

	/**
	 * Returns the suffix for the model file names.
	 *
	 * @return The suffix for the model file names.
	 * @since 17
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Set the suffix for the model file names.
	 *
	 * @param suffix The suffix to set.
	 * @since 17
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
