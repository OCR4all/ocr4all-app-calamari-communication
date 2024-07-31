/**
 * File:     ModelConfiguration.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     01.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core;

/**
 * Defines model configurations.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class ModelConfiguration {
	/**
	 * The folder.
	 */
	private String folder;

	/**
	 * Default constructor for a model configuration.
	 * 
	 * @since 17
	 */
	public ModelConfiguration() {
		super();
	}

	/**
	 * Creates model configurations.
	 * 
	 * @param folder The folder.
	 * @since 17
	 */
	public ModelConfiguration(String folder) {
		super();

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
