import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableFloat;

public record dji(xo e, dji.c f, jp<dji> g, kn h) {
   public static final int a = 255;
   public static final Codec<dji> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            xq.a.fieldOf("description").forGetter(dji::f),
            dji.c.a.forGetter(dji::g),
            ka.a(mn.aW).optionalFieldOf("exclusive_set", jp.a()).forGetter(dji::h),
            djj.b.optionalFieldOf("effects", kn.a).forGetter(dji::i)
         )
         .apply($$0, dji::new)
   );
   public static final Codec<jl<dji>> c = amb.a(mn.aW);
   public static final zm<wx, jl<dji>> d = zk.b(mn.aW);

   public static dji.b a(int $$0) {
      return new dji.b($$0, 0);
   }

   public static dji.b a(int $$0, int $$1) {
      return new dji.b($$0, $$1);
   }

   public static dji.c a(jp<dcr> $$0, jp<dcr> $$1, int $$2, int $$3, dji.b $$4, dji.b $$5, int $$6, bzx... $$7) {
      return new dji.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dji.c a(jp<dcr> $$0, int $$1, int $$2, dji.b $$3, dji.b $$4, int $$5, bzx... $$6) {
      return new dji.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bzw, dcv> a(cam $$0) {
      Map<bzw, dcv> $$1 = Maps.newEnumMap(bzw.class);

      for (bzw $$2 : bzw.j) {
         if (this.a($$2)) {
            dcv $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jp<dcr> a() {
      return this.f.a();
   }

   public boolean a(bzw $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(dcv $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(dcv $$0) {
      return $$0.a(this.f.b);
   }

   public int b() {
      return this.f.c();
   }

   public int c() {
      return this.f.g();
   }

   public int d() {
      return 1;
   }

   public int e() {
      return this.f.d();
   }

   public int b(int $$0) {
      return this.f.e().a($$0);
   }

   public int c(int $$0) {
      return this.f.f().a($$0);
   }

   @Override
   public String toString() {
      return "Enchantment " + this.e.getString();
   }

   public static boolean a(jl<dji> $$0, jl<dji> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xo a(jl<dji> $$0, int $$1) {
      yc $$2 = $$0.a().e.f();
      if ($$0.a(azr.o)) {
         xr.a($$2, yl.a.a(o.m));
      } else {
         xr.a($$2, yl.a.a(o.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xn.w).b(xo.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(dcv $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kp<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aub $$0, int $$1, bzm $$2, byb $$3) {
      fdj $$4 = b($$0, $$1, $$2, $$3);

      for (djf<djx> $$5 : this.a(djj.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aub $$0, int $$1, dcv $$2, bzm $$3, byb $$4, MutableFloat $$5) {
      fdj $$6 = b($$0, $$1, $$3, $$4);

      for (djf<dkb> $$7 : this.a(djj.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.ec(), $$5.floatValue()));
         }
      }
   }

   public void a(aub $$0, int $$1, dcv $$2, MutableFloat $$3) {
      this.a(djj.k, $$0, $$1, $$2, $$3);
   }

   public void b(aub $$0, int $$1, dcv $$2, MutableFloat $$3) {
      this.a(djj.p, $$0, $$1, $$2, $$3);
   }

   public void c(aub $$0, int $$1, dcv $$2, MutableFloat $$3) {
      this.a(djj.q, $$0, $$1, $$2, $$3);
   }

   public void d(aub $$0, int $$1, dcv $$2, MutableFloat $$3) {
      this.a(djj.x, $$0, $$1, $$2, $$3);
   }

   public void a(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aub $$0, int $$1, dcv $$2, MutableFloat $$3) {
      this.a(djj.z, $$0, $$1, $$2, $$3);
   }

   public void b(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bck $$0, int $$1, MutableFloat $$2) {
      this.a(djj.F, $$0, $$1, $$2);
   }

   public void c(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aub $$0, int $$1, dcv $$2, bzm $$3, byb $$4, MutableFloat $$5) {
      this.a(djj.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aub $$0, int $$1, dcv $$2, bzm $$3, byb $$4, MutableFloat $$5) {
      this.a(djj.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aub $$0, int $$1, dcv $$2, bzm $$3, byb $$4, MutableFloat $$5) {
      this.a(djj.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aub $$0, int $$1, dcv $$2, bzm $$3, byb $$4, MutableFloat $$5) {
      this.a(djj.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(aub $$0, int $$1, djh $$2, djm $$3, bzm $$4, byb $$5) {
      for (djr<djz> $$6 : this.a(djj.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(djr<djz> $$0, aub $$1, int $$2, djh $$3, bzm $$4, byb $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bzm $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dv());
         }
      }
   }

   public void e(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aub $$0, int $$1, dcv $$2, bzm $$3, MutableFloat $$4) {
      this.a(djj.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bck $$0, int $$1, MutableFloat $$2) {
      this.a(djj.A, $$0, $$1, $$2);
   }

   public void a(kp<dkb> $$0, bck $$1, int $$2, MutableFloat $$3) {
      dkb $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aub $$0, int $$1, djh $$2, bzm $$3) {
      a(this.a(djj.o), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void b(aub $$0, int $$1, djh $$2, bzm $$3) {
      a(this.a(djj.r), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4, eeb $$5) {
      a(this.a(djj.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kp<List<djf<dkb>>> $$0, aub $$1, int $$2, dcv $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(kp<List<djf<dkb>>> $$0, aub $$1, int $$2, dcv $$3, bzm $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dv()), $$3x -> $$5.setValue($$3x.a($$2, $$4.ec(), $$5.floatValue())));
   }

   private void a(kp<List<djf<dkb>>> $$0, aub $$1, int $$2, dcv $$3, bzm $$4, byb $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.ec(), $$6.floatValue())));
   }

   public static fdj b(aub $$0, int $$1, bzm $$2, byb $$3) {
      fdm $$4 = new fdm.a($$0).a(fgd.a, $$2).a(fgd.k, $$1).a(fgd.f, $$2.dv()).a(fgd.c, $$3).b(fgd.d, $$3.d()).b(fgd.e, $$3.c()).a(fgc.t);
      return new fdj.a($$4).a(Optional.empty());
   }

   private static fdj a(aub $$0, int $$1, dcv $$2) {
      fdm $$3 = new fdm.a($$0).a(fgd.i, $$2).a(fgd.k, $$1).a(fgc.u);
      return new fdj.a($$3).a(Optional.empty());
   }

   private static fdj a(aub $$0, int $$1, bzm $$2, boolean $$3) {
      fdm $$4 = new fdm.a($$0).a(fgd.a, $$2).a(fgd.k, $$1).a(fgd.f, $$2.dv()).a(fgd.l, $$3).a(fgc.v);
      return new fdj.a($$4).a(Optional.empty());
   }

   private static fdj a(aub $$0, int $$1, bzm $$2, fis $$3) {
      fdm $$4 = new fdm.a($$0).a(fgd.a, $$2).a(fgd.k, $$1).a(fgd.f, $$3).a(fgc.w);
      return new fdj.a($$4).a(Optional.empty());
   }

   private static fdj a(aub $$0, int $$1, bzm $$2, fis $$3, eeb $$4) {
      fdm $$5 = new fdm.a($$0).a(fgd.a, $$2).a(fgd.k, $$1).a(fgd.f, $$3).a(fgd.g, $$4).a(fgc.x);
      return new fdj.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<djf<T>> $$0, fdj $$1, Consumer<T> $$2) {
      for (djf<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aub $$0, int $$1, djh $$2, cam $$3) {
      bzw $$4 = $$2.b();
      if ($$4 != null) {
         Map<dji, Set<dka>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dka> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dv(), $$1));
            }
         } else {
            Set<dka> $$7 = $$5.get(this);

            for (djf<dka> $$8 : this.a(djj.n)) {
               dka $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dv(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dv(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, djh $$1, cam $$2) {
      bzw $$3 = $$1.b();
      if ($$3 != null) {
         Set<dka> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dka $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dv(), $$0);
            }
         }
      }
   }

   public static dji.a a(dji.c $$0) {
      return new dji.a($$0);
   }

   public xo f() {
      return this.e;
   }

   public dji.c g() {
      return this.f;
   }

   public jp<dji> h() {
      return this.g;
   }

   public kn i() {
      return this.h;
   }

   public static class a {
      private final dji.c a;
      private jp<dji> b = jp.a();
      private final Map<kp<?>, List<?>> c = new HashMap<>();
      private final kn.a d = kn.a();

      public a(dji.c $$0) {
         this.a = $$0;
      }

      public dji.a a(jp<dji> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dji.a a(kp<List<djf<E>>> $$0, E $$1, fgs.a $$2) {
         this.b($$0).add(new djf<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dji.a a(kp<List<djf<E>>> $$0, E $$1) {
         this.b($$0).add(new djf<>($$1, Optional.empty()));
         return this;
      }

      public <E> dji.a a(kp<List<djr<E>>> $$0, djm $$1, djm $$2, E $$3, fgs.a $$4) {
         this.b($$0).add(new djr<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dji.a a(kp<List<djr<E>>> $$0, djm $$1, djm $$2, E $$3) {
         this.b($$0).add(new djr<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dji.a a(kp<List<djy>> $$0, djy $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dji.a b(kp<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dji.a a(kp<bdk> $$0) {
         this.d.a($$0, bdk.a);
         return this;
      }

      private <E> List<E> b(kp<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dji a(ame $$0) {
         return new dji(xo.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public record b(int b, int c) {
      public static final Codec<dji.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dji.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dji.b::b)).apply($$0, dji.b::new)
      );

      public int a(int $$0) {
         return this.b + this.c * ($$0 - 1);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   public record c(jp<dcr> b, Optional<jp<dcr>> c, int d, int e, dji.b f, dji.b g, int h, List<bzx> i) {
      public static final MapCodec<dji.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ka.a(mn.N).fieldOf("supported_items").forGetter(dji.c::a),
               ka.a(mn.N).optionalFieldOf("primary_items").forGetter(dji.c::b),
               bbi.a(1, 1024).fieldOf("weight").forGetter(dji.c::c),
               bbi.a(1, 255).fieldOf("max_level").forGetter(dji.c::d),
               dji.b.a.fieldOf("min_cost").forGetter(dji.c::e),
               dji.b.a.fieldOf("max_cost").forGetter(dji.c::f),
               bbi.o.fieldOf("anvil_cost").forGetter(dji.c::g),
               bzx.m.listOf().fieldOf("slots").forGetter(dji.c::h)
            )
            .apply($$0, dji.c::new)
      );

      public jp<dcr> a() {
         return this.b;
      }

      public Optional<jp<dcr>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dji.b e() {
         return this.f;
      }

      public dji.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bzx> h() {
         return this.i;
      }
   }
}
