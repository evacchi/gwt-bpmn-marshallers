/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XMLResourceImpl.java,v 1.22 2009/04/28 14:48:33 davidms Exp $
 */
package org.eclipse.emf.ecore.xmi.impl;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

import javax.xml.parsers.DocumentBuilderFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.XMLParser;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.DOMHelper;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xml.type.AnyType;


/**
 * This class implements the XMLResource interface. It overloads the
 * doLoad method to invoke the XML deserializer rather than using the
 * default XMI loader.
 */
public class XMLResourceImpl extends ResourceImpl implements XMLResource
{
  /**
   * The map from {@link #getID ID} to {@link EObject}.
   * It is used to store IDs during a load or if the user
   * sets the ID of an object.
   */
  protected Map<String, EObject> idToEObjectMap;

  /**
   * The map from {@link EObject} to {@link #getID ID}.
   * It is used to store IDs during a load or if the user
   * sets the ID of an object.
   */
  protected Map<EObject, String> eObjectToIDMap;

  protected Map<EObject, AnyType> eObjectToExtensionMap;

  protected String encoding;
  protected String xmlVersion;
  protected boolean useZip;
  protected String publicId;
  protected String systemId;
  protected DOMHandler domHandler;

  /**
   * The map from {@link EObject} to {@link #getID ID}. It is used to store
   * IDs for objects that have been detached.
   */
  protected static final Map<EObject, String> DETACHED_EOBJECT_TO_ID_MAP = new HashMap<>();//Collections.synchronizedMap(new WeakHashMap<EObject, String>());

  /**
   * Constructor for XMLResourceImpl.
   */
  public XMLResourceImpl()
  {
    super();
    init();
  }

  /**
   * Constructor for XMLResourceImpl.
   * @param uri
   */
  public XMLResourceImpl(URI uri)
  {
    super(uri);
    init();
  }

  protected void init()
  {
    encoding = "ASCII";
    xmlVersion = "1.0";
  }

  protected boolean useIDs()
  {
    return eObjectToIDMap != null || idToEObjectMap != null || useUUIDs();
  }

  protected boolean useIDAttributes()
  {
    return true;
  }

  protected boolean useUUIDs()
  {
    return false;
  }

  protected boolean assignIDsWhileLoading()
  {
    return true;
  }

  public Map<Object, Object> getDefaultSaveOptions()
  {
    if (defaultSaveOptions == null)
    {
      defaultSaveOptions = new HashMap<Object, Object>();
    }
    return defaultSaveOptions;
  }

  public Map<Object, Object> getDefaultLoadOptions()
  {
    if (defaultLoadOptions == null)
    {
      defaultLoadOptions = new HashMap<Object, Object>();
    }
    return defaultLoadOptions;
  }

  protected XMLHelper createXMLHelper()
  {
    return new XMLHelperImpl(this);
  }

  protected XMLLoad createXMLLoad()
  {
    return new XMLLoadImpl(createXMLHelper());
  }

  protected XMLSave createXMLSave()
  {
    return new XMLSaveImpl(createXMLHelper());
  }

  public Document save(Document doc, Map<?, ?> options, DOMHandler handler)
  {
    XMLSave xmlSave = createXMLSave();
    domHandler = handler;
    if (domHandler == null)
    {
      domHandler = new DefaultDOMHandlerImpl();
    }
    Document document = doc;
    if (document == null)
    {
      try
      {
        document = XMLParser.createDocument();
      }
      catch (Exception e)
      {
        throw new RuntimeException(e.getMessage());
      }
    }
    if (defaultSaveOptions == null || defaultSaveOptions.isEmpty())
    {
      return xmlSave.save(this, document, options == null ? Collections.EMPTY_MAP : options, domHandler);
    }
    else if (options == null)
    {
      return xmlSave.save(this, document, defaultSaveOptions, domHandler);
    }
    else
    {
      Map<Object,Object> mergedOptions = new HashMap<Object, Object>(defaultSaveOptions);
      mergedOptions.putAll(options);
      return xmlSave.save(this, document, mergedOptions, domHandler);
    }
  }
  
  public DOMHelper getDOMHelper()
  {
    return domHandler.getDOMHelper();
  }

  @Override
  public boolean useZip()
  {
    return useZip;
  }

  public void setUseZip(boolean useZip)
  {
    this.useZip = useZip;
  }
  
  public String getPublicId()
  {
    return publicId;
  }
  public String getSystemId()
  {
    return systemId;
  }
  public void setDoctypeInfo(String publicId, String systemId)
  {
    this.publicId = publicId;
    this.systemId = systemId;
  }

  public String getEncoding()
  {
    return encoding;
  }

  public void setEncoding(String encoding)
  {
    this.encoding = encoding;
  }
  
  public String getXMLVersion()
  {
    return xmlVersion;
  }

  public void setXMLVersion(String version)
  {
    this.xmlVersion = version;
  }

  public Map<String, EObject> getIDToEObjectMap()
  {
    if (idToEObjectMap == null)
    {
      idToEObjectMap = new HashMap<String, EObject>();
    }

    return idToEObjectMap;
  }

  public Map<EObject, String> getEObjectToIDMap()
  {
    if (eObjectToIDMap == null)
    {
      eObjectToIDMap = new HashMap<EObject, String>();
    }

    return eObjectToIDMap;
  }

  public Map<EObject, AnyType> getEObjectToExtensionMap()
  {
    if (eObjectToExtensionMap == null)
    {
      eObjectToExtensionMap = new HashMap<EObject, AnyType>();
    }
    return eObjectToExtensionMap;
  }

