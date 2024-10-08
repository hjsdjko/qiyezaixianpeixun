package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程信息
 *
 * @author 
 * @email
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengEntity() {

	}

	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程名称
     */
    @TableField(value = "kecheng_name")

    private String kechengName;


    /**
     * 课程封面
     */
    @TableField(value = "kecheng_photo")

    private String kechengPhoto;


    /**
     * 课程视频
     */
    @TableField(value = "kecheng_video")

    private String kechengVideo;


    /**
     * 课程资料
     */
    @TableField(value = "kecheng_file")

    private String kechengFile;


    /**
     * 课程类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 讲师
     */
    @TableField(value = "jiangshi_id")

    private Integer jiangshiId;


    /**
     * 课程发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 点击次数
     */
    @TableField(value = "shangpin_clicknum")

    private Integer shangpinClicknum;


    /**
     * 课程详情
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }
    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }
    /**
	 * 获取：课程封面
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：课程视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }
    /**
	 * 获取：课程视频
	 */

    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 设置：课程资料
	 */
    public String getKechengFile() {
        return kechengFile;
    }
    /**
	 * 获取：课程资料
	 */

    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }
    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：讲师
	 */
    public Integer getJiangshiId() {
        return jiangshiId;
    }
    /**
	 * 获取：讲师
	 */

    public void setJiangshiId(Integer jiangshiId) {
        this.jiangshiId = jiangshiId;
    }
    /**
	 * 设置：课程发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：课程发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }
    /**
	 * 获取：课程详情
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
            "id=" + id +
            ", kechengName=" + kechengName +
            ", kechengPhoto=" + kechengPhoto +
            ", kechengVideo=" + kechengVideo +
            ", kechengFile=" + kechengFile +
            ", kechengTypes=" + kechengTypes +
            ", jiangshiId=" + jiangshiId +
            ", insertTime=" + insertTime +
            ", shangpinClicknum=" + shangpinClicknum +
            ", kechengContent=" + kechengContent +
            ", createTime=" + createTime +
        "}";
    }
}
