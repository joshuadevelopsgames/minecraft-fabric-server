import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tu {
   Codec<tu> a = mm.aB.q().dispatch(tu::a, $$0 -> $$0);
   Codec<jl<tu>> b = ama.a(mn.bl, a);

   static MapCodec<? extends tu> a(jy<MapCodec<? extends tu>> $$0) {
      jy.a($$0, "all_of", tu.a.c);
      jy.a($$0, "game_rules", tu.c.c);
      jy.a($$0, "time_of_day", tu.d.c);
      jy.a($$0, "weather", tu.e.c);
      return jy.a($$0, "function", tu.b.c);
   }

   void a(aub var1);

   default void b(aub $$0) {
   }

   MapCodec<? extends tu> a();

   public record a(List<jl<tu>> d) implements tu {
      public static final MapCodec<tu.a> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(tu.b.listOf().fieldOf("definitions").forGetter(tu.a::b)).apply($$0, tu.a::new)
      );

      public a(tu... $$0) {
         this(Arrays.stream($$0).map(jl::a).toList());
      }

      @Override
      public void a(aub $$0) {
         this.d.forEach($$1 -> $$1.a().a($$0));
      }

      @Override
      public void b(aub $$0) {
         this.d.forEach($$1 -> $$1.a().b($$0));
      }

      @Override
      public MapCodec<tu.a> a() {
         return c;
      }

      public List<jl<tu>> b() {
         return this.d;
      }
   }

   public record b(Optional<ame> d, Optional<ame> e) implements tu {
      private static final Logger f = LogUtils.getLogger();
      public static final MapCodec<tu.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ame.a.optionalFieldOf("setup").forGetter(tu.b::b), ame.a.optionalFieldOf("teardown").forGetter(tu.b::c)).apply($$0, tu.b::new)
      );

      @Override
      public void a(aub $$0) {
         this.d.ifPresent($$1 -> a($$0, $$1));
      }

      @Override
      public void b(aub $$0) {
         this.e.ifPresent($$1 -> a($$0, $$1));
      }

      private static void a(aub $$0, ame $$1) {
         MinecraftServer $$2 = $$0.q();
         amt $$3 = $$2.aE();
         Optional<ib<ek>> $$4 = $$3.a($$1);
         if ($$4.isPresent()) {
            ek $$5 = $$2.aH().a(2).a().a($$0);
            $$3.a($$4.get(), $$5);
         } else {
            f.error("Test Batch failed for non-existent function {}", $$1);
         }
      }

      @Override
      public MapCodec<tu.b> a() {
         return c;
      }

      public Optional<ame> b() {
         return this.d;
      }

      public Optional<ame> c() {
         return this.e;
      }
   }

   public record c(List<tu.c.a<Boolean, dmq.a>> d, List<tu.c.a<Integer, dmq.d>> e) implements tu {
      public static final MapCodec<tu.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               tu.c.a.a(dmq.a.class, Codec.BOOL).listOf().fieldOf("bool_rules").forGetter(tu.c::b),
               tu.c.a.a(dmq.d.class, Codec.INT).listOf().fieldOf("int_rules").forGetter(tu.c::c)
            )
            .apply($$0, tu.c::new)
      );

      @Override
      public void a(aub $$0) {
         dmq $$1 = $$0.P();
         MinecraftServer $$2 = $$0.q();

         for (tu.c.a<Boolean, dmq.a> $$3 : this.d) {
            $$1.b($$3.a()).a($$3.b(), $$2);
         }

         for (tu.c.a<Integer, dmq.d> $$4 : this.e) {
            $$1.b($$4.a()).a($$4.b(), $$2);
         }
      }

      @Override
      public void b(aub $$0) {
         dmq $$1 = $$0.P();
         MinecraftServer $$2 = $$0.q();

         for (tu.c.a<Boolean, dmq.a> $$3 : this.d) {
            $$1.b($$3.a()).a(dmq.a($$3.a()).a(), $$2);
         }

         for (tu.c.a<Integer, dmq.d> $$4 : this.e) {
            $$1.b($$4.a()).a(dmq.a($$4.a()).a(), $$2);
         }
      }

      @Override
      public MapCodec<tu.c> a() {
         return c;
      }

      public static <S, T extends dmq.g<T>> tu.c.a<S, T> a(dmq.e<T> $$0, S $$1) {
         return new tu.c.a<>($$0, $$1);
      }

      public List<tu.c.a<Boolean, dmq.a>> b() {
         return this.d;
      }

      public List<tu.c.a<Integer, dmq.d>> c() {
         return this.e;
      }

      public record a<S, T extends dmq.g<T>>(dmq.e<T> a, S b) {
         public static <S, T extends dmq.g<T>> Codec<tu.c.a<S, T>> a(Class<T> $$0, Codec<S> $$1) {
            return RecordCodecBuilder.create(
               $$2 -> $$2.group(dmq.a($$0).fieldOf("rule").forGetter(tu.c.a::a), $$1.fieldOf("value").forGetter(tu.c.a::b)).apply($$2, tu.c.a::new)
            );
         }
      }
   }

   public record d(int d) implements tu {
      public static final MapCodec<tu.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.o.fieldOf("time").forGetter(tu.d::b)).apply($$0, tu.d::new));

      @Override
      public void a(aub $$0) {
         $$0.b((long)this.d);
      }

      @Override
      public MapCodec<tu.d> a() {
         return c;
      }

      public int b() {
         return this.d;
      }
   }

   public record e(tu.e.a d) implements tu {
      public static final MapCodec<tu.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tu.e.a.d.fieldOf("weather").forGetter(tu.e::b)).apply($$0, tu.e::new));

      @Override
      public void a(aub $$0) {
         this.d.a($$0);
      }

      @Override
      public void b(aub $$0) {
         $$0.i();
      }

      @Override
      public MapCodec<tu.e> a() {
         return c;
      }

      public tu.e.a b() {
         return this.d;
      }

      public static enum a implements bda {
         a("clear", 100000, 0, false, false),
         b("rain", 0, 100000, true, false),
         c("thunder", 0, 100000, true, true);

         public static final Codec<tu.e.a> d = bda.a(tu.e.a::values);
         private final String e;
         private final int f;
         private final int g;
         private final boolean h;
         private final boolean i;

         private a(final String $$0, final int $$1, final int $$2, final boolean $$3, final boolean $$4) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
         }

         void a(aub $$0) {
            $$0.a(this.f, this.g, this.h, this.i);
         }

         @Override
         public String c() {
            return this.e;
         }
      }
   }
}
