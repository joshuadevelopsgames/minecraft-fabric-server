import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtb extends dub {
   public static final MapCodec<dtb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dtb::new)
   );
   public static final ees b = eer.y;
   public static final ees c = eer.A;
   public static final ees d = eer.t;
   private static final Map<jh.a, fjm> e = fjj.a(dpz.a(16.0, 16.0, 4.0));
   private static final Map<jh.a, fjm> g = Maps.newEnumMap(ag.a(e, (Function<? super fjm, fjm>)($$0 -> fjj.a($$0, dpz.b(16.0, 13.0, 16.0), fiw.e))));
   private static final Map<jh.a, fjm> h = fjj.a(dpz.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jh.a, fjm> i = fjj.a(dpz.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jh.a, fjm> D = fjj.a(fjj.a(dpz.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dpz.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jh.a, fjm> R = Maps.newEnumMap(ag.a(D, (Function<? super fjm, fjm>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final efp S;

   @Override
   public MapCodec<dtb> a() {
      return a;
   }

   public dtb(efp $$0, eea.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, false).b(c, false).b(d, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      jh.a $$4 = $$0.c(f).o();
      return ($$0.c(d) ? g : e).get($$4);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      jh.a $$8 = $$4.o();
      if ($$0.c(f).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, $$9);
      }
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      jh.a $$3 = $$0.c(f).o();
      return $$0.c(b) ? fjj.a() : i.get($$3);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      jh.a $$4 = $$0.c(f).o();
      return $$0.c(b) ? fjj.a() : h.get($$4);
   }

   @Override
   protected fjm d_(eeb $$0) {
      jh.a $$1 = $$0.c(f).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public eeb a(dgo $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      boolean $$3 = $$1.E($$2);
      jh $$4 = $$0.g();
      jh.a $$5 = $$4.o();
      boolean $$6 = $$5 == jh.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jh.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(f, $$4).b(b, $$3).b(c, $$3).b(d, $$6);
   }

   private boolean o(eeb $$0) {
      return $$0.a(azo.H);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, false);
         $$1.a($$2, $$0, 10);
      } else {
         jh $$5 = $$3.cS();
         if ($$0.c(f) == $$5.g()) {
            $$0 = $$0.b(f, $$5);
         }

         $$0 = $$0.b(b, true);
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), aza.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ejb.h : ejb.d, $$2);
      return bxj.a;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.c($$2, $$0.b(b, !$$5));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), aza.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ejb.d : ejb.h, $$2, ejb.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.E($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, $$6).b(b, $$6), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), aza.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ejb.h : ejb.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, b, c, d);
   }

   public static boolean a(eeb $$0, jh $$1) {
      return $$0.c(f).o() == $$1.h().o();
   }
}
