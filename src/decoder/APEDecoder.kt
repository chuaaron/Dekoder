package decoder

import utils.Echoer

/**
 * @author ice1000
 * Created by ice1000 on 2016/5/26.
 */

class APEDecoder: DecoderInterface {

    override fun getTotalTime(): Long {
        return 60
    }

    override var path: String

    constructor(path: String, echoer: Echoer) : super(echoer) {
        this.path = path
    }
}