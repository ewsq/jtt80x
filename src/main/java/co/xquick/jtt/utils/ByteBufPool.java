package co.xquick.jtt.utils;

import io.netty.buffer.PooledByteBufAllocator;

/**
 * 内存池
 *
 * @author liuliwen
 */
public class ByteBufPool {

    public static PooledByteBufAllocator BYTE_BUF_POOL = new PooledByteBufAllocator();

}
