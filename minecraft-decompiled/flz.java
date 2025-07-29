import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.Set;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBBufferStorage;
import org.lwjgl.opengl.ARBDirectStateAccess;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GLCapabilities;

public abstract class flz {
   public static flz a(GLCapabilities $$0, Set<String> $$1) {
      if ($$0.GL_ARB_direct_state_access && fme.e) {
         $$1.add("GL_ARB_direct_state_access");
         return new flz.a();
      } else {
         return new flz.b();
      }
   }

   abstract int a();

   abstract void a(int var1, long var2, int var4);

   abstract void a(int var1, ByteBuffer var2, int var3);

   abstract void a(int var1, int var2, ByteBuffer var3);

   abstract void b(int var1, long var2, int var4);

   abstract void b(int var1, ByteBuffer var2, int var3);

   @Nullable
   abstract ByteBuffer a(int var1, int var2, int var3, int var4);

   abstract void a(int var1);

   abstract int b();

   abstract void a(int var1, int var2, int var3, int var4, int var5);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

   abstract void a(int var1, int var2, int var3);

   abstract void b(int var1, int var2, int var3, int var4, int var5);

   static class a extends flz {
      @Override
      int a() {
         return ARBDirectStateAccess.glCreateBuffers();
      }

      @Override
      void a(int $$0, long $$1, int $$2) {
         ARBDirectStateAccess.glNamedBufferData($$0, $$1, $$2);
      }

      @Override
      void a(int $$0, ByteBuffer $$1, int $$2) {
         ARBDirectStateAccess.glNamedBufferData($$0, $$1, $$2);
      }

      @Override
      void a(int $$0, int $$1, ByteBuffer $$2) {
         ARBDirectStateAccess.glNamedBufferSubData($$0, $$1, $$2);
      }

      @Override
      void b(int $$0, long $$1, int $$2) {
         ARBDirectStateAccess.glNamedBufferStorage($$0, $$1, $$2);
      }

      @Override
      void b(int $$0, ByteBuffer $$1, int $$2) {
         ARBDirectStateAccess.glNamedBufferStorage($$0, $$1, $$2);
      }

      @Nullable
      @Override
      ByteBuffer a(int $$0, int $$1, int $$2, int $$3) {
         return ARBDirectStateAccess.glMapNamedBufferRange($$0, $$1, $$2, $$3);
      }

      @Override
      void a(int $$0) {
         ARBDirectStateAccess.glUnmapNamedBuffer($$0);
      }

      @Override
      public int b() {
         return ARBDirectStateAccess.glCreateFramebuffers();
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
         ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36064, $$1, $$3);
         ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36096, $$2, $$3);
         if ($$4 != 0) {
            GlStateManager._glBindFramebuffer($$4, $$0);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
         ARBDirectStateAccess.glBlitNamedFramebuffer($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
      }

      @Override
      void a(int $$0, int $$1, int $$2) {
         ARBDirectStateAccess.glFlushMappedNamedBufferRange($$0, $$1, $$2);
      }

      @Override
      void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
         ARBDirectStateAccess.glCopyNamedBufferSubData($$0, $$1, $$2, $$3, $$4);
      }
   }

   static class b extends flz {
      @Override
      int a() {
         return GlStateManager._glGenBuffers();
      }

      @Override
      void a(int $$0, long $$1, int $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         GlStateManager._glBufferData(36663, $$1, GlConst.bufferUsageToGlEnum($$2));
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void a(int $$0, ByteBuffer $$1, int $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         GlStateManager._glBufferData(36663, $$1, GlConst.bufferUsageToGlEnum($$2));
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void a(int $$0, int $$1, ByteBuffer $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         GlStateManager._glBufferSubData(36663, $$1, $$2);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void b(int $$0, long $$1, int $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         ARBBufferStorage.glBufferStorage(36663, $$1, $$2);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void b(int $$0, ByteBuffer $$1, int $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         ARBBufferStorage.glBufferStorage(36663, $$1, $$2);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Nullable
      @Override
      ByteBuffer a(int $$0, int $$1, int $$2, int $$3) {
         GlStateManager._glBindBuffer(36663, $$0);
         ByteBuffer $$4 = GlStateManager._glMapBufferRange(36663, $$1, $$2, $$3);
         GlStateManager._glBindBuffer(36663, 0);
         return $$4;
      }

      @Override
      void a(int $$0) {
         GlStateManager._glBindBuffer(36663, $$0);
         GlStateManager._glUnmapBuffer(36663);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void a(int $$0, int $$1, int $$2) {
         GlStateManager._glBindBuffer(36663, $$0);
         GL30.glFlushMappedBufferRange(36663, $$1, $$2);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
         GlStateManager._glBindBuffer(36662, $$0);
         GlStateManager._glBindBuffer(36663, $$1);
         GL31.glCopyBufferSubData(36662, 36663, $$2, $$3, $$4);
         GlStateManager._glBindBuffer(36662, 0);
         GlStateManager._glBindBuffer(36663, 0);
      }

      @Override
      public int b() {
         return GlStateManager.glGenFramebuffers();
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
         int $$5 = $$4 == 0 ? '販' : $$4;
         int $$6 = GlStateManager.getFrameBuffer($$5);
         GlStateManager._glBindFramebuffer($$5, $$0);
         GlStateManager._glFramebufferTexture2D($$5, 36064, 3553, $$1, $$3);
         GlStateManager._glFramebufferTexture2D($$5, 36096, 3553, $$2, $$3);
         if ($$4 == 0) {
            GlStateManager._glBindFramebuffer($$5, $$6);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
         int $$12 = GlStateManager.getFrameBuffer(36008);
         int $$13 = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, $$0);
         GlStateManager._glBindFramebuffer(36009, $$1);
         GlStateManager._glBlitFrameBuffer($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
         GlStateManager._glBindFramebuffer(36008, $$12);
         GlStateManager._glBindFramebuffer(36009, $$13);
      }
   }
}
