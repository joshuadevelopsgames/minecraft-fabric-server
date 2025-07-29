import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dfd {
   private static final Logger e = LogUtils.getLogger();
   public static final dfd a = new dfd(new ui());
   private static final String f = "id";
   public static final Codec<dfd> b = Codec.withAlternative(ui.a, vj.e).xmap(dfd::new, $$0 -> $$0.g);
   public static final Codec<dfd> c = b.validate(
      $$0 -> $$0.e().i("id").isPresent() ? DataResult.success($$0) : DataResult.error(() -> "Missing id for entity in: " + $$0)
   );
   @Deprecated
   public static final zm<ByteBuf, dfd> d = zk.s.a(dfd::new, $$0 -> $$0.g);
   private final ui g;

   private dfd(ui $$0) {
      this.g = $$0;
   }

   public static dfd a(ui $$0) {
      return new dfd($$0.l());
   }

   public boolean b(ui $$0) {
      return ux.a($$0, this.g, true);
   }

   public static void a(kp<dfd> $$0, dcv $$1, Consumer<ui> $$2) {
      dfd $$3 = $$1.a($$0, a).a($$2);
      if ($$3.g.j()) {
         $$1.e($$0);
      } else {
         $$1.b($$0, $$3);
      }
   }

   public static void a(kp<dfd> $$0, dcv $$1, ui $$2) {
      if (!$$2.j()) {
         $$1.b($$0, a($$2));
      } else {
         $$1.e($$0);
      }
   }

   public dfd a(Consumer<ui> $$0) {
      ui $$1 = this.g.l();
      $$0.accept($$1);
      return new dfd($$1);
   }

   @Nullable
   public ame a() {
      return this.g.<ame>a("id", ame.a).orElse(null);
   }

   @Nullable
   public <T> T a(jn.a $$0, amd<? extends jy<T>> $$1) {
      ame $$2 = this.a();
      return $$2 == null ? null : $$0.a($$1).flatMap($$2x -> $$2x.a(amd.a($$1, $$2))).map(jl::a).orElse(null);
   }

   public void a(bzm $$0) {
      try (bci.j $$1 = new bci.j($$0.ef(), e)) {
         fcz $$2 = fcz.a($$1, $$0.eb());
         $$0.d($$2);
         ui $$3 = $$2.b();
         UUID $$4 = $$0.cK();
         $$3.a(this.g);
         $$0.e(fcy.a($$1, $$0.eb(), $$3));
         $$0.a_($$4);
      }
   }

   public boolean a(eaz $$0, jn.a $$1) {
      boolean $$6;
      try (bci.j $$2 = new bci.j($$0.t(), e)) {
         fcz $$3 = fcz.a($$2, $$1);
         $$0.f($$3);
         ui $$4 = $$3.b();
         ui $$5 = $$4.l();
         $$4.a(this.g);
         if (!$$4.equals($$5)) {
            try {
               $$0.c(fcy.a($$2, $$1, $$4));
               $$0.e();
               return true;
            } catch (Exception var11) {
               e.warn("Failed to apply custom data to block entity at {}", $$0.aA_(), var11);

               try {
                  $$0.c(fcy.a($$2.a(() -> "(rollback)"), $$1, $$5));
               } catch (Exception var10) {
                  e.warn("Failed to rollback block entity at {} after failure", $$0.aA_(), var10);
               }
            }
         }

         $$6 = false;
      }

      return $$6;
   }

   public <T> DataResult<dfd> a(DynamicOps<vi> $$0, MapEncoder<T> $$1, T $$2) {
      return $$1.encode($$2, $$0, $$0.mapBuilder()).build(this.g).map($$0x -> new dfd((ui)$$0x));
   }

   public <T> DataResult<T> a(MapDecoder<T> $$0) {
      return this.a(uw.a, $$0);
   }

   public <T> DataResult<T> a(DynamicOps<vi> $$0, MapDecoder<T> $$1) {
      MapLike<vi> $$2 = (MapLike<vi>)$$0.getMap(this.g).getOrThrow();
      return $$1.decode($$0, $$2);
   }

   public int b() {
      return this.g.i();
   }

   public boolean c() {
      return this.g.j();
   }

   public ui d() {
      return this.g.l();
   }

   public boolean a(String $$0) {
      return this.g.b($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return $$0 instanceof dfd $$1 ? this.g.equals($$1.g) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.g.hashCode();
   }

   @Override
   public String toString() {
      return this.g.toString();
   }

   @Deprecated
   public ui e() {
      return this.g;
   }
}
