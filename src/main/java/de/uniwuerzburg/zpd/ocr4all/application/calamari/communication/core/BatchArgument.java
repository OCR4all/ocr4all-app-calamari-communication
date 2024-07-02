/**
 * File:     BatchArgument.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     02.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core;

import java.util.List;

/**
 * Defines batches with argument support.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class BatchArgument extends Batch {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The argument.
	 */
	private String argument;

	/**
	 * Default constructor a batches with argument support.
	 * 
	 * @since 17
	 */
	public BatchArgument() {
		super();
	}

	/**
	 * Creates a batches with argument support.
	 * 
	 * @param argument The argument.
	 * @param items    The items.
	 * @since 17
	 */
	public BatchArgument(String argument, List<Item> items) {
		super(items);

		this.argument = argument;
	}

	/**
	 * Returns the argument.
	 *
	 * @return The argument.
	 * @since 17
	 */
	public String getArgument() {
		return argument;
	}

	/**
	 * Set the argument.
	 *
	 * @param argument The argument to set.
	 * @since 17
	 */
	public void setArgument(String argument) {
		this.argument = argument;
	}

}
