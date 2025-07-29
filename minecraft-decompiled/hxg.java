import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hxg {
   static final Map<String, hxg> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hxg> a = Codec.STRING.comapFlatMap($$0 -> {
      hxg $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hxg::a);
   private static final List<hxi<?>> i = List.of(hxi.a, hxi.b, hxi.c, hxi.d, hxi.e, hxi.f, hxi.g, hxi.h, hxi.m, hxi.l);
   private static final List<hxi<?>> j = Stream.concat(i.stream(), Stream.of(hxi.i, hxi.j, hxi.k)).toList();
   public static final hxg b = a("world_loaded", "WorldLoaded").a(j).a(hxi.n).a(hxi.o).b();
   public static final hxg c = a("performance_metrics", "PerformanceMetrics").a(j).a(hxi.r).a(hxi.s).a(hxi.t).a(hxi.u).a(hxi.v).a(hxi.w).a().b();
   public static final hxg d = a("world_load_times", "WorldLoadTimes").a(j).a(hxi.x).a(hxi.y).a().b();
   public static final hxg e = a("world_unloaded", "WorldUnloaded").a(j).a(hxi.p).a(hxi.q).b();
   public static final hxg f = a("advancement_made", "AdvancementMade").a(j).a(hxi.D).a(hxi.E).a().b();
   public static final hxg g = a("game_load_times", "GameLoadTimes").a(i).a(hxi.z).a(hxi.A).a(hxi.B).a(hxi.C).a().b();
   private final String k;
   private final String l;
   private final List<hxi<?>> m;
   private final boolean n;
   private final MapCodec<hxc> o;

   hxg(String $$0, String $$1, List<hxi<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hxj.a($$2).xmap($$0x -> new hxc(this, $$0x), hxc::b);
   }

   public static hxg.a a(String $$0, String $$1) {
      return new hxg.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hxi<?>> b() {
      return this.m;
   }

   public MapCodec<hxc> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hxj $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hxi<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hxi<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yc e() {
      return this.a("title");
   }

   public yc f() {
      return this.a("description");
   }

   private yc a(String $$0) {
      return xo.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hxg> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hxi<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hxg.a a(List<hxi<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hxg.a a(hxi<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hxg.a a() {
         this.d = true;
         return this;
      }

      public hxg b() {
         hxg $$0 = new hxg(this.a, this.b, List.copyOf(this.c), this.d);
         if (hxg.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
