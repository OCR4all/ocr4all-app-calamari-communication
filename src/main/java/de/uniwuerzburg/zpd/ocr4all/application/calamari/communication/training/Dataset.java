/**
 * File:     Dataset.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.training
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     28.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.training;

import java.io.Serializable;
import java.util.List;

/**
 * Defines datasets.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Dataset implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The collections.
	 */
	private List<Collection> collections;

	/**
	 * Default constructor for a dataset.
	 * 
	 * @since 17
	 */
	public Dataset() {
		super();
	}

	/**
	 * Creates a dataset.
	 * 
	 * @param collections The collections.
	 * @since 17
	 */
	public Dataset(List<Collection> collections) {
		super();

		this.collections = collections;
	}

	/**
	 * Returns the collections.
	 *
	 * @return The collections.
	 * @since 17
	 */
	public List<Collection> getCollections() {
		return collections;
	}

	/**
	 * Set the collections.
	 *
	 * @param collections The collections to set.
	 * @since 17
	 */
	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}

	/**
	 * Defines collections for datasets.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 1.8
	 */
	public static class Collection {
		/**
		 * The id.
		 */
		private String id;

		/**
		 * The images.
		 */
		private List<String> images;

		/**
		 * Default constructor for a Collection.
		 * 
		 * @since 17
		 */
		public Collection() {
			super();
		}

		/**
		 * Creates a dataset.
		 * 
		 * @param id     The id.
		 * @param images The images.
		 * @since 17
		 */
		public Collection(String id, List<String> images) {
			super();

			this.id = id;
			this.images = images;
		}

		/**
		 * Returns the id.
		 *
		 * @return The id.
		 * @since 17
		 */
		public String getId() {
			return id;
		}

		/**
		 * Set the id.
		 *
		 * @param id The id to set.
		 * @since 17
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * Returns the images.
		 *
		 * @return The images.
		 * @since 17
		 */
		public List<String> getImages() {
			return images;
		}

		/**
		 * Set the images.
		 *
		 * @param images The images to set.
		 * @since 17
		 */
		public void setImages(List<String> images) {
			this.images = images;
		}

	}
}
