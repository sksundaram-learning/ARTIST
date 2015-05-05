/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Connection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Connection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Provider" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Mode" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}ConnectionMode" />
 *       &lt;attribute name="ConnectionString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SettingsObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SettingsPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connection")
public class Connection {

    @XmlAttribute(name = "Provider", required = true)
    protected String provider;
    @XmlAttribute(name = "Mode")
    protected ConnectionMode mode;
    @XmlAttribute(name = "ConnectionString")
    protected String connectionString;
    @XmlAttribute(name = "SettingsObjectName")
    protected String settingsObjectName;
    @XmlAttribute(name = "SettingsPropertyName")
    protected String settingsPropertyName;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMode }
     *     
     */
    public ConnectionMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMode }
     *     
     */
    public void setMode(ConnectionMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the connectionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Sets the value of the connectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionString(String value) {
        this.connectionString = value;
    }

    /**
     * Gets the value of the settingsObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingsObjectName() {
        return settingsObjectName;
    }

    /**
     * Sets the value of the settingsObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingsObjectName(String value) {
        this.settingsObjectName = value;
    }

    /**
     * Gets the value of the settingsPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingsPropertyName() {
        return settingsPropertyName;
    }

    /**
     * Sets the value of the settingsPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingsPropertyName(String value) {
        this.settingsPropertyName = value;
    }

}
