import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byo implements cya {
   public static final Codec<jl<byo>> a = mm.d.r();
   public static final zm<wx, jl<byo>> b = zk.b(mn.Z);
   private static final int c = bcb.d(38.25F);
   private final Map<jl<cbn>, byo.a> d = new Object2ObjectOpenHashMap();
   private final byp e;
   private final int f;
   private final Function<byq, mc> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<ayy> l = Optional.empty();
   private cyd m = cyf.g;

   protected byo(byp $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lx.a(me.u, baj.c($$2, $$1));
      };
   }

   protected byo(byp $$0, int $$1, mc $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public int c() {
      return this.j;
   }

   public int d() {
      return this.k;
   }

   public boolean a(aub $$0, cam $$1, int $$2) {
      return true;
   }

   public void a(aub $$0, @Nullable bzm $$1, @Nullable bzm $$2, cam $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(cam $$0, int $$1) {
   }

   public void b(cam $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.ai().a(null, $$0.dC(), $$0.dE(), $$0.dI(), $$1x, $$0.do(), 1.0F, 1.0F));
   }

   public void a(aub $$0, cam $$1, int $$2, bzm.e $$3) {
   }

   public void a(aub $$0, cam $$1, int $$2, byb $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = ag.a("effect", mm.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public xo g() {
      return xo.c(this.f());
   }

   public byp h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public byo a(jl<cbn> $$0, ame $$1, double $$2, cbq.a $$3) {
      this.d.put($$0, new byo.a($$1, $$2, $$3));
      return this;
   }

   public byo a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public byo a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jl<cbn>, cbq> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jl<cbn>)$$2, $$3.a($$0)));
   }

   public void a(cbp $$0) {
      for (Entry<jl<cbn>, byo.a> $$1 : this.d.entrySet()) {
         cbo $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(cbp $$0, int $$1) {
      for (Entry<jl<cbn>, byo.a> $$2 : this.d.entrySet()) {
         cbo $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == byp.a;
   }

   public mc a(byq $$0) {
      return this.g.apply($$0);
   }

   public byo a(ayy $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public byo a(cyb... $$0) {
      this.m = cyf.e.a($$0);
      return this;
   }

   @Override
   public cyd k() {
      return this.m;
   }

   record a(ame a, double b, cbq.a c) {
      public cbq a(int $$0) {
         return new cbq(this.a, this.b * ($$0 + 1), this.c);
      }
   }
}
