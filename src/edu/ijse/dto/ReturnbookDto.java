/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author DELL
 */
public class ReturnbookDto {
      private String bid;
    private String mid;
    private String rdate;
    private String idate;
    private String Fines;
    
    
    public ReturnbookDto(String bid, String mid, String rdate, String idate, String Fines) {
        this.bid = bid;
        this.mid = mid;
        this.rdate = rdate;
         this.idate = idate;
        this.Fines = Fines;
    }

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return the mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * @return the rdate
     */
    public String getRdate() {
        return rdate;
    }

    /**
     * @param rdate the rdate to set
     */
    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    /**
     * @return the idate
     */
    public String getIdate() {
        return idate;
    }

    /**
     * @param idate the idate to set
     */
    public void setIdate(String idate) {
        this.idate = idate;
    }

    /**
     * @return the Fines
     */
    public String getFines() {
        return Fines;
    }

    /**
     * @param Fines the Fines to set
     */
    public void setFines(String Fines) {
        this.Fines = Fines;
    }

    @Override
    public String toString() {
        return "ReturnbookDto{" + "bid=" + bid + ", mid=" + mid + ", rdate=" + rdate + ", idate=" + idate + ", Fines=" + Fines + '}';
    }
    
    
}
