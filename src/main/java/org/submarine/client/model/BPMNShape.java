//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;



/**
 * <p>Java class for BPMNShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNShape"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}LabeledShape"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="isHorizontal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isMarkerVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="isMessageVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="participantBandKind" type="{http://www.omg.org/spec/BPMN/20100524/DI}ParticipantBandKind" /&gt;
 *       &lt;attribute name="choreographyActivityShape" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface BPMNShape extends LabeledShape
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
     * Gets the value of the isHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isIsHorizontal();

    /**
     * Sets the value of the isHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsHorizontal(Boolean value);

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isIsExpanded();

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsExpanded(Boolean value);

    /**
     * Gets the value of the isMarkerVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isIsMarkerVisible();

    /**
     * Sets the value of the isMarkerVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsMarkerVisible(Boolean value);

    /**
     * Gets the value of the isMessageVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isIsMessageVisible();

    /**
     * Sets the value of the isMessageVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsMessageVisible(Boolean value);

    /**
     * Gets the value of the participantBandKind property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantBandKind }
     *     
     */
    ParticipantBandKind getParticipantBandKind();

    /**
     * Sets the value of the participantBandKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantBandKind }
     *     
     */
    void setParticipantBandKind(ParticipantBandKind value);

    /**
     * Gets the value of the choreographyActivityShape property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    String getChoreographyActivityShape();

    /**
     * Sets the value of the choreographyActivityShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setChoreographyActivityShape(String value);

}
