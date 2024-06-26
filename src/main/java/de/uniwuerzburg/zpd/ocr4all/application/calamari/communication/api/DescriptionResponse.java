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
	 * Creates a copy of the description response for the api.
	 * 
	 * @param descriptionResponse The description response to clone.
	 * @since 17
	 */
	private DescriptionResponse(DescriptionResponse description) {
		super();

		this.description = description.getDescription();
		categories = description.getCategories();
		steps = description.getSteps();
		model = description.getModel();
	}

	/**
	 * Returns the description response for the api ignoring superclass.
	 * 
	 * @return The description response for the api ignoring superclass.
	 * @since 17
	 */
	public DescriptionResponse ignoreSuperclass() {
		return new DescriptionResponse(this);
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
