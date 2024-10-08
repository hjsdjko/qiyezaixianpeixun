package com.entity.vo;

import com.entity.JiangshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 讲师
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangshi")
public class JiangshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 讲师名称
     */

    @TableField(value = "jiangshi_name")
    private String jiangshiName;


    /**
     * 联系方式
     */

    @TableField(value = "jiangshi_phone")
    private String jiangshiPhone;


    /**
     * 头像
     */

    @TableField(value = "jiangshi_photo")
    private String jiangshiPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "jiangshi_email")
    private String jiangshiEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：讲师名称
	 */
    public String getJiangshiName() {
        return jiangshiName;
    }


    /**
	 * 获取：讲师名称
	 */

    public void setJiangshiName(String jiangshiName) {
        this.jiangshiName = jiangshiName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiangshiPhone() {
        return jiangshiPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setJiangshiPhone(String jiangshiPhone) {
        this.jiangshiPhone = jiangshiPhone;
    }
    /**
	 * 设置：头像
	 */
    public String getJiangshiPhoto() {
        return jiangshiPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setJiangshiPhoto(String jiangshiPhoto) {
        this.jiangshiPhoto = jiangshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getJiangshiEmail() {
        return jiangshiEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setJiangshiEmail(String jiangshiEmail) {
        this.jiangshiEmail = jiangshiEmail;
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

}
