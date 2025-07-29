package com.mojang.blaze3d.buffers;

import java.nio.ByteBuffer;

@fkz
public abstract class GpuBuffer implements AutoCloseable {
   public static final int USAGE_MAP_READ = 1;
   public static final int USAGE_MAP_WRITE = 2;
   public static final int USAGE_HINT_CLIENT_STORAGE = 4;
   public static final int USAGE_COPY_DST = 8;
   public static final int USAGE_COPY_SRC = 16;
   public static final int USAGE_VERTEX = 32;
   public static final int USAGE_INDEX = 64;
   public static final int USAGE_UNIFORM = 128;
   public static final int USAGE_UNIFORM_TEXEL_BUFFER = 256;
   private final int usage;
   public int size;

   public GpuBuffer(int $$0, int $$1) {
      this.size = $$1;
      this.usage = $$0;
   }

   public int size() {
      return this.size;
   }

   public int usage() {
      return this.usage;
   }

   public abstract boolean isClosed();

   @Override
   public abstract void close();

   public GpuBufferSlice slice(int $$0, int $$1) {
      if ($$0 >= 0 && $$1 >= 0 && $$0 + $$1 <= this.size) {
         return new GpuBufferSlice(this, $$0, $$1);
      } else {
         throw new IllegalArgumentException("Offset of " + $$0 + " and length " + $$1 + " would put new slice outside buffer's range (of 0," + $$1 + ")");
      }
   }

   public GpuBufferSlice slice() {
      return new GpuBufferSlice(this, 0, this.size);
   }

   @fkz
   public interface MappedView extends AutoCloseable {
      ByteBuffer data();

      @Override
      void close();
   }
}
