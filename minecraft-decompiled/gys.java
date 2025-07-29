import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class gys implements axp {
   private final gyr a;
   private final gyu b;
   private final Supplier<gyk> c;
   private final gyt d;
   private final bck e = bck.a();
   private final List<gzb> f = new ArrayList<>();
   private final fvi g;

   public gys(gyr $$0, Supplier<gyk> $$1, fvi $$2) {
      this.a = $$0;
      this.c = $$1;
      this.g = $$2;
      this.b = new gyu(this.g);
      this.d = new gyt();
   }

   public gyr a() {
      return this.a;
   }

   public void a(eeb $$0, jb $$1, dlv $$2, fod $$3, fog $$4) {
      if ($$0.o() == dwn.b) {
         gzc $$5 = this.a.b($$0);
         this.e.b($$0.b($$1));
         this.f.clear();
         $$5.a(this.e, this.f);
         this.b.a($$2, this.f, $$0, $$1, $$3, $$4, true, hri.d);
      }
   }

   public void a(eeb $$0, jb $$1, dlv $$2, fod $$3, fog $$4, boolean $$5, List<gzb> $$6) {
      try {
         this.b.a($$2, $$6, $$0, $$1, $$3, $$4, $$5, hri.d);
      } catch (Throwable var11) {
         p $$8 = p.a(var11, "Tesselating block in world");
         q $$9 = $$8.a("Block being tesselated");
         q.a($$9, $$2, $$1, $$0);
         throw new aa($$8);
      }
   }

   public void a(jb $$0, dlv $$1, fog $$2, eeb $$3, fal $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         p $$6 = p.a(var9, "Tesselating liquid in world");
         q $$7 = $$6.a("Block being tesselated");
         q.a($$7, $$1, $$0, $$3);
         throw new aa($$6);
      }
   }

   public gyu b() {
      return this.b;
   }

   public gzc a(eeb $$0) {
      return this.a.b($$0);
   }

   public void a(eeb $$0, fod $$1, gxn $$2, int $$3, int $$4) {
      dwn $$5 = $$0.o();
      if ($$5 != dwn.a) {
         gzc $$6 = this.a($$0);
         int $$7 = this.g.a($$0, null, null, 0);
         float $$8 = ($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = ($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = ($$7 & 0xFF) / 255.0F;
         gyu.a($$1.c(), $$2.getBuffer(gxe.c($$0)), $$6, $$8, $$9, $$10, $$3, $$4);
         this.c.get().a($$0.b(), dct.a, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(axo $$0) {
      this.d.a();
   }
}
