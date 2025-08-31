package epass.project.backend.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Epass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNo;
    private String mobileNo;
    private String aadhaarNo;
    private String place;
    private LocalDateTime inDate;
    private LocalDateTime outDate;

    // Getters and Setters
    public Long getId() { return id; }

    public String getVehicleNo() { return vehicleNo; }
    public void setVehicleNo(String vehicleNo) { this.vehicleNo = vehicleNo; }

    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }

    public String getAadhaarNo() { return aadhaarNo; }
    public void setAadhaarNo(String aadhaarNo) { this.aadhaarNo = aadhaarNo; }

    public String getPlace() { return place; }
    public void setPlace(String place) { this.place = place; }

    public LocalDateTime getInDate() { return inDate; }
    public void setInDate(LocalDateTime inDate) { this.inDate = inDate; }

    public LocalDateTime getOutDate() { return outDate; }
    public void setOutDate(LocalDateTime outDate) { this.outDate = outDate; }
}
