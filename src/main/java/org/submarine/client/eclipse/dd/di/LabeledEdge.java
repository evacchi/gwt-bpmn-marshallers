/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.submarine.client.eclipse.dd.di;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.submarine.client.eclipse.dd.di.LabeledEdge#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 *
 * @see org.submarine.client.eclipse.dd.di.DiPackage#getLabeledEdge()
 * @model abstract="true"
 *        extendedMetaData="name='LabeledEdge' kind='elementOnly'"
 * @generated
 */
public interface LabeledEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link org.submarine.client.eclipse.dd.di.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see org.submarine.client.eclipse.dd.di.DiPackage#getLabeledEdge_OwnedLabel()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List<Label> getOwnedLabel();

} // LabeledEdge
