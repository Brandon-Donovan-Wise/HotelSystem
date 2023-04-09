/**
 * Customer.java
 * POJO class for the Customer
 * Author: Brandon Wise - 220049173
 * Date: 5 April 2023
 */
package za.ac.cput.domain;

public class Customer {
    private String custID;
    private String custFirstName;
    private String custLastName;
    private String custAddress;
    private boolean hasMembership;
    private CustomerContact customerContact;

    public Customer(Builder builder){
        this.custID = builder.custID;
        this.custFirstName = builder.custFirstName;
        this.custLastName = builder.custLastName;
        this.custAddress = builder.custAddress;
        this.hasMembership = builder.hasMembership;
        this.customerContact = builder.customerContact;
    }

    public String getCustID() {
        return custID;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public boolean HasMembership() {
        return hasMembership;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", hasMembership=" + hasMembership +
                ", customerContact=" + customerContact +
                '}';
    }

    public static class Builder{
        private String custID;
        private String custFirstName;
        private String custLastName;
        private String custAddress;
        private  Boolean hasMembership;

        private CustomerContact customerContact;

        public Builder setCustID(String custID) {
            this.custID = custID;
            return this;
        }

        public Builder setCustFirstName(String custFirstName) {
            this.custFirstName = custFirstName;
            return this;
        }
        public Builder setCustLastName(String custLastName) {
            this.custLastName = custLastName;
            return this;
        }

        public Builder setCustAddress(String custAddress) {
            this.custAddress = custAddress;
            return this;
        }

        public Builder setHasMembership(Boolean hasMembership) {
            this.hasMembership = hasMembership;
            return this;
        }
        public Builder setCustomerContact(CustomerContact customerContact) {
            this.customerContact = customerContact;
            return this;
        }
        public Builder copy(Customer customer){
            this.custID = customer.custID;
            this.custFirstName = customer.custFirstName;
            this.custLastName = customer.custLastName;
            this.custAddress = customer.custAddress;
            this.hasMembership = customer.hasMembership;
            this.customerContact = customer.customerContact;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}