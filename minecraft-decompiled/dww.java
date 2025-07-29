import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dww extends dzl implements dqc {
   public static final MapCodec<dww> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edp.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dww::new)
   );
   public static final efb f = eer.aX;
   private static final fjm a = dpz.b(12.0, 0.0, 12.0);
   protected final edp g;

   @Override
   public MapCodec<? extends dww> a() {
      return e;
   }

   protected dww(edp $$0, eea.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.C($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aub $$0, jb $$1, eeb $$2, bck $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.n().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return true;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return $$0.A.i() < 0.45;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f);
   }
}
