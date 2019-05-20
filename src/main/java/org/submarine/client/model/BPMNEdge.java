//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;



/**
 * <p>Java class for BPMNEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNEdge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}LabeledEdge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="sourceElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="targetElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="messageVisibleKind" type="{http://www.omg.org/spec/BPMN/20100524/DI}MessageVisibleKind" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface BPMNEdge extends LabeledEdge
{


    /**
     * Gets the value of the bpmnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link BPMNLabel }
     *     
     */
    BPMNLabel getBPMNLabel();

    /**
     * Sets the value of the bpmnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNLabel }
     *     
     */
    void setBPMNLabel(BPMNLabel value);

    /**
     * Gets the value of the bpmnElement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getBpmnElement();

    /**
     * Sets the value of the bpmnElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setBpmnElement(String value);

    /**
     * Gets the value of the sourceElement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getSourceElement();

    /**
     * Sets the value of the sourceElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setSourceElement(String value);

    /**
     * Gets the value of the targetElement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getTargetElement();

    /**
     * Sets the value of the targetElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setTargetElement(String value);

    /**
     * Gets the value of the messageVisibleKind property.
     * 
     * @return
     *     possible object is
     *     {@link MessageVisibleKind }
     *     
     */
    MessageVisibleKind getMessageVisibleKind();

    /**
     * Sets the value of the messageVisibleKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageVisibleKind }
     *     
     */
    void setMessageVisibleKind(MessageVisibleKind value);

}
