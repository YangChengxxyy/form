package com.example.demo.entity;

import java.io.Serializable;

public class OutgoIncomeHistory implements Serializable {

    private Integer id;

    private Integer jigId;

    private String code;

    private Integer seqId;

    private String submitId;

    private String outgoTime;

    private String recId;

    private Integer status;

    private Integer productionLineId;

    private String description;

    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJigId() {
        return jigId;
    }

    public void setJigId(Integer jigId) {
        this.jigId = jigId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getSubmitId() {
        return submitId;
    }

    public void setSubmitId(String submitId) {
        this.submitId = submitId;
    }

    public String getOutgoTime() {
        return outgoTime;
    }

    public void setOutgoTime(String outgoTime) {
        this.outgoTime = outgoTime;
    }


    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getProductionLineId() {
        return productionLineId;
    }


    public void setProductionLineId(Integer productionLineId) {
        this.productionLineId = productionLineId;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}