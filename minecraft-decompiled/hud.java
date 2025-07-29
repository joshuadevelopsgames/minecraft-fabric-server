import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hud {
   public static final hua a = new hua(hrr.c, ame.b("block/fire_0"));
   public static final hua b = new hua(hrr.c, ame.b("block/fire_1"));
   public static final hua c = new hua(hrr.c, ame.b("block/lava_flow"));
   public static final hua d = new hua(hrr.c, ame.b("block/water_flow"));
   public static final hua e = new hua(hrr.c, ame.b("block/water_overlay"));
   public static final hua f = new hua(gyi.c, ame.b("entity/banner_base"));
   public static final hua g = new hua(gyi.d, ame.b("entity/shield_base"));
   public static final hua h = new hua(gyi.d, ame.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ame> j = IntStream.range(0, 10).mapToObj($$0 -> ame.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ame> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gxz> l = k.stream().map(gxz::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gqj n;
   private final Map<eeb, gzc.c> o;
   private final Map<ame, hoa> p;
   final Map<ame, hul> q;
   final hul r;

   public hud(gqj $$0, Map<eeb, gzc.c> $$1, Map<ame, hoa> $$2, Map<ame, hul> $$3, hul $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hud.a> a(hum $$0, Executor $$1) {
      hud.b $$2 = hud.b.a(this.r, $$0);
      hud.c $$3 = new hud.c($$0);
      CompletableFuture<Map<eeb, gzc>> $$4 = bwa.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$1x, $$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<ame, hoe>> $$5 = bwa.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hoe.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<ame, hoa.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hoa.a $$3x = $$2x.b();
         if (!$$3x.equals(hoa.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hud.a($$2, $$2x, $$3x, $$6));
   }

   public record a(hud.b a, Map<eeb, gzc> b, Map<ame, hoe> c, Map<ame, hoa.a> d) {
   }

   public record b(gzc a, hoe b) {

      public static hud.b a(hul $$0, final hum $$1) {
         huc $$2 = new huc() {
            @Override
            public hul a(ame $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public <T> T a(huc.a<T> $$0) {
               return $$0.compute(this);
            }

            @Override
            public hum a() {
               return $$1;
            }
         };
         gzk $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gzg $$6 = $$0.e();
         huj $$7 = $$0.a($$3, $$2, htu.a);
         hrs $$8 = $$0.a($$3, $$2);
         gzc $$9 = new gzj(new gzh($$7, $$4, $$8));
         hoe $$10 = new hoi($$7.a(), new hoj($$5, $$8, $$6));
         return new hud.b($$9, $$10);
      }
   }

   class c implements huc {
      private final hum b;
      private final Map<huc.a<Object>, Object> c = new ConcurrentHashMap<>();
      private final Function<huc.a<Object>, Object> d = $$0x -> $$0x.compute(this);

      c(final hum $$0) {
         this.b = $$0;
      }

      @Override
      public hum a() {
         return this.b;
      }

      @Override
      public hul a(ame $$0) {
         hul $$1 = hud.this.q.get($$0);
         if ($$1 == null) {
            hud.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hud.this.r;
         } else {
            return $$1;
         }
      }

      @Override
      public <T> T a(huc.a<T> $$0) {
         return (T)this.c.computeIfAbsent($$0, this.d);
      }
   }
}
