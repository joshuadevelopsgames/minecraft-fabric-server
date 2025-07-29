import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends dpl {
   public static final MapCodec<dui> a = b(dui::new);
   public static final ees b = eer.q;

   @Override
   public MapCodec<dui> a() {
      return a;
   }

   protected dui(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false));
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfd $$5 = $$4.a(kq.aa, dfd.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, true), 2);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof ece $$5) {
         $$5.u();
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$1.c(b)) {
         return bxj.f;
      } else {
         dcv $$7 = $$4.b($$5);
         bxj $$8 = dda.a($$2, $$3, $$7, $$4);
         return (bxj)(!$$8.a() ? bxj.f : $$8);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ece($$0, $$1);
   }

   @Override
   public boolean f_(eeb $$0) {
      return true;
   }

   @Override
   public int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$1.c_($$2) instanceof ece $$4 && $$4.j().a() ? 15 : 0;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$1.c_($$2) instanceof ece $$3 ? $$3.w() : 0;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$1.c(b) ? a($$2, ebb.e, ece::a) : null;
   }
}
