import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hbe implements hbk {
   public static final hbk a = new hbk() {
      @Override
      public boolean a(jh $$0, jh $$1) {
         return false;
      }
   };
   public static final hbk b = new hbk() {
      @Override
      public boolean a(jh $$0, jh $$1) {
         return true;
      }
   };
   private final List<eaz> c;
   private final hbo d;
   @Nullable
   private final foc.b e;
   @Nullable
   private hbm f;
   private final Map<hba, hbh> g = new EnumMap<>(hba.class);

   public hbe(hbm $$0, hbi.a $$1) {
      this.f = $$0;
      this.d = $$1.c;
      this.c = $$1.a;
      this.e = $$1.d;
   }

   public void a(hbm $$0) {
      this.f = $$0;
   }

   @Override
   public boolean b(hbm $$0) {
      return !$$0.equals(this.f);
   }

   @Override
   public boolean a() {
      return !this.g.isEmpty();
   }

   @Override
   public boolean a(hba $$0) {
      return !this.g.containsKey($$0);
   }

   @Override
   public List<eaz> b() {
      return this.c;
   }

   @Override
   public boolean a(jh $$0, jh $$1) {
      return this.d.a($$0, $$1);
   }

   @Nullable
   @Override
   public hbh b(hba $$0) {
      return this.g.get($$0);
   }

   public void a(hba $$0, foc $$1, long $$2) {
      CommandEncoder $$3 = RenderSystem.getDevice().createCommandEncoder();
      hbh $$4 = this.b($$0);
      if ($$4 != null) {
         if ($$4.a().size() < $$1.a().remaining()) {
            $$4.a().close();
            $$4.b(
               RenderSystem.getDevice()
                  .createBuffer(() -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + ke.b($$2) + ", " + ke.c($$2) + ", " + ke.d($$2), 40, $$1.a())
            );
         } else if (!$$4.a().isClosed()) {
            $$3.writeToBuffer($$4.a().slice(), $$1.a());
         }

         ByteBuffer $$5 = $$1.b();
         if ($$5 != null) {
            if ($$4.b() != null && $$4.b().size() >= $$5.remaining()) {
               if (!$$4.b().isClosed()) {
                  $$3.writeToBuffer($$4.b().slice(), $$5);
               }
            } else {
               if ($$4.b() != null) {
                  $$4.b().close();
               }

               $$4.a(
                  RenderSystem.getDevice()
                     .createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + ke.b($$2) + ", " + ke.c($$2) + ", " + ke.d($$2), 72, $$5)
               );
            }
         } else if ($$4.b() != null) {
            $$4.b().close();
            $$4.a(null);
         }

         $$4.a($$1.c().c());
         $$4.a($$1.c().e());
      } else {
         GpuBuffer $$6 = RenderSystem.getDevice()
            .createBuffer(() -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + ke.b($$2) + ", " + ke.c($$2) + ", " + ke.d($$2), 40, $$1.a());
         ByteBuffer $$7 = $$1.b();
         GpuBuffer $$8 = $$7 != null
            ? RenderSystem.getDevice()
               .createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + ke.b($$2) + ", " + ke.c($$2) + ", " + ke.d($$2), 72, $$7)
            : null;
         hbh $$9 = new hbh($$6, $$8, $$1.c().c(), $$1.c().e());
         this.g.put($$0, $$9);
      }
   }

   public void a(hba $$0, foa.a $$1, long $$2) {
      hbh $$3 = this.b($$0);
      if ($$3 != null) {
         if ($$3.b() == null) {
            $$3.a(
               RenderSystem.getDevice()
                  .createBuffer(() -> "Section index buffer - layer: " + $$0.c() + "; cords: " + ke.b($$2) + ", " + ke.c($$2) + ", " + ke.d($$2), 72, $$1.a())
            );
         } else {
            CommandEncoder $$4 = RenderSystem.getDevice().createCommandEncoder();
            if (!$$3.b().isClosed()) {
               $$4.writeToBuffer($$3.b().slice(), $$1.a());
            }
         }
      }
   }

   @Override
   public boolean c() {
      return this.g.containsKey(hba.d);
   }

   @Nullable
   public foc.b d() {
      return this.e;
   }

   @Override
   public void close() {
      this.g.values().forEach(hbh::close);
      this.g.clear();
   }
}
