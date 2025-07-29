import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import org.joml.Vector3f;

public class hal implements hac<ebr> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gqn h;
   private final gqn i;
   private final gqn j;
   private final gqn k;
   private final gqn l;
   private final gqn m;
   private final gqn n;
   private static final float o = 0.125F;

   public hal(had.a $$0) {
      this($$0.f());
   }

   public hal(gqj $$0) {
      gqn $$1 = $$0.a(gqm.av);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gqn $$2 = $$0.a(gqm.aw);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gqt c() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqr $$2 = new gqr(0.2F);
      gqr $$3 = new gqr(-0.1F);
      $$1.a(
         "neck",
         gqs.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gqp.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gqs $$4 = gqs.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gqp.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gqp.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gqt.a($$0, 32, 32);
   }

   public static gqt d() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqs $$2 = gqs.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jh.c));
      $$1.a("back", $$2, gqp.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gqp.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gqp.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gqp.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gqt.a($$0, 16, 16);
   }

   private static hua a(Optional<dcr> $$0) {
      if ($$0.isPresent()) {
         hua $$1 = gyi.a(ebt.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gyi.A;
   }

   public void a(ebr $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      $$2.a();
      jh $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      ebr.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / $$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == ebr.a.a) {
               float $$10 = 0.015625F;
               float $$11 = $$9 * (float) (Math.PI * 2);
               float $$12 = -1.5F * (bcb.b($$11) + 0.5F) * bcb.a($$11 / 2.0F);
               $$2.a(a.b.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$13 = bcb.a($$11);
               $$2.a(a.f.rotation($$13 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$14 = bcb.a(-$$9 * 3.0F * (float) Math.PI) * 0.125F;
               float $$15 = 1.0F - $$9;
               $$2.a(a.d.rotation($$14 * $$15), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.u());
      $$2.b();
   }

   public void a(fod $$0, gxn $$1, int $$2, int $$3, ech $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fod $$0, gxn $$1, int $$2, int $$3, ech $$4) {
      fog $$5 = gyi.z.a($$1, gxz::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gqn $$0, fod $$1, gxn $$2, int $$3, int $$4, hua $$5) {
      $$0.a($$1, $$5.a($$2, gxz::d), $$3, $$4);
   }

   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      this.h.a($$1, $$0);
      this.m.a($$1, $$0);
      this.n.a($$1, $$0);
   }
}