  /*
   * Javadoc copied from interface
   */
  public String getID(EObject eObject)
  {
    if (eObjectToIDMap == null)
    {
      return null;
    }
    else
    {
      return eObjectToIDMap.get(eObject);
    }
  }

  /**
   * Sets the ID of the object.
   * This default implementation will update the {@link #eObjectToIDMap}.
   * Clients may override it to set the ID as an actual attribute object the object.
   * @param eObject the object.
   * @param id the object's ID.
   */
  public void setID(EObject eObject, String id)
  {
    Object oldID = id != null ? getEObjectToIDMap().put(eObject, id) : getEObjectToIDMap().remove(eObject);
    
    if (oldID != null)
    {
      getIDToEObjectMap().remove(oldID);
    }
    
    if (id != null)
    {
      getIDToEObjectMap().put(id, eObject);
    }
  }

  /*
   * Javadoc copied from interface.
   */
  @Override
  public String getURIFragment(EObject eObject)
  {
    String id = getID(eObject);

    if (id != null)
    {
      return id;
    }
    else
    {
      return super.getURIFragment(eObject);
    }
  }

  @Override
  protected EObject getEObjectByID(String id)
  {
    if (idToEObjectMap != null)
    {
      EObject eObject = idToEObjectMap.get(id);
      if (eObject != null)
      {
        return eObject;
      }
    }

   return useIDAttributes() ? super.getEObjectByID(id) : null;
  }

  protected boolean isPath(String uriFragment)
  {
    return uriFragment.startsWith("/");
  }
  
  @Override
  protected boolean isAttachedDetachedHelperRequired()
  {
    return useIDs() || super.isAttachedDetachedHelperRequired();
  }

  @Override
  protected void attachedHelper(EObject eObject)
  {
    super.attachedHelper(eObject);
    
    if (useIDs())
    {
      String id = getID(eObject);
      if (useUUIDs() && id == null)
      {
        if (assignIDsWhileLoading() || !isLoading())
        {
          id = DETACHED_EOBJECT_TO_ID_MAP.remove(eObject);
          if (id == null)
          {
            id = EcoreUtil.generateUUID();
          }
          setID(eObject, id);
        }
      }
      else if (id != null)
      {
        getIDToEObjectMap().put(id, eObject);
      }
    }
  }

  @Override
  protected void detachedHelper(EObject eObject)
  {
    if (useIDs())
    {
      if (useUUIDs())
      {
        DETACHED_EOBJECT_TO_ID_MAP.put(eObject, getID(eObject));
      }

      if (idToEObjectMap != null && eObjectToIDMap != null)
      {
        setID(eObject, null);
      }
    }
    
    super.detachedHelper(eObject);
  }

  /**
   * Does all the work of unloading the resource. It calls doUnload in
   * ResourceImpl, then it clears {@link #idToEObjectMap} and {@link #eObjectToIDMap} as necessary.
   */
  @Override
  protected void doUnload()
  {
    super.doUnload();

    if (idToEObjectMap != null)
    {
      idToEObjectMap.clear();
    }

    if (eObjectToIDMap != null)
    {
      eObjectToIDMap.clear();
    }

    if (eObjectToExtensionMap != null)
    {
      eObjectToExtensionMap.clear();
    }
  }

  /**
   * Returns a string representation of the {@link #idToEObjectMap ID} map.
   * @return a string representation of the ID map.
   */
  @Override
  public String toKeyString()
  {
    StringBuffer result = new StringBuffer("Key type: ");
    result.append(getClass().toString());
    if (idToEObjectMap != null)
    {
      TreeMap<String, String> tree = new TreeMap<String, String>();
      for (String key : idToEObjectMap.keySet())
      {
        if (key != null)
        {
          tree.put(key, key);
        }
      }

      // add the key/value pairs to the output string
      for (String key : tree.values())
      {
        Object value = idToEObjectMap.get(key);
        result.append("\r\n\t[Key=" + key + ", Value=" + value + "]");
      }
    }
    return result.toString();
  }
  
  public final void load(Node node, Map<?, ?> options) throws IOException
  {
    if (!isLoaded)
    {
      Notification notification = setLoaded(true);
      isLoading = true;

      if (errors != null)
      {
        errors.clear();
      }

      if (warnings != null)
      {
        warnings.clear();
      }

      try
      {
        if (defaultLoadOptions == null || defaultLoadOptions.isEmpty())
        {
          doLoad(node, options);
        }
        else if (options == null)
        {
          doLoad(node, defaultLoadOptions);
        }
        else
        {
          Map<Object, Object> mergedOptions = new HashMap<Object, Object>(defaultLoadOptions);
          mergedOptions.putAll(options);
  
          doLoad(node, mergedOptions);
        }
      }
      finally
      {
        isLoading = false;

        if (notification != null)
        {
          eNotify(notification);
        }
  
        setModified(false);
      } 
    }
  }

  /* (non-Javadoc)
   * @see org.eclipse.emf.ecore.xmi.XMLResource#load(com.google.gwt.xml.client.Node, java.util.Map)
   */
  public void doLoad(Node node, Map<?, ?> options) throws IOException
  {
    XMLLoad xmlLoad = createXMLLoad();

    if (options == null)
    {
      options = Collections.EMPTY_MAP;
    }
    
    xmlLoad.load(this, node, options); 
  }

}
