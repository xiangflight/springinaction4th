package blog.xiangflight.springinaction4th;

import blog.xiangflight.springinaction4th.chapter2.ICompactDisc;
import blog.xiangflight.springinaction4th.config.CdPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * 测试类
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version blog.xiangflight.springinaction4th
 * @date 2019-04-11 13:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private ICompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

}
