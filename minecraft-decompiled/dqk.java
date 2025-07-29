import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqk extends dsw {
   public static final MapCodec<dqk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            eeq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.e), t()
         )
         .apply($$0, dqk::new)
   );
   public static final ees b = eer.A;
   private final eeq d;
   private final int e;
   private final Function<eeb, fjm> g;

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   protected dqk(eeq $$0, int $$1, eea.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.C.b().b(f, jh.c).b(b, false).b(c, eem.b));
      this.e = $$1;
      this.g = this.b();
   }

   private Function<eeb, fjm> b() {
      fjm $$0 = dpz.a(14.0);
      fjm $$1 = dpz.a(12.0);
      Map<eem, Map<jh, fjm>> $$2 = fjj.e(dpz.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fjj.a($$2.get($$3.c(c)).get($$3.c(f)), $$3.c(b) ? $$0 : $$1, fiw.e));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$0.c(b)) {
         return bxj.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bxj.a;
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(eeb $$0, dmu $$1, jb $$2, @Nullable cut $$3) {
      $$1.a($$2, $$0.b(b, true), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.e);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ejb.a, $$2);
   }

   protected void a(@Nullable cut $$0, dmv $$1, jb $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aza.e);
   }

   protected ayy a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(eeb $$0, dmu $$1, jb $$2) {
      cvb $$3 = this.d.e() ? $$1.a(cvb.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, $$4), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ejb.a : ejb.e, $$2);
      }

      if ($$4) {
         $$1.a(new jb($$2), this, this.e);
      }
   }

   private void e(eeb $$0, dmu $$1, jb $$2) {
      jh $$3 = n($$0).g();
      fbt $$4 = fbp.a($$1, $$3, $$3.o().d() ? jh.b : $$0.c(f));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, b, c);
   }
}
