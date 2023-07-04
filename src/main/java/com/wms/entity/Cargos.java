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
public class Cargos implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cargo_id", type = IdType.AUTO)
    private Integer cargoId;

    private String name;

    private String type;

    private Integer storeNum;

    private Integer rentNum;

    private Float worth;

    private String remark;

    private Integer storeId;


}
