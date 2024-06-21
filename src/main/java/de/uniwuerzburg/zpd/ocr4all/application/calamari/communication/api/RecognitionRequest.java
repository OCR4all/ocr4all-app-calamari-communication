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
 * Defines recognition requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class RecognitionRequest extends ProcessRequest {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The working directory of the job. It is relative to the project folder.
	 */
	@NotBlank
	private String folder;

	/**
	 * The input folder.
	 */
	@NotBlank
	private String input;

	/**
	 * The output folder.
	 */
	@NotBlank
	private String output;

	/**
	 * Default constructor for a recognition request for the api.
	 * 
	 * @since 17
	 */
	public RecognitionRequest() {
		super();
	}

	/**
	 * Creates a recognition request for the api.
	 * 
	 * @param key       The job key.
	 * @param arguments The Calamari processor arguments.
	 * @param folder    The working directory of the job. It is relative to the
	 *                  project folder.
	 * @param input     The input folder.
	 * @param output    The output folder.
	 * @since 17
	 */
	public RecognitionRequest(String key, List<String> arguments, String folder, String input, String output) {
		super(key, arguments);

		this.folder = folder.trim();
		this.input = input.trim();
		this.output = output.trim();
	}

	/**
	 * Returns the working directory of the job. It is relative to the project
	 * folder.
	 *
	 * @return The working directory of the job.
	 * @since 17
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * Set the working directory of the job. It is relative to the project folder.
	 *
	 * @param folder The folder to set.
	 * @since 17
	 */
	public void setFolder(String folder) {
		this.folder = folder;
	}

	/**
	 * Returns the input folder.
	 *
	 * @return The input folder.
	 * @since 17
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Set the input folder.
	 *
	 * @param input The input folder to set.
	 * @since 17
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * Returns the output folder.
	 *
	 * @return The output folder.
	 * @since 17
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * Set the output folder.
	 *
	 * @param output The output folder to set.
	 * @since 17
	 */
	public void setOutput(String output) {
		this.output = output;
	}

}
