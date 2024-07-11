/**
 * File:     RecognitionJobResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     11.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain.JobResponse;

/**
 * Defines recognition job responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class RecognitionJobResponse extends JobResponse {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor for a recognition job response for the api.
	 * 
	 * @since 17
	 */
	public RecognitionJobResponse() {
		super();
	}

	/**
	 * Creates a recognition job response for the api.
	 * 
	 * @param job The job response.
	 * @since 17
	 */
	public RecognitionJobResponse(JobResponse job) {
		super(job);
	}

}
