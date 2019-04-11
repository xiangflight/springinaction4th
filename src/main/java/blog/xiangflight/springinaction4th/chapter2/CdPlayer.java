package blog.xiangflight.springinaction4th.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CD播放器
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version blog.xiangflight.springinaction4th.chapter2
 * @date 2019-04-11 18:50
 */
@Component
public class CdPlayer implements IMediaPlayer {

    private ICompactDisc compactDisc;

    @Autowired
    public CdPlayer(ICompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
