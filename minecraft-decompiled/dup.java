import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dup extends dzl implements dxh {
   public static final MapCodec<dup> a = b(dup::new);
   public static final eez<jh> b = eer.T;
   private final Function<eeb, fjm> c;

   public dup(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(this.c(), 1));
      this.c = this.q();
   }

   private Function<eeb, fjm> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dup> a() {
      return a;
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(eeb $$0, dgo $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jh.b);
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.c.apply($$0);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, this.c());
   }
}
