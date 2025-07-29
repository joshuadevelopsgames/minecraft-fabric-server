import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dsr extends dpz {
   public static final MapCodec<dsr> a = b(dsr::new);
   public static final eez<jh> b = dub.f;
   public static final ees c = eer.k;
   private static final fjm d = dpz.b(16.0, 0.0, 13.0);
   private static final fjm e = fjj.a(d, dpz.b(8.0, 13.0, 16.0));
   private static eeg f;

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false));
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.g().g()).b(c, false);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$0.c(c) ? 15 : 0;
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

   public static eeg b() {
      if (f == null) {
         f = eeh.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', eef.a(eek.a))
            .a('^', eef.a(eek.a(dqb.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jh.d))))
            .a('>', eef.a(eek.a(dqb.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jh.e))))
            .a('v', eef.a(eek.a(dqb.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jh.c))))
            .a('<', eef.a(eek.a(dqb.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jh.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
