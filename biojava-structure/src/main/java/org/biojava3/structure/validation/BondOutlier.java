/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.17 at 03:04:15 PM PST 
//


package org.biojava3.structure.validation;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="atom0" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="atom1" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="mean" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="obs" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="stdev" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bond-outlier")
public class BondOutlier {

    @XmlAttribute(name = "atom0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String atom0;
    @XmlAttribute(name = "atom1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String atom1;
    @XmlAttribute(name = "mean", required = true)
    protected BigDecimal mean;
    @XmlAttribute(name = "obs", required = true)
    protected BigDecimal obs;
    @XmlAttribute(name = "stdev", required = true)
    protected BigDecimal stdev;
    @XmlAttribute(name = "z", required = true)
    protected BigDecimal z;

    /**
     * Gets the value of the atom0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtom0() {
        return atom0;
    }

    /**
     * Sets the value of the atom0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtom0(String value) {
        this.atom0 = value;
    }

    /**
     * Gets the value of the atom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtom1() {
        return atom1;
    }

    /**
     * Sets the value of the atom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtom1(String value) {
        this.atom1 = value;
    }

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMean(BigDecimal value) {
        this.mean = value;
    }

    /**
     * Gets the value of the obs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getObs() {
        return obs;
    }

    /**
     * Sets the value of the obs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setObs(BigDecimal value) {
        this.obs = value;
    }

    /**
     * Gets the value of the stdev property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdev() {
        return stdev;
    }

    /**
     * Sets the value of the stdev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdev(BigDecimal value) {
        this.stdev = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZ(BigDecimal value) {
        this.z = value;
    }

}
