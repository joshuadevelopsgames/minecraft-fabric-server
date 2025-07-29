import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dxj extends dpl {
   public static final MapCodec<dxj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbt.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
         .apply($$0, ($$0x, $$1) -> new dxj((dbt)$$0x.orElse(null), $$1))
   );
   public static final Map<jh, fjm> b = fjj.d(dpz.c(16.0, 0.0, 1.0));
   public static final eez<jh> c = dsd.a;
   public static final ame d = ame.b("contents");
   @Nullable
   private final dbt e;

   @Override
   public MapCodec<dxj> a() {
      return a;
   }

   public dxj(@Nullable dbt $$0, eea.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jh.b));
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecm(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.y, ecm::a);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1 instanceof aub $$5 && $$1.c_($$2) instanceof ecm $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(azj.ar);
         ctj.a($$5, $$3, true);
      }

      return bxj.a;
   }

   private static boolean a(eeb $$0, dmu $$1, jb $$2, ecm $$3) {
      if ($$3.k() != ecm.a.a) {
         return true;
      } else {
         fin $$4 = csb.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      eaz $$4 = $$0.c_($$1);
      if ($$4 instanceof ecm $$5) {
         if (!$$0.C && $$3.gu() && !$$5.c()) {
            dcv $$6 = b(this.b());
            $$6.b($$4.r());
            cqz $$7 = new cqz($$0, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, $$6);
            $$7.i();
            $$0.b($$7);
         } else {
            $$5.f_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      eaz $$2 = $$1.b(fgd.h);
      if ($$2 instanceof ecm $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return $$1.c_($$2) instanceof ecm $$4 && !$$4.v() ? b.get($$0.c(c).g()) : fjj.b();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$1.c_($$2) instanceof ecm $$5 ? fjj.a($$5.a($$0)) : fjj.b();
   }

   @Override
   protected boolean e_(eeb $$0) {
      return false;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
   }

   public static dpz a(@Nullable dbt $$0) {
      if ($$0 == null) {
         return dqb.lv;
      } else {
         return switch ($$0) {
            case a -> dqb.lw;
            case b -> dqb.lx;
            case c -> dqb.ly;
            case d -> dqb.lz;
            case e -> dqb.lA;
            case f -> dqb.lB;
            case g -> dqb.lC;
            case h -> dqb.lD;
            case i -> dqb.lE;
            case j -> dqb.lF;
            case l -> dqb.lH;
            case m -> dqb.lI;
            case n -> dqb.lJ;
            case o -> dqb.lK;
            case p -> dqb.lL;
            case k -> dqb.lG;
         };
      }
   }

   @Nullable
   public dbt b() {
      return this.e;
   }

   public static dcv b(@Nullable dbt $$0) {
      return new dcv(a($$0));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
