/**
 * File:     EvaluationRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

/**
 * Defines training requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class TrainingRequest extends ProcessRequest {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The model.
	 */
	@NotBlank
	private String model;

	/**
	 * Default constructor for a training request for the api.
	 * 
	 * @since 17
	 */
	public TrainingRequest() {
		super();
	}

	/**
	 * Creates a training request for the api.
	 * 
	 * @param key       The job key.
	 * @param arguments The Calamari processor arguments.
	 * @param model     The model.
	 * @since 17
	 */
	public TrainingRequest(String key, List<String> arguments, String model) {
		super(key, arguments);

		this.model = model;
	}

	/**
	 * Returns the model.
	 *
	 * @return The model.
	 * @since 17
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Set the model.
	 *
	 * @param model The model to set.
	 * @since 17
	 */
	public void setModel(String model) {
		this.model = model;
	}

}
