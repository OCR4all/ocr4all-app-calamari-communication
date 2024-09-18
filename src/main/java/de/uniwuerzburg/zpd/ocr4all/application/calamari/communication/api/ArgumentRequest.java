/**
 * File:     ArgumentRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.09.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotNull;

/**
 * Defines argument requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class ArgumentRequest implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Calamari processor arguments.
	 */
	@NotNull
	private List<String> arguments = new ArrayList<>();

	/**
	 * Default constructor for an argument request for the api.
	 * 
	 * @since 17
	 */
	public ArgumentRequest() {
		super();
	}

	/**
	 * Creates an argument request for the api.
	 * 
	 * @param arguments The Calamari processor arguments.
	 * @since 17
	 */
	public ArgumentRequest(List<String> arguments) {
		super();

		this.arguments = new ArrayList<>();
		if (arguments != null)
			for (String argument : arguments)
				if (argument != null && !argument.isBlank())
					this.arguments.add(argument.trim());
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
