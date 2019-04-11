package blog.xiangflight.springinaction4th.config;

import blog.xiangflight.springinaction4th.chapter2.IPackageScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CD播放器的配置类
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version blog.xiangflight.springinaction4th.chapter2
 * @date 2019-04-11 13:36
 */
@Configuration
@ComponentScan(basePackageClasses = IPackageScan.class)
public class CdPlayerConfig {
}
