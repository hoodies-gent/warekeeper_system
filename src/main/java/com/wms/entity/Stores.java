package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author losingways
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Stores implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "store_id", type = IdType.AUTO)
    private Integer storeId;

    private String storeName;

    private String address;

    private String managerName;

    private String userName;


}
