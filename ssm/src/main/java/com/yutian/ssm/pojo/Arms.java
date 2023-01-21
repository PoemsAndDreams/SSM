package com.yutian.ssm.pojo;

public class Arms {
    private Integer aid ;
    private String aname ;
    private String atype ;
    private String astar;

    public Arms() {
    }

    public Arms(Integer aid, String aname, String atype, String astar) {
        this.aid = aid;
        this.aname = aname;
        this.atype = atype;
        this.astar = astar;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public String getAstar() {
        return astar;
    }

    public void setAstar(String astar) {
        this.astar = astar;
    }

    @Override
    public String toString() {
        return aid + "\t\t" + aname + "\t\t" + atype + "\t\t" + astar;
    }
}
