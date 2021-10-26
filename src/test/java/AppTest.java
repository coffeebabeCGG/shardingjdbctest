import com.cgg.ShardingJdbcApp;
import com.cgg.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/25
 */
@SpringBootTest(classes = ShardingJdbcApp.class)
@RunWith(SpringRunner.class)
public class AppTest {

    @Resource
    private IUserService userService;


    /**
     * 测试sharding-jdbc添加数据
     */
    @Test
    public void testShardingJdbcInsert() {

        userService.InsertUser();
    }

    /**
     * 测试sharding-jdbc查询数据
     */
    @Test
    public void testShardingJdbcQuery() {

        //全部查询
        userService.queryUserList();

        //根据指定条件查询
        userService.queryUserById(1452619865043066882L);

    }





}
