package org.arvin.user;

import arvin.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.*;

import static net.sf.jsqlparser.parser.CCJSqlParserUtil.LOGGER;

@RestController
@ConditionalOnWebApplication
public class DemoController {

    @Autowired
    private UserService demoService;

//    @ApiOperation(value = "更新品牌")
    @GetMapping(value = "brand")
    public CommonResult updateBrand() {
        LOGGER.info("createBrand :{}");
        return CommonResult.success(demoService.getUsersMapper());
    }
}
