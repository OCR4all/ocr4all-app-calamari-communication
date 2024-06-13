/**
 * File:     ProcessRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     14.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

/**
 * Defines process requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class ProcessRequest implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The job key.
	 */
	@NotBlank
	private String key;

	/**
	 * The Calamari processor arguments.
	 */
	private List<String> arguments = new ArrayList<>();

	/**
	 * Default constructor for a process request for the api.
	 * 
	 * @since 17
	 */
	public ProcessRequest() {
		super();
	}

	/**
	 * Creates a process request for the api.
	 * 
	 * @param key       The job key.
	 * @param arguments The Calamari processor arguments.
	 * @since 17
	 */
	public ProcessRequest(String key, List<String> arguments) {
		super();

		this.key = key.trim();

		if (arguments != null)
			for (String argument : arguments)
				if (argument != null && !argument.isBlank())
					this.arguments.add(argument.trim());
	}

	/**
	 * Returns the job key.
	 *
	 * @return The job key.
	 * @since 17
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Set the job key.
	 *
	 * @param key The job key to set.
	 * @since 17
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Returns the Calamari processor arguments.
	 *
	 * @return The Calamari processor arguments.
	 * @since 17
	 */
	public List<String> getArguments() {
		return arguments;
	}

	/**
	 * Set the Calamari processor arguments.
	 *
	 * @param arguments The arguments to set.
	 * @since 17
	 */
	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}

}
