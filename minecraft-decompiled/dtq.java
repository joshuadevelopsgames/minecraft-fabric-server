import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dtq extends dsw {
   public static final MapCodec<dtq> a = b(dtq::new);
   private static final xo b = xo.c("container.grindstone_title");
   private final Function<eeb, fjm> d;

   @Override
   public MapCodec<dtq> a() {
      return a;
   }

   protected dtq(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(c, eem.b));
      this.d = this.b();
   }

   private Function<eeb, fjm> b() {
      fjm $$0 = fjj.a(dpz.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dpz.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fjm $$1 = fjj.a($$0, h.z);
      fjm $$2 = fjj.a(dpz.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<eem, Map<jh, fjm>> $$3 = fjj.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(f)));
   }

   private fjm o(eeb $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.o($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return true;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.aE);
      }

      return bxj.a;
   }

   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new czm($$2x, $$3, cyz.a($$1, $$2)), b);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, c);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
