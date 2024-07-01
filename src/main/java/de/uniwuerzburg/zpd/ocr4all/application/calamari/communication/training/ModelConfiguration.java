/**
 * File:     ModelConfiguration.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.training
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     01.07.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.training;

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
	private final String folder;

	/**
	 * The engine file.
	 */
	private final String engine;

	/**
	 * Creates model configurations.
	 * 
	 * @param folder The folder.
	 * @param engine The engine file.
	 * @since 17
	 */
	public ModelConfiguration(String folder, String engine) {
		super();
		this.folder = folder;
		this.engine = engine;
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
	 * Returns the engine.
	 *
	 * @return The engine.
	 * @since 17
	 */
	public String getEngine() {
		return engine;
	}

}
