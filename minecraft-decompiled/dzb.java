import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dzb extends dub implements dxl {
   public static final MapCodec<dzb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dzb::new)
   );
   public static final ees b = eer.y;
   public static final eez<efa> c = eer.ai;
   public static final ees d = eer.A;
   public static final ees e = eer.I;
   private static final Map<jh, fjm> g = fjj.d(dpz.c(16.0, 13.0, 16.0));
   private final eeq h;

   @Override
   public MapCodec<? extends dzb> a() {
      return a;
   }

   protected dzb(eeq $$0, eea.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(f, jh.c).b(b, false).b(c, efa.b).b(d, false).b(e, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g.get($$0.c(b) ? $$0.c(f) : ($$0.c(c) == efa.a ? jh.a : jh.b));
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!this.h.c()) {
         return bxj.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bxj.a;
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(eeb $$0, dmu $$1, jb $$2, @Nullable cut $$3) {
      eeb $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, fam.c, fam.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cut $$0, dmu $$1, jb $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), aza.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ejb.h : ejb.d, $$2);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.E($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, $$6);
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, $$6), 2);
            if ($$0.c(e)) {
               $$1.a($$2, fam.c, fam.c.a($$1));
            }
         }
      }
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      fal $$2 = $$0.q().b_($$0.a());
      jh $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(f, $$3).b(c, $$0.l().e - $$0.a().v() > 0.5 ? efa.a : efa.b);
      } else {
         $$1 = $$1.b(f, $$0.g().g()).b(c, $$3 == jh.b ? efa.b : efa.a);
      }

      if ($$0.q().E($$0.a())) {
         $$1 = $$1.b(b, true).b(d, true);
      }

      return $$1.b(e, $$2.a() == fam.c);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, b, c, d, e);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected eeq q() {
      return this.h;
   }
}
