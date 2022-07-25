/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;

/**
 *
 * @author truon
 */
public class bangdiem {
    private int ID;
    private float TA, tin, GDTC;
    private String MASV;

    public bangdiem() {
    }

    public bangdiem(int ID, float TA, float tin, float GDTC, String MASV) {
        this.ID = ID;
        this.TA = TA;
        this.tin = tin;
        this.GDTC = GDTC;
        this.MASV = MASV;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getTA() {
        return TA;
    }

    public void setTA(float TA) {
        this.TA = TA;
    }

    public float getTin() {
        return tin;
    }

    public void setTin(float tin) {
        this.tin = tin;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }
    
}
