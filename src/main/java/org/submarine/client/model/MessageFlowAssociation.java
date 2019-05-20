//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;



/**
 * <p>Java class for tMessageFlowAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageFlowAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;attribute name="innerMessageFlowRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="outerMessageFlowRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface MessageFlowAssociation
    extends TBaseElement
{


    /**
     * Gets the value of the innerMessageFlowRef property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getInnerMessageFlowRef();

    /**
     * Sets the value of the innerMessageFlowRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setInnerMessageFlowRef(String value);

    /**
     * Gets the value of the outerMessageFlowRef property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getOuterMessageFlowRef();

    /**
     * Sets the value of the outerMessageFlowRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setOuterMessageFlowRef(String value);

}
