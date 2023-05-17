package com.tomato.mybatis.generator.entity;

import java.util.Date;

public class NoticeRule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.id
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.rule_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String ruleCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.rule_name
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String ruleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.max_retry_times
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Short maxRetryTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.retry_delay
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Short retryDelay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.http_method
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String httpMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.handler
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String handler;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.handler_char_set
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String handlerCharSet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.handler_params
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String handlerParams;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.desc
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.biz_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String bizCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.response_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String responseCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.computer_room
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String computerRoom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.io
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private String io;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.version
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.update_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notice_rule.create_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.id
     *
     * @return the value of t_notice_rule.id
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.id
     *
     * @param id the value for t_notice_rule.id
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.rule_code
     *
     * @return the value of t_notice_rule.rule_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.rule_code
     *
     * @param ruleCode the value for t_notice_rule.rule_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode == null ? null : ruleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.rule_name
     *
     * @return the value of t_notice_rule.rule_name
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.rule_name
     *
     * @param ruleName the value for t_notice_rule.rule_name
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.max_retry_times
     *
     * @return the value of t_notice_rule.max_retry_times
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Short getMaxRetryTimes() {
        return maxRetryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.max_retry_times
     *
     * @param maxRetryTimes the value for t_notice_rule.max_retry_times
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setMaxRetryTimes(Short maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.retry_delay
     *
     * @return the value of t_notice_rule.retry_delay
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Short getRetryDelay() {
        return retryDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.retry_delay
     *
     * @param retryDelay the value for t_notice_rule.retry_delay
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setRetryDelay(Short retryDelay) {
        this.retryDelay = retryDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.http_method
     *
     * @return the value of t_notice_rule.http_method
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.http_method
     *
     * @param httpMethod the value for t_notice_rule.http_method
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod == null ? null : httpMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.handler
     *
     * @return the value of t_notice_rule.handler
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getHandler() {
        return handler;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.handler
     *
     * @param handler the value for t_notice_rule.handler
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.handler_char_set
     *
     * @return the value of t_notice_rule.handler_char_set
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getHandlerCharSet() {
        return handlerCharSet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.handler_char_set
     *
     * @param handlerCharSet the value for t_notice_rule.handler_char_set
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setHandlerCharSet(String handlerCharSet) {
        this.handlerCharSet = handlerCharSet == null ? null : handlerCharSet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.handler_params
     *
     * @return the value of t_notice_rule.handler_params
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getHandlerParams() {
        return handlerParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.handler_params
     *
     * @param handlerParams the value for t_notice_rule.handler_params
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setHandlerParams(String handlerParams) {
        this.handlerParams = handlerParams == null ? null : handlerParams.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.desc
     *
     * @return the value of t_notice_rule.desc
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.desc
     *
     * @param desc the value for t_notice_rule.desc
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.biz_code
     *
     * @return the value of t_notice_rule.biz_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.biz_code
     *
     * @param bizCode the value for t_notice_rule.biz_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.response_code
     *
     * @return the value of t_notice_rule.response_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.response_code
     *
     * @param responseCode the value for t_notice_rule.response_code
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode == null ? null : responseCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.computer_room
     *
     * @return the value of t_notice_rule.computer_room
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getComputerRoom() {
        return computerRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.computer_room
     *
     * @param computerRoom the value for t_notice_rule.computer_room
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setComputerRoom(String computerRoom) {
        this.computerRoom = computerRoom == null ? null : computerRoom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.io
     *
     * @return the value of t_notice_rule.io
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public String getIo() {
        return io;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.io
     *
     * @param io the value for t_notice_rule.io
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setIo(String io) {
        this.io = io == null ? null : io.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.version
     *
     * @return the value of t_notice_rule.version
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.version
     *
     * @param version the value for t_notice_rule.version
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.update_time
     *
     * @return the value of t_notice_rule.update_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.update_time
     *
     * @param updateTime the value for t_notice_rule.update_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notice_rule.create_time
     *
     * @return the value of t_notice_rule.create_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notice_rule.create_time
     *
     * @param createTime the value for t_notice_rule.create_time
     *
     * @mbg.generated Wed May 17 11:39:00 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}