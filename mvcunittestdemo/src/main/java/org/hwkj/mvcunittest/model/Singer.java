package org.hwkj.mvcunittest.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author HuWendong
 * @date 2019/5/28 17:58
 */
@Data
public class Singer implements Serializable {
    public static final String COL_VERSION = "version";
    public static final String COL_FIRST_NAME = "first_name";
    public static final String COL_LAST_NAME = "last_name";
    public static final String COL_BIRTH_DATE = "birth_date";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_TIME = "update_time";
    private Long id;

    private Integer version;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}