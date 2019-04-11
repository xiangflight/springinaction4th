package blog.xiangflight.springinaction4th.chapter2;

import org.springframework.stereotype.Component;

/**
 * CD的具体实现
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version blog.xiangflight.springinaction4th.chapter2
 * @date 2019-04-11 13:33
 */
@Component
public class SgtPeppers implements ICompactDisc {

    public static String TITLE = "Sgt. Peppers's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    /**
     * 演奏方法
     */
    @Override
    public void play() {
        System.out.println("Playing " + TITLE + " by " + artist);
    }

}
