package com.esotericsoftware.kryonet.serialization;

import com.esotericsoftware.kryonet.Connection;

/**
 * Creates a new instance of the specific serialization.
 */
public interface SerializationFactory {

	/**
	 * Creates a new instance of the specific serialization.
	 * 
	 * @param connection
	 *            If the serialization is used for TCP: The connection to the
	 *            other endpoint. If the serialization is used for UDP:
	 *            <code>null</code>.
	 * @return The serialization
	 */
	public Serialization newInstance(Connection connection);

}
