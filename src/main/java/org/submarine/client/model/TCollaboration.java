//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 02:18:37 PM CEST 
//


package org.submarine.client.model;

import java.util.List;



/**
 * <p>Java class for tCollaboration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCollaboration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}messageFlow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}artifact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}messageFlowAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="choreographyRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TCollaboration extends TRootElement
{


    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    List<Participant> getParticipants();

    /**
     * Gets the value of the messageFlows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFlows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFlow }
     * 
     * 
     */
    List<MessageFlow> getMessageFlows();

    /**
     * Gets the value of the artifacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     * {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * {@link JAXBElement }{@code <}{@link TGroup }{@code >}
     * 
     * 
     */
    List<TArtifact> getArtifacts();

    /**
     * Gets the value of the conversationNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversationNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TConversationNode }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TConversation }{@code >}
     * 
     * 
     */
    List<TConversationNode> getConversationNodes();

    /**
     * Gets the value of the conversationAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversationAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationAssociation }
     * 
     * 
     */
    List<ConversationAssociation> getConversationAssociations();

    /**
     * Gets the value of the participantAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantAssociation }
     * 
     * 
     */
    List<ParticipantAssociation> getParticipantAssociations();

    /**
     * Gets the value of the messageFlowAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlowAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFlowAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFlowAssociation }
     * 
     * 
     */
    List<MessageFlowAssociation> getMessageFlowAssociations();

    /**
     * Gets the value of the correlationKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelationKey }
     * 
     * 
     */
    List<CorrelationKey> getCorrelationKeies();

    /**
     * Gets the value of the choreographyReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choreographyReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoreographyReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    List<String> getChoreographyReves();

    /**
     * Gets the value of the conversationLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversationLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationLink }
     * 
     * 
     */
    List<ConversationLink> getConversationLinks();

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    boolean isIsClosed();

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsClosed(Boolean value);

}
