package com.entity.view;

import com.entity.XueshengchengjiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生成绩
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengchengji")
public class XueshengchengjiView extends XueshengchengjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kechengziyuan
			/**
			* 课程信息 的 教师
			*/
			private Integer kechengziyuanJiaoshiId;
			/**
			* 课程名称
			*/
			private String kechengziyuanName;
			/**
			* 课程封面
			*/
			private String kechengziyuanPhoto;
			/**
			* 课程时间
			*/
			private String kechengziyuanDate;
			/**
			* 课程文件
			*/
			private String kechengziyuanFile;
			/**
			* 课程类型
			*/
			private Integer kechengziyuanTypes;
				/**
				* 课程类型的值
				*/
				private String kechengziyuanValue;
			/**
			* 课程详情
			*/
			private String kechengziyuanContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XueshengchengjiView() {

	}

	public XueshengchengjiView(XueshengchengjiEntity xueshengchengjiEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set kechengziyuan
					/**
					* 获取：课程信息 的 教师
					*/
					public Integer getKechengziyuanJiaoshiId() {
						return kechengziyuanJiaoshiId;
					}
					/**
					* 设置：课程信息 的 教师
					*/
					public void setKechengziyuanJiaoshiId(Integer kechengziyuanJiaoshiId) {
						this.kechengziyuanJiaoshiId = kechengziyuanJiaoshiId;
					}

					/**
					* 获取： 课程名称
					*/
					public String getKechengziyuanName() {
						return kechengziyuanName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengziyuanName(String kechengziyuanName) {
						this.kechengziyuanName = kechengziyuanName;
					}
					/**
					* 获取： 课程封面
					*/
					public String getKechengziyuanPhoto() {
						return kechengziyuanPhoto;
					}
					/**
					* 设置： 课程封面
					*/
					public void setKechengziyuanPhoto(String kechengziyuanPhoto) {
						this.kechengziyuanPhoto = kechengziyuanPhoto;
					}
					/**
					* 获取： 课程时间
					*/
					public String getKechengziyuanDate() {
						return kechengziyuanDate;
					}
					/**
					* 设置： 课程时间
					*/
					public void setKechengziyuanDate(String kechengziyuanDate) {
						this.kechengziyuanDate = kechengziyuanDate;
					}
					/**
					* 获取： 课程文件
					*/
					public String getKechengziyuanFile() {
						return kechengziyuanFile;
					}
					/**
					* 设置： 课程文件
					*/
					public void setKechengziyuanFile(String kechengziyuanFile) {
						this.kechengziyuanFile = kechengziyuanFile;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getKechengziyuanTypes() {
						return kechengziyuanTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengziyuanTypes(Integer kechengziyuanTypes) {
						this.kechengziyuanTypes = kechengziyuanTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengziyuanValue() {
							return kechengziyuanValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengziyuanValue(String kechengziyuanValue) {
							this.kechengziyuanValue = kechengziyuanValue;
						}
					/**
					* 获取： 课程详情
					*/
					public String getKechengziyuanContent() {
						return kechengziyuanContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setKechengziyuanContent(String kechengziyuanContent) {
						this.kechengziyuanContent = kechengziyuanContent;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
