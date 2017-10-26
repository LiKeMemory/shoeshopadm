package com.hpe.ssa.pojo;


public class SpcifyShoes {
    private Integer spsid;
    private Integer sp_tid;
    private Integer sp_bid;
    private String spsseq; //鞋子编号
    private String spsname; //定制鞋名称
    private Float spsprices;
    private String spscontent;//鞋子详细
    private Integer spspartnum; //部件数量
    private String spspartinfo;//部件信息
    private String spsgender; //鞋性别
    private Integer spscss;
    private String spremarks;

    public SpcifyShoes() {
    }

    public SpcifyShoes(Integer spsid, Integer sp_tid, Integer sp_bid, String spsseq, String spsname, Float spsprices,
                       String spscontent, Integer spspartnum, String spspartinfo, String spsgender, Integer spscss,
                       String spremarks) {
        this.spsid = spsid;
        this.sp_tid = sp_tid;
        this.sp_bid = sp_bid;
        this.spsseq = spsseq;
        this.spsname = spsname;
        this.spsprices = spsprices;
        this.spscontent = spscontent;
        this.spspartnum = spspartnum;
        this.spspartinfo = spspartinfo;
        this.spsgender = spsgender;
        this.spscss = spscss;
        this.spremarks = spremarks;
    }

    public Integer getSpsid() {
        return spsid;
    }

    public void setSpsid(Integer spsid) {
        this.spsid = spsid;
    }

    public Integer getSp_tid() {
        return sp_tid;
    }

    public void setSp_tid(Integer sp_tid) {
        this.sp_tid = sp_tid;
    }

    public Integer getSp_bid() {
        return sp_bid;
    }

    public void setSp_bid(Integer sp_bid) {
        this.sp_bid = sp_bid;
    }

    public String getSpsseq() {
        return spsseq;
    }

    public void setSpsseq(String spsseq) {
        this.spsseq = spsseq;
    }

    public String getSpsname() {
        return spsname;
    }

    public void setSpsname(String spsname) {
        this.spsname = spsname;
    }

    public Float getSpsprices() {
        return spsprices;
    }

    public void setSpsprices(Float spsprices) {
        this.spsprices = spsprices;
    }

    public String getSpscontent() {
        return spscontent;
    }

    public void setSpscontent(String spscontent) {
        this.spscontent = spscontent;
    }

    public Integer getSpspartnum() {
        return spspartnum;
    }

    public void setSpspartnum(Integer spspartnum) {
        this.spspartnum = spspartnum;
    }

    public String getSpspartinfo() {
        return spspartinfo;
    }

    public void setSpspartinfo(String spspartinfo) {
        this.spspartinfo = spspartinfo;
    }

    public String getSpsgender() {
        return spsgender;
    }

    public void setSpsgender(String spsgender) {
        this.spsgender = spsgender;
    }

    public Integer getSpscss() {
        return spscss;
    }

    public void setSpscss(Integer spscss) {
        this.spscss = spscss;
    }

    public String getSpremarks() {
        return spremarks;
    }

    public void setSpremarks(String spremarks) {
        this.spremarks = spremarks;
    }

    @Override
    public String toString() {
        return "SpcifyShoes{" +
                "spsid=" + spsid +
                ", sp_tid=" + sp_tid +
                ", sp_bid=" + sp_bid +
                ", spsseq='" + spsseq + '\'' +
                ", spsname='" + spsname + '\'' +
                ", spsprices=" + spsprices +
                ", spscontent='" + spscontent + '\'' +
                ", spspartnum=" + spspartnum +
                ", spspartinfo='" + spspartinfo + '\'' +
                ", spsgender='" + spsgender + '\'' +
                ", spscss=" + spscss +
                ", spremarks='" + spremarks + '\'' +
                '}';
    }
}
