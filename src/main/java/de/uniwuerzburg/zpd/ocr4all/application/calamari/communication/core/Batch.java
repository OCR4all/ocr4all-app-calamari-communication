/**
 * File:     Batch.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     28.06.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.calamari.communication.core;

import java.io.Serializable;
import java.util.List;

/**
 * Defines batches.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Batch implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The items.
	 */
	private List<Item> items;

	/**
	 * Default constructor for a batch.
	 * 
	 * @since 17
	 */
	public Batch() {
		super();
	}

	/**
	 * Creates a batch.
	 * 
	 * @param items The items.
	 * @since 17
	 */
	public Batch(List<Item> items) {
		super();

		this.items = items;
	}

	/**
	 * Returns the items.
	 *
	 * @return The items.
	 * @since 17
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Set the items.
	 *
	 * @param items The items to set.
	 * @since 17
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * Defines items for batches.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 1.8
	 */
	public static class Item {
		/**
		 * The id.
		 */
		private String id;

		/**
		 * The files.
		 */
		private List<String> files;

		/**
		 * Default constructor for a Collection.
		 * 
		 * @since 17
		 */
		public Item() {
			super();
		}

		/**
		 * Creates an item.
		 * 
		 * @param id    The id.
		 * @param files The files.
		 * @since 17
		 */
		public Item(String id, List<String> files) {
			super();

			this.id = id;
			this.files = files;
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
		 * Returns the files.
		 *
		 * @return The files.
		 * @since 17
		 */
		public List<String> getFiles() {
			return files;
		}

		/**
		 * Set the files.
		 *
		 * @param files The files to set.
		 * @since 17
		 */
		public void setFiles(List<String> files) {
			this.files = files;
		}

	}
}
