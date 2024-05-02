package com.entity.model;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生成绩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengchengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 教师
     */
    private Integer kechengziyuanId;


    /**
     * 成绩
     */
    private Integer chengji;


    /**
     * 学分
     */
    private Integer xuefen;


    /**
     * 学科
     */
    private Integer xueke;


    /**
     * 成绩详情
     */
    private String xueshengchengjiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：教师
	 */
    public Integer getKechengziyuanId() {
        return kechengziyuanId;
    }


    /**
	 * 设置：教师
	 */
    public void setKechengziyuanId(Integer kechengziyuanId) {
        this.kechengziyuanId = kechengziyuanId;
    }
    /**
	 * 获取：成绩
	 */
    public Integer getChengji() {
        return chengji;
    }


    /**
	 * 设置：成绩
	 */
    public void setChengji(Integer chengji) {
        this.chengji = chengji;
    }
    /**
	 * 获取：学分
	 */
    public Integer getXuefen() {
        return xuefen;
    }


    /**
	 * 设置：学分
	 */
    public void setXuefen(Integer xuefen) {
        this.xuefen = xuefen;
    }
    /**
	 * 获取：学科
	 */
    public Integer getXueke() {
        return xueke;
    }


    /**
	 * 设置：学科
	 */
    public void setXueke(Integer xueke) {
        this.xueke = xueke;
    }
    /**
	 * 获取：成绩详情
	 */
    public String getXueshengchengjiContent() {
        return xueshengchengjiContent;
    }


    /**
	 * 设置：成绩详情
	 */
    public void setXueshengchengjiContent(String xueshengchengjiContent) {
        this.xueshengchengjiContent = xueshengchengjiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
