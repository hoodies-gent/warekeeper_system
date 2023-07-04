package com.wms.entity;

import java.time.LocalDateTime;
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
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime time;

    private Integer move;

    private String location;

    private Integer num;

    private Float worth;

    private String userName;

    private Integer status;


}
