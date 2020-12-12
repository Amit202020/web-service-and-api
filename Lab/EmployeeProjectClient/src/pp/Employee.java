/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pp;

public class Employee  implements java.io.Serializable {
    private java.lang.String empEmail;

    private java.lang.String empId;

    private java.lang.String empName;

    public Employee() {
    }

    public Employee(
           java.lang.String empEmail,
           java.lang.String empId,
           java.lang.String empName) {
           this.empEmail = empEmail;
           this.empId = empId;
           this.empName = empName;
    }


    /**
     * Gets the empEmail value for this Employee.
     * 
     * @return empEmail
     */
    public java.lang.String getEmpEmail() {
        return empEmail;
    }


    /**
     * Sets the empEmail value for this Employee.
     * 
     * @param empEmail
     */
    public void setEmpEmail(java.lang.String empEmail) {
        this.empEmail = empEmail;
    }


    /**
     * Gets the empId value for this Employee.
     * 
     * @return empId
     */
    public java.lang.String getEmpId() {
        return empId;
    }


    /**
     * Sets the empId value for this Employee.
     * 
     * @param empId
     */
    public void setEmpId(java.lang.String empId) {
        this.empId = empId;
    }


    /**
     * Gets the empName value for this Employee.
     * 
     * @return empName
     */
    public java.lang.String getEmpName() {
        return empName;
    }


    /**
     * Sets the empName value for this Employee.
     * 
     * @param empName
     */
    public void setEmpName(java.lang.String empName) {
        this.empName = empName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empEmail==null && other.getEmpEmail()==null) || 
             (this.empEmail!=null &&
              this.empEmail.equals(other.getEmpEmail()))) &&
            ((this.empId==null && other.getEmpId()==null) || 
             (this.empId!=null &&
              this.empId.equals(other.getEmpId()))) &&
            ((this.empName==null && other.getEmpName()==null) || 
             (this.empName!=null &&
              this.empName.equals(other.getEmpName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEmpEmail() != null) {
            _hashCode += getEmpEmail().hashCode();
        }
        if (getEmpId() != null) {
            _hashCode += getEmpId().hashCode();
        }
        if (getEmpName() != null) {
            _hashCode += getEmpName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pp", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pp", "empEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pp", "empId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pp", "empName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
