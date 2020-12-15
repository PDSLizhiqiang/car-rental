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
@TableName("ordersdetail")
public class Ordersdetail extends Model<Ordersdetail> {

    private static final long serialVersionUID = 1L;

        /**
     * 编号
     */
         @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

        /**
     * 订单id
     */
         @TableField("oid")
    private Integer oid;

        /**
     * 商品id
     */
         @TableField("gid")
    private Integer gid;
        

		@TableField(exist=false)
         private Goods goods;
         
        public Goods getGoods() {
			return goods;
		}

		public void setGoods(Goods goods) {
			this.goods = goods;
		}
        /**
     * 数量
     */
         @TableField("quantity")
    private Integer quantity;

        /**
     * 小计
     */
         @TableField("price")
    private Double price;

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


    public Integer getId() {
        return id;
    }

    public Ordersdetail setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOid() {
        return oid;
    }

    public Ordersdetail setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Integer getGid() {
        return gid;
    }

    public Ordersdetail setGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Ordersdetail setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Ordersdetail setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getBak1() {
        return bak1;
    }

    public Ordersdetail setBak1(String bak1) {
        this.bak1 = bak1;
        return this;
    }

    public String getBak2() {
        return bak2;
    }

    public Ordersdetail setBak2(String bak2) {
        this.bak2 = bak2;
        return this;
    }

    public String getBak3() {
        return bak3;
    }

    public Ordersdetail setBak3(String bak3) {
        this.bak3 = bak3;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Ordersdetail{" +
        "id=" + id +
        ", oid=" + oid +
        ", gid=" + gid +
        ", quantity=" + quantity +
        ", price=" + price +
        ", bak1=" + bak1 +
        ", bak2=" + bak2 +
        ", bak3=" + bak3 +
        "}";
    }
}
