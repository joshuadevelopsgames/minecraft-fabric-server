import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class eds extends dpl {
   public static final MapCodec<eds> a = b(eds::new);
   public static final eez<jh> b = edu.a;
   public static final eez<efd> c = edu.c;

   @Override
   public MapCodec<eds> a() {
      return a;
   }

   public eds(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, efd.a));
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return null;
   }

   public static eaz a(jb $$0, eeb $$1, eeb $$2, jh $$3, boolean $$4, boolean $$5) {
      return new edw($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.l, edw::a);
   }

   @Override
   public void a(dmv $$0, jb $$1, eeb $$2) {
      jb $$3 = $$1.a($$2.c(b).g());
      eeb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof edt && $$4.c(edt.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bxj.c;
      } else {
         return bxj.e;
      }
   }

   @Override
   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      edw $$2 = this.a($$1.a(), jb.a($$1.a(fgd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      edw $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fjj.a();
   }

   @Nullable
   private edw a(dly $$0, jb $$1) {
      eaz $$2 = $$0.c_($$1);
      return $$2 instanceof edw ? (edw)$$2 : null;
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return dcv.l;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
