package org.arvin.model.user;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName users
 */
@Data
public class Users implements Serializable {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    @Serial
    private static final long serialVersionUID = 1L;
}