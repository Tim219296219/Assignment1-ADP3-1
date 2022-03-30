package za.ac.cput.Domain;
/* Bookings.Java
 *  Entity for Bookings
 *  Author: Yasmeen Nel (219250553)
 *  Date: 29 March 2022
 * */
public class Bookings {
    //Entity Attributes
    private String bookingID;
    private String bookingTitle;
    private String bookingDate;
    private String bookingDescription;
    private String bookingPackage;

    //Private Constructors
    private Bookings (){

    }
    private Bookings(Builder builder){
        this.bookingID = builder.bookingID;
        this.bookingTitle = builder.bookingTitle;
        this.bookingDate = builder.bookingDate;
        this.bookingDescription = builder.bookingDescription;
        this.bookingPackage = builder.bookingPackage;
    }

    //Getters
    public String bookingID() {
        return bookingID;
    }

    public String bookingTitle() {
        return bookingTitle;
    }

    public String bookingDate() {
        return bookingDate;
    }

    public String bookingDescription() {
        return bookingDescription;
    }

    public String bookingPackage() {
        return bookingPackage;
    }

    //Setters
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingTitle(String bookingTitle) {
        this.bookingTitle = bookingTitle;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setBookingDescription(String bookingDescription) {
        this.bookingDescription = bookingDescription;
    }

    public void setBookingPackage(String bookingPackage) {
        this.bookingPackage = bookingPackage;
    }
    //toString
    @Override
    public String toString() {
        return "Bookings{" +
                "bookingID=" + bookingID +
                ", bookingTitle='" + bookingTitle + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", bookingDescription='" + bookingDescription + '\'' +
                ", bookingPackage='" + bookingPackage + '\'' +
                '}';
    }
    //Builders class for Bookings
    public static class Builder{
        //Entity Attributes
        private String bookingID;
        private String bookingTitle;
        private String bookingDate;
        private String bookingDescription;
        private String bookingPackage;

        //Setters for Builders
        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setBookingTitle(String bookingTitle) {
            this.bookingTitle = bookingTitle;
            return this;
        }

        public Builder setBookingDate(String bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setBookingDescription(String bookingDescription) {
            this.bookingDescription = bookingDescription;
            return this;
        }

        public Builder setBookingPackage(String bookingPackage) {
            this.bookingPackage = bookingPackage;
            return this;
        }

        //To create a new Booking object
        public Bookings build(){
            return new Bookings(this);
        }

    }

}
