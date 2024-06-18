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
 * Defines evaluation requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class EvaluationRequest extends ProcessRequest {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The collection.
	 */
	@NotBlank
	private String collection;

	/**
	 * Default constructor for an evaluation request for the api.
	 * 
	 * @since 17
	 */
	public EvaluationRequest() {
		super();
	}

	/**
	 * Creates an evaluation request for the api.
	 * 
	 * @param key        The job key.
	 * @param arguments  The Calamari processor arguments.
	 * @param collection The collection.
	 * @since 17
	 */
	public EvaluationRequest(String key, List<String> arguments, String collection) {
		super(key, arguments);

		this.collection = collection;
	}

	/**
	 * Returns the collection.
	 *
	 * @return The collection.
	 * @since 17
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * Set the collection.
	 *
	 * @param collection The collection to set.
	 * @since 17
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}

}
