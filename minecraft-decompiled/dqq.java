import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dqq extends dor implements dxl {
   public static final MapCodec<dqq> c = b(dqq::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final efb f = eer.aC;
   public static final ees g = dor.b;
   public static final ees h = eer.I;
   public static final ToIntFunction<eeb> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<fis>> D = ag.a(
      new Int2ObjectOpenHashMap(4),
      $$0 -> {
         float $$1 = 0.0625F;
         $$0.put(1, List.of(new fis(8.0, 8.0, 8.0).c(0.0625)));
         $$0.put(2, List.of(new fis(6.0, 7.0, 8.0).c(0.0625), new fis(10.0, 8.0, 7.0).c(0.0625)));
         $$0.put(3, List.of(new fis(8.0, 5.0, 10.0).c(0.0625), new fis(6.0, 7.0, 8.0).c(0.0625), new fis(9.0, 8.0, 7.0).c(0.0625)));
         $$0.put(
            4, List.of(new fis(7.0, 5.0, 9.0).c(0.0625), new fis(10.0, 7.0, 9.0).c(0.0625), new fis(6.0, 7.0, 6.0).c(0.0625), new fis(9.0, 8.0, 6.0).c(0.0625))
         );
      }
   );
   private static final fjm[] R = new fjm[]{
      dpz.b(2.0, 0.0, 6.0), dpz.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0), dpz.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0), dpz.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   @Override
   public MapCodec<dqq> a() {
      return c;
   }

   public dqq(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, 1).b(g, false).b(h, false));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$0.f() && $$4.gt().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bxj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      return !$$1.h() && $$1.n().h() == this.h() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         fal $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == fam.c;
         return super.a($$0).b(h, $$3);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(h) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return R[$$0.c(f) - 1];
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      if (!$$2.c(h) && $$3.a() == fam.c) {
         eeb $$4 = $$2.b(h, true);
         if ($$2.c(g)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean h(eeb $$0) {
      return $$0.a(azo.T, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<fis> b(eeb $$0) {
      return (Iterable<fis>)D.get($$0.c(f));
   }

   @Override
   protected boolean d(eeb $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return dpz.a($$1, $$2.e(), jh.b);
   }
}
