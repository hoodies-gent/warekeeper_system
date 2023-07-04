package com.wms.entity;

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
public class SecretKeys implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer secretKey;

    private Integer status;


}
