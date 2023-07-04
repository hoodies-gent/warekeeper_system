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
public class Staffs implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String name;

    private Integer gender;

    private String address;

    private Long phone;

    private String managerName;

    private Integer storeId;

    private String password;


}
