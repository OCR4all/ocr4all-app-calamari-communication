/**
 * File:     DescriptionResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     26.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.model.Model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Defines description responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class DescriptionResponse implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The service provider identifier.
	 */
	@NotBlank
	private String identifier;

	/**
	 * The service provider description.
	 */
	@NotBlank
	private String description;

	/**
	 * The service provider categories.
	 */
	private List<String> categories = new ArrayList<>();

	/**
	 * The service provider steps.
	 */
	private List<String> steps = new ArrayList<>();

	/**
	 * The model.
	 */
	@NotNull
	private Model model;

	/**
	 * Default constructor for a description response for the api.
	 * 
	 * @since 17
	 */
	public DescriptionResponse() {
		super();
	}

	/**
	 * Creates a description response for the api.
	 * 
	 * @param identifier  The service provider identifier.
	 * @param description The service provider description.
	 * @param categories  The service provider categories.
	 * @param steps       The service provider steps.
	 * @param model       The model.
	 * @since 17
	 */
	public DescriptionResponse(@NotBlank String identifier, @NotBlank String description, List<String> categories,
			List<String> steps, @NotNull Model model) {
		super();
		
		this.identifier = identifier;
		this.description = description;
		this.categories = categories;
		this.steps = steps;
		this.model = model;
	}

	/**
	 * Returns the identifier.
	 *
	 * @return The identifier.
	 * @since 17
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Set the identifier.
	 *
	 * @param identifier The identifier to set.
	 * @since 17
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * Returns the description.
	 *
	 * @return The description.
	 * @since 17
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description.
	 *
	 * @param description The description to set.
	 * @since 17
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the categories.
	 *
	 * @return The categories.
	 * @since 17
	 */
	public List<String> getCategories() {
		return categories;
	}

	/**
	 * Set the categories.
	 *
	 * @param categories The categories to set.
	 * @since 17
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	/**
	 * Returns the steps.
	 *
	 * @return The steps.
	 * @since 17
	 */
	public List<String> getSteps() {
		return steps;
	}

	/**
	 * Set the steps.
	 *
	 * @param steps The steps to set.
	 * @since 17
	 */
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}

	/**
	 * Returns the model.
	 *
	 * @return The model.
	 * @since 17
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * Set the model.
	 *
	 * @param model The model to set.
	 * @since 17
	 */
	public void setModel(Model model) {
		this.model = model;
	}

}
