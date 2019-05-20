//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;



/**
 * <p>Java class for tTimerEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTimerEventDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="timeDate" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *         &lt;element name="timeDuration" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *         &lt;element name="timeCycle" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TTimerEventDefinition extends TEventDefinition
{


    /**
     * Gets the value of the timeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    TExpression getTimeCycle();

    /**
     * Sets the value of the timeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    void setTimeCycle(TExpression value);

    /**
     * Gets the value of the timeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    TExpression getTimeDuration();

    /**
     * Sets the value of the timeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    void setTimeDuration(TExpression value);

    /**
     * Gets the value of the timeDate property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    TExpression getTimeDate();

    /**
     * Sets the value of the timeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    void setTimeDate(TExpression value);

}
