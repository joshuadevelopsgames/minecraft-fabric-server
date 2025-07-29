import com.google.common.collect.Lists;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.List;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class hnm implements AutoCloseable {
   public static final int a = new Std140SizeCalculator().putVec4().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().get();
   private static final List<hns> b = Lists.newArrayList(new hns[]{new hnt(), new hnv(), new hnp(), new hnq(), new hnw(), new hnr(), new hno()});
   private static boolean c = true;
   private final GpuBuffer d;
   private final gxl e;

   public hnm() {
      GpuDevice $$0 = RenderSystem.getDevice();
      this.e = new gxl(() -> "Fog UBO", 130, a);
      MemoryStack $$1 = MemoryStack.stackPush();

      try {
         ByteBuffer $$2 = $$1.malloc(a);
         this.a($$2, 0, new Vector4f(0.0F), Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
         this.d = $$0.createBuffer(() -> "Empty fog", 128, $$2.flip());
      } catch (Throwable var6) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if ($$1 != null) {
         $$1.close();
      }

      RenderSystem.setShaderFog(this.a(hnm.a.a));
   }

   @Override
   public void close() {
      this.d.close();
      this.e.close();
   }

   public void a() {
      this.e.c();
   }

   public GpuBufferSlice a(hnm.a $$0) {
      if (!c) {
         return this.d.slice(0, a);
      } else {
         return switch ($$0) {
            case a -> this.d.slice(0, a);
            case b -> this.e.b().slice(0, a);
         };
      }
   }

   private Vector4f a(ftm $$0, float $$1, grk $$2, int $$3, float $$4, boolean $$5) {
      fan $$6 = this.a($$0, $$5);
      bzm $$7 = $$0.i();
      hns $$8 = null;
      hns $$9 = null;

      for (hns $$10 : b) {
         if ($$10.a($$6, $$7)) {
            if ($$8 == null && $$10.b()) {
               $$8 = $$10;
            }

            if ($$9 == null && $$10.c()) {
               $$9 = $$10;
            }
         } else {
            $$10.d();
         }
      }

      if ($$8 == null) {
         throw new IllegalStateException("No color source environment found");
      } else {
         int $$11 = $$8.a($$2, $$0, $$3, $$4);
         float $$12 = $$2.l().e();
         float $$13 = bcb.a(($$12 + $$2.L_() - (float)$$0.d().e) / $$12, 0.0F, 1.0F);
         if ($$9 != null) {
            cam $$14 = (cam)$$7;
            $$13 = $$9.a($$14, $$13, $$1);
         }

         float $$15 = baj.j($$11);
         float $$16 = baj.k($$11);
         float $$17 = baj.l($$11);
         if ($$13 > 0.0F && $$6 != fan.a && $$6 != fan.c) {
            float $$18 = bcb.l(1.0F - $$13);
            $$15 *= $$18;
            $$16 *= $$18;
            $$17 *= $$18;
         }

         if ($$4 > 0.0F) {
            $$15 = bcb.h($$4, $$15, $$15 * 0.7F);
            $$16 = bcb.h($$4, $$16, $$16 * 0.6F);
            $$17 = bcb.h($$4, $$17, $$17 * 0.6F);
         }

         float $$19;
         if ($$6 == fan.b) {
            if ($$7 instanceof gwi) {
               $$19 = ((gwi)$$7).E();
            } else {
               $$19 = 1.0F;
            }
         } else if ($$7 instanceof cam $$21 && $$21.d(bys.p) && !$$21.d(bys.G)) {
            $$19 = gxb.a($$21, $$1);
         } else {
            $$19 = 0.0F;
         }

         if ($$15 != 0.0F && $$16 != 0.0F && $$17 != 0.0F) {
            float $$24 = 1.0F / Math.max($$15, Math.max($$16, $$17));
            $$15 = bcb.h($$19, $$15, $$15 * $$24);
            $$16 = bcb.h($$19, $$16, $$16 * $$24);
            $$17 = bcb.h($$19, $$17, $$17 * $$24);
         }

         return new Vector4f($$15, $$16, $$17, 1.0F);
      }
   }

   public static boolean b() {
      return c = !c;
   }

   public Vector4f a(ftm $$0, int $$1, boolean $$2, ftu $$3, float $$4, grk $$5) {
      float $$6 = $$3.a(false);
      Vector4f $$7 = this.a($$0, $$6, $$5, $$1, $$4, $$2);
      float $$8 = $$1 * 16;
      fan $$9 = this.a($$0, $$2);
      bzm $$10 = $$0.i();
      hnl $$11 = new hnl();

      for (hns $$12 : b) {
         if ($$12.a($$9, $$10)) {
            $$12.a($$11, $$10, $$0.e(), $$5, $$8, $$3);
            break;
         }
      }

      float $$13 = bcb.a($$8 / 10.0F, 4.0F, 64.0F);
      $$11.b = $$8 - $$13;
      $$11.d = $$8;

      try (GpuBuffer.MappedView $$14 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.e.b(), false, true)) {
         this.a($$14.data(), 0, $$7, $$11.a, $$11.c, $$11.b, $$11.d, $$11.e, $$11.f);
      }

      return $$7;
   }

   private fan a(ftm $$0, boolean $$1) {
      fan $$2 = $$0.m();
      if ($$2 == fan.f) {
         return $$1 ? fan.d : fan.e;
      } else {
         return $$2;
      }
   }

   private void a(ByteBuffer $$0, int $$1, Vector4f $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
      $$0.position($$1);
      Std140Builder.intoBuffer($$0).putVec4($$2).putFloat($$3).putFloat($$4).putFloat($$5).putFloat($$6).putFloat($$7).putFloat($$8);
   }

   public static enum a {
      a,
      b;
   }
}
