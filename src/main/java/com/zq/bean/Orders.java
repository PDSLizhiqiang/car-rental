package cn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author nnn
 * @since 2020-03-27
 */
@TableName("orders")
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

        /**
     * 编号
     */
         @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

        /**
     * 用户id
     */
         @TableField("uid")
    private Integer uid;
         @TableField(exist=false)
         private Users users;
         
         public Users getUsers() {
			return users;
		}

		public void setUsers(Users users) {
			this.users = users;
		}

        /**
     * 订单号
     */
         @TableField("orderno")
    private String orderno;

        /**
     * 订价格格
     */
         @TableField("price")
    private Double price;

        /**
     * 订单时间
     */
         @TableField("optime")
    private String optime;

        /**
     * 状态
     */
         @TableField("status")
    private String status;

        /**
     * 备用字段1
     */
         @TableField("bak1")
    private String bak1;

        /**
     * 备用字段2
     */
         @TableField("bak2")
    private String bak2;

        /**
     * 备用字段3
     */
         @TableField("bak3")
    private String bak3;

        /**
     * 删除标记
     */
         @TableField("isdel")
    private Integer isdel;


    public Integer getId() {
        return id;
    }

    public Orders setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUid() {
        return uid;
    }

    public Orders setUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    public String getOrderno() {
        return orderno;
    }

    public Orders setOrderno(String orderno) {
        this.orderno = orderno;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Orders setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getOptime() {
        return optime;
    }

    public Orders setOptime(String optime) {
        this.optime = optime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Orders setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getBak1() {
        return bak1;
    }

    public Orders setBak1(String bak1) {
        this.bak1 = bak1;
        return this;
    }

    public String getBak2() {
        return bak2;
    }

    public Orders setBak2(String bak2) {
        this.bak2 = bak2;
        return this;
    }

    public String getBak3() {
        return bak3;
    }

    public Orders setBak3(String bak3) {
        this.bak3 = bak3;
        return this;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public Orders setIsdel(Integer isdel) {
        this.isdel = isdel;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Orders{" +
        "id=" + id +
        ", uid=" + uid +
        ", orderno=" + orderno +
        ", price=" + price +
        ", optime=" + optime +
        ", status=" + status +
        ", bak1=" + bak1 +
        ", bak2=" + bak2 +
        ", bak3=" + bak3 +
        ", isdel=" + isdel +
        "}";
    }
}
