import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record az(Optional<jp<dpz>> c, Optional<ds> d, Optional<da> e, bo f) {
   public static final Codec<az> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ka.a(mn.i).optionalFieldOf("blocks").forGetter(az::b),
            ds.a.optionalFieldOf("state").forGetter(az::c),
            da.a.optionalFieldOf("nbt").forGetter(az::d),
            bo.b.forGetter(az::e)
         )
         .apply($$0, az::new)
   );
   public static final zm<wx, az> b = zm.a(zk.a(zk.c(mn.i)), az::b, zk.a(ds.b), az::c, zk.a(da.b), az::d, bo.c, az::e, az::new);

   public boolean a(aub $$0, jb $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else if (!this.a($$0.a_($$1))) {
         return false;
      } else {
         if (this.e.isPresent() || !this.f.a()) {
            eaz $$2 = $$0.c_($$1);
            if (this.e.isPresent() && !a($$0, $$2, this.e.get())) {
               return false;
            }

            if (!this.f.a() && !a($$2, this.f)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean a(eef $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(eeb $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dmx $$0, @Nullable eaz $$1, da $$2) {
      return $$1 != null && $$2.a($$1.b($$0.K_()));
   }

   private static boolean a(@Nullable eaz $$0, bo $$1) {
      return $$0 != null && $$1.a($$0.r());
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jp<dpz>> b() {
      return this.c;
   }

   public Optional<ds> c() {
      return this.d;
   }

   public Optional<da> d() {
      return this.e;
   }

   public bo e() {
      return this.f;
   }

   public static class a {
      private Optional<jp<dpz>> a = Optional.empty();
      private Optional<ds> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private bo d = bo.a;

      private a() {
      }

      public static az.a a() {
         return new az.a();
      }

      public az.a a(jm<dpz> $$0, dpz... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public az.a a(jm<dpz> $$0, Collection<dpz> $$1) {
         this.a = Optional.of(jp.a(dpz::p, $$1));
         return this;
      }

      public az.a a(jm<dpz> $$0, bae<dpz> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public az.a a(ui $$0) {
         this.c = Optional.of(new da($$0));
         return this;
      }

      public az.a a(ds.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public az.a a(bo $$0) {
         this.d = $$0;
         return this;
      }

      public az b() {
         return new az(this.a, this.b, this.c, this.d);
      }
   }
}
