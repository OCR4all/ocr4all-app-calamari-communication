/**
 * File:     EvaluationRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.util.List;

/**
 * Defines evaluation requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class EvaluationRequest extends ArgumentRequest {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The folder.
	 */
	private String folder;

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
	 * @param folder    The folder.
	 * @param arguments The Calamari processor arguments.
	 * @since 17
	 */
	public EvaluationRequest(String folder, List<String> arguments) {
		super(arguments);

		this.folder = folder;
	}

	/**
	 * Returns the folder.
	 *
	 * @return The folder.
	 * @since 17
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * Set the folder.
	 *
	 * @param folder The folder to set.
	 * @since 17
	 */
	public void setFolder(String folder) {
		this.folder = folder;
	}

}
