/**
 * File:     EvaluationRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.util.List;

import de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.training.Dataset;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
	 * The model id.
	 */
	@NotBlank
	private String modelId;

	/**
	 * The dataset.
	 */
	@NotNull
	private Dataset dataset;

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
	 * @param modelId   The model id.
	 * @param dataset   The dataset.
	 * @since 17
	 */
	public TrainingRequest(@NotBlank String key, @NotNull List<String> arguments, @NotBlank String modelId,
			@NotNull Dataset dataset) {
		super(key, arguments);

		this.modelId = modelId;
		this.dataset = dataset;
	}

	/**
	 * Returns the model id.
	 *
	 * @return The model id.
	 * @since 17
	 */
	public String getModelId() {
		return modelId;
	}

	/**
	 * Set the model id.
	 *
	 * @param modelId The model id to set.
	 * @since 17
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	/**
	 * Returns the dataset.
	 *
	 * @return The dataset.
	 * @since 17
	 */
	public Dataset getDataset() {
		return dataset;
	}

	/**
	 * Set the dataset.
	 *
	 * @param dataset The dataset to set.
	 * @since 17
	 */
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

}
