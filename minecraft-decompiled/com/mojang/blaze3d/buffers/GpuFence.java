package com.mojang.blaze3d.buffers;

@fkz
public interface GpuFence extends AutoCloseable {
   @Override
   void close();

   boolean awaitCompletion(long var1);
}
