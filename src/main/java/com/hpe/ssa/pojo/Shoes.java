package com.hpe.ssa.pojo;

import java.util.Date;

//鞋子实体类
public class Shoes {
    private Integer sid;
    private Integer stid;
    private Integer sbid;
    private String snum;
    private String sname;
    private Float sprices;
    private Integer sdiscount;//库存量
    private Date spubtime;
    private String sproducer;
    private String sgender;//款式男or女
    private String scolor;
    private String sinfo;
    private Integer stimesold;
    private String simage;
    private String sdetail;
    private Float sintegral;//鞋子积分
    private Integer sdelete;
    private String sremarks;
    private String sandroidimg;

    public Shoes() {
    }

    public Shoes(Integer sid, Integer stid, Integer sbid, String snum, String sname, Float sprices, Integer sdiscount,
                 Date spubtime, String sproducer, String sgender, String scolor, String sinfo, Integer stimesold,
                 String simage, String sdetail, Float sintegral, Integer sdelete, String sremarks, String sandroidimg) {
        this.sid = sid;
        this.stid = stid;
        this.sbid = sbid;
        this.snum = snum;
        this.sname = sname;
        this.sprices = sprices;
        this.sdiscount = sdiscount;
        this.spubtime = spubtime;
        this.sproducer = sproducer;
        this.sgender = sgender;
        this.scolor = scolor;
        this.sinfo = sinfo;
        this.stimesold = stimesold;
        this.simage = simage;
        this.sdetail = sdetail;
        this.sintegral = sintegral;
        this.sdelete = sdelete;
        this.sremarks = sremarks;
        this.sandroidimg = sandroidimg;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getSbid() {
        return sbid;
    }

    public void setSbid(Integer sbid) {
        this.sbid = sbid;
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Float getSprices() {
        return sprices;
    }

    public void setSprices(Float sprices) {
        this.sprices = sprices;
    }

    public Integer getSdiscount() {
        return sdiscount;
    }

    public void setSdiscount(Integer sdiscount) {
        this.sdiscount = sdiscount;
    }

    public Date getSpubtime() {
        return spubtime;
    }

    public void setSpubtime(Date spubtime) {
        this.spubtime = spubtime;
    }

    public String getSproducer() {
        return sproducer;
    }

    public void setSproducer(String sproducer) {
        this.sproducer = sproducer;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getScolor() {
        return scolor;
    }

    public void setScolor(String scolor) {
        this.scolor = scolor;
    }

    public String getSinfo() {
        return sinfo;
    }

    public void setSinfo(String sinfo) {
        this.sinfo = sinfo;
    }

    public Integer getStimesold() {
        return stimesold;
    }

    public void setStimesold(Integer stimesold) {
        this.stimesold = stimesold;
    }

    public String getSimage() {
        return simage;
    }

    public void setSimage(String simage) {
        this.simage = simage;
    }

    public String getSdetail() {
        return sdetail;
    }

    public void setSdetail(String sdetail) {
        this.sdetail = sdetail;
    }

    public Float getSintegral() {
        return sintegral;
    }

    public void setSintegral(Float sintegral) {
        this.sintegral = sintegral;
    }

    public Integer getSdelete() {
        return sdelete;
    }

    public void setSdelete(Integer sdelete) {
        this.sdelete = sdelete;
    }

    public String getSremarks() {
        return sremarks;
    }

    public void setSremarks(String sremarks) {
        this.sremarks = sremarks;
    }

    public String getSandroidimg() {
        return sandroidimg;
    }

    public void setSandroidimg(String sandroidimg) {
        this.sandroidimg = sandroidimg;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "sid=" + sid +
                ", stid=" + stid +
                ", sbid=" + sbid +
                ", snum='" + snum + '\'' +
                ", sname='" + sname + '\'' +
                ", sprices=" + sprices +
                ", sdiscount=" + sdiscount +
                ", spubtime=" + spubtime +
                ", sproducer='" + sproducer + '\'' +
                ", sgender='" + sgender + '\'' +
                ", scolor='" + scolor + '\'' +
                ", sinfo='" + sinfo + '\'' +
                ", stimesold=" + stimesold +
                ", simage='" + simage + '\'' +
                ", sdetail='" + sdetail + '\'' +
                ", sintegral=" + sintegral +
                ", sdelete=" + sdelete +
                ", sremarks='" + sremarks + '\'' +
                ", sandroidimg='" + sandroidimg + '\'' +
                '}';
    }
}
