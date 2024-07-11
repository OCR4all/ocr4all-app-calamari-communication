/**
 * File:     TrainingJobResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     10.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain.JobResponse;
import de.uniwuerzburg.zpd.ocr4all.application.persistence.assemble.Engine;

/**
 * Defines training job responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class TrainingJobResponse extends JobResponse {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The engine.
	 */
	private Engine engine;

	/**
	 * Default constructor for a training job response for the api.
	 * 
	 * @since 17
	 */
	public TrainingJobResponse() {
		super();
	}

	/**
	 * Creates a training job response for the api.
	 * 
	 * @param job    The job response.
	 * @param engine The engine.
	 * @since 17
	 */
	public TrainingJobResponse(JobResponse job, Engine engine) {
		super(job);

		this.engine = engine;
	}

	/**
	 * Returns the engine.
	 *
	 * @return The engine.
	 * @since 17
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * Set the engine.
	 *
	 * @param engine The engine to set.
	 * @since 17
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
