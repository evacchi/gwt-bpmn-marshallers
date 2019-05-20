//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;

import java.math.BigInteger;


/**
 * <p>Java class for tStandardLoopCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStandardLoopCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loopCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="testBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="loopMaximum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TStandardLoopCharacteristics extends TLoopCharacteristics
{


    /**
     * Gets the value of the loopCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    TExpression getLoopCondition();

    /**
     * Sets the value of the loopCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    void setLoopCondition(TExpression value);

    /**
     * Gets the value of the testBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    boolean isTestBefore();

    /**
     * Sets the value of the testBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setTestBefore(Boolean value);

    /**
     * Gets the value of the loopMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getLoopMaximum();

    /**
     * Sets the value of the loopMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setLoopMaximum(BigInteger value);

}
