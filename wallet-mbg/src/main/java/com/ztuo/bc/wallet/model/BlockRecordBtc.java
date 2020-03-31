package com.ztuo.bc.wallet.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_block_record_btc
 */
@ApiModel(value="com.ztuo.bc.wallet.model.BlockRecordBtc")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockRecordBtc implements Cloneable, Serializable {
    /**
     * Database Column Remarks:
     *   自增主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.id
     */
    @ApiModelProperty(value="id自增主键")
    private Integer id;

    /**
     * Database Column Remarks:
     *   交易哈希id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.txid
     */
    @ApiModelProperty(value="txid交易哈希id")
    private String txid;

    /**
     * Database Column Remarks:
     *   发起者地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.from_address
     */
    @ApiModelProperty(value="fromAddress发起者地址")
    private String fromAddress;

    /**
     * Database Column Remarks:
     *   接收者地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.to_address
     */
    @ApiModelProperty(value="toAddress接收者地址")
    private String toAddress;

    /**
     * Database Column Remarks:
     *   交易金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.amount
     */
    @ApiModelProperty(value="amount交易金额")
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   交易区块高度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.block_height
     */
    @ApiModelProperty(value="blockHeight交易区块高度")
    private String blockHeight;

    /**
     * Database Column Remarks:
     *   交易HASHID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.block_hash
     */
    @ApiModelProperty(value="blockHash交易HASHID")
    private String blockHash;

    /**
     * Database Column Remarks:
     *   交易手续费（btc/kb）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.trade_fee
     */
    @ApiModelProperty(value="tradeFee交易手续费（btc/kb）")
    private BigDecimal tradeFee;

    /**
     * Database Column Remarks:
     *   交易状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.status
     */
    @ApiModelProperty(value="status交易状态")
    private String status;

    /**
     * Database Column Remarks:
     *   币种
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.currency
     */
    @ApiModelProperty(value="currency币种")
    private String currency;

    /**
     * Database Column Remarks:
     *   所属系统ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.sys_id
     */
    @ApiModelProperty(value="sysId所属系统ID")
    private String sysId;

    /**
     * Database Column Remarks:
     *   是否回调
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.is_callback
     */
    @ApiModelProperty(value="isCallback是否回调")
    private String isCallback;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.is_delete
     */
    @ApiModelProperty(value="isDelete是否删除")
    private String isDelete;

    /**
     * Database Column Remarks:
     *   交易类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.pay_type
     */
    @ApiModelProperty(value="payType交易类型")
    private String payType;

    /**
     * Database Column Remarks:
     *   本系统流水号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.order_no
     */
    @ApiModelProperty(value="orderNo本系统流水号")
    private String orderNo;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.remark
     */
    @ApiModelProperty(value="remark备注")
    private String remark;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_block_record_btc.create_time
     */
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", txid=").append(txid);
        sb.append(", fromAddress=").append(fromAddress);
        sb.append(", toAddress=").append(toAddress);
        sb.append(", amount=").append(amount);
        sb.append(", blockHeight=").append(blockHeight);
        sb.append(", blockHash=").append(blockHash);
        sb.append(", tradeFee=").append(tradeFee);
        sb.append(", status=").append(status);
        sb.append(", currency=").append(currency);
        sb.append(", sysId=").append(sysId);
        sb.append(", isCallback=").append(isCallback);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", payType=").append(payType);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public BlockRecordBtc clone() throws CloneNotSupportedException {
        return (BlockRecordBtc) super.clone();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_block_record_btc
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        txid("txid", "txid", "VARCHAR", false),
        fromAddress("from_address", "fromAddress", "VARCHAR", false),
        toAddress("to_address", "toAddress", "VARCHAR", false),
        amount("amount", "amount", "DECIMAL", false),
        blockHeight("block_height", "blockHeight", "VARCHAR", false),
        blockHash("block_hash", "blockHash", "VARCHAR", false),
        tradeFee("trade_fee", "tradeFee", "DECIMAL", false),
        status("status", "status", "CHAR", true),
        currency("currency", "currency", "CHAR", false),
        sysId("sys_id", "sysId", "VARCHAR", false),
        isCallback("is_callback", "isCallback", "CHAR", false),
        isDelete("is_delete", "isDelete", "CHAR", false),
        payType("pay_type", "payType", "VARCHAR", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        remark("remark", "remark", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}