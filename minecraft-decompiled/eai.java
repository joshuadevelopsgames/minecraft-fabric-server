import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eai extends dtg {
   public static final MapCodec<eai> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dtg::c), t()).apply($$0, eai::new));

   @Override
   public MapCodec<eai> a() {
      return a;
   }

   public eai(jl<byo> $$0, float $$1, eea.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public eai(dfx $$0, eea.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dqb.em) || $$0.a(dqb.en) || $$0.a(dqb.eo);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      fjm $$4 = this.a($$0, $$1, $$2, fix.a());
      fis $$5 = $$4.a().f();
      double $$6 = $$2.u() + $$5.d;
      double $$7 = $$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(me.ah, $$6 + $$3.j() / 5.0, $$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$1 instanceof aub $$5 && $$1.an() != bxg.a && $$3 instanceof cam $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public byq b() {
      return new byq(bys.t, 40);
   }
}
