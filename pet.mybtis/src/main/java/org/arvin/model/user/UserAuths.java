package org.arvin.model.user;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_auths
 */
@Data
public class UserAuths implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 登陆类型 微信｜手机号
     */
    private String identityType;

    /**
     * 登陆凭证
     */
    private String identifier;

    /**
     * 密码
     */
    private String credential;

    @Serial
    private static final long serialVersionUID = 1L;
}