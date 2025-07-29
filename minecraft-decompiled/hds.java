import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public abstract class hds<T extends bzj, S, ST extends hkh> extends hed<T, ST> {
   private final hec a;

   protected hds(hee.a $$0) {
      super($$0);
      this.a = $$0.a();
   }

   protected fin a(T $$0) {
      return $$0.e();
   }

   protected boolean b(T $$0) {
      return $$0.f();
   }

   private static int c(bzj $$0) {
      bzj.j $$1 = $$0.i();
      return $$1 != null ? $$1.c() : -1;
   }

   protected int a(T $$0, jb $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gxj.b($$2) : super.b($$0, $$1);
   }

   protected int b(T $$0, jb $$1) {
      int $$2 = c($$0);
      return $$2 != -1 ? gxj.a($$2) : super.a($$0, $$1);
   }

   protected float a(ST $$0) {
      bzj.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.d().get($$0.c);
   }

   protected float b(ST $$0) {
      bzj.j $$1 = $$0.b;
      return $$1 == null ? 0.0F : $$1.e().get($$0.c);
   }

   public void a(ST $$0, fod $$1, gxn $$2, int $$3) {
      bzj.j $$4 = $$0.b;
      if ($$4 != null && $$0.a()) {
         float $$5 = $$0.c;
         super.a($$0, $$1, $$2, $$3);
         $$1.a();
         $$1.a(this.a($$4, $$0, new Quaternionf()));
         k $$6 = $$4.a().get($$5);
         $$1.a($$6.c());
         this.a($$0, $$1, $$2, $$3, $$5);
         $$1.b();
      }
   }

   private Quaternionf a(bzj.j $$0, ST $$1, Quaternionf $$2) {
      ftm $$3 = this.a.b;

      return switch ($$0.b()) {
         case a -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case c -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * $$1.d, (float) (Math.PI / 180.0) * b($$3), 0.0F);
         case b -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * $$1.e, 0.0F);
         case d -> $$2.rotationYXZ((float) (-Math.PI / 180.0) * a($$3), (float) (Math.PI / 180.0) * b($$3), 0.0F);
      };
   }

   private static float a(ftm $$0) {
      return $$0.g() - 180.0F;
   }

   private static float b(ftm $$0) {
      return -$$0.f();
   }

   private static <T extends bzj> float a(T $$0, float $$1) {
      return $$0.l($$1);
   }

   private static <T extends bzj> float b(T $$0, float $$1) {
      return $$0.k($$1);
   }

   protected abstract void a(ST var1, fod var2, gxn var3, int var4, float var5);

   public void a(T $$0, ST $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.i();
      $$1.c = $$0.a($$2);
      $$1.d = a($$0, $$2);
      $$1.e = b($$0, $$2);
   }

   public static class a extends hds<bzj.b, bzj.b.a, hjx> {
      private final gys a;

      protected a(hee.a $$0) {
         super($$0);
         this.a = $$0.d();
      }

      public hjx a() {
         return new hjx();
      }

      public void a(bzj.b $$0, hjx $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.l();
      }

      public void a(hjx $$0, fod $$1, gxn $$2, int $$3, float $$4) {
         this.a.a($$0.a.a(), $$1, $$2, $$3, hri.d);
      }
   }

   public static class b extends hds<bzj.g, bzj.g.a, hlm> {
      private final hof a;

      protected b(hee.a $$0) {
         super($$0);
         this.a = $$0.b();
      }

      public hlm a() {
         return new hlm();
      }

      public void a(bzj.g $$0, hlm $$1, float $$2) {
         super.a($$0, $$1, $$2);
         bzj.g.a $$3 = $$0.l();
         if ($$3 != null) {
            this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
         } else {
            $$1.a.b();
         }
      }

      public void a(hlm $$0, fod $$1, gxn $$2, int $$3, float $$4) {
         if (!$$0.a.e()) {
            $$1.a(a.d.rotation((float) Math.PI));
            $$0.a.a($$1, $$2, $$3, hri.d);
         }
      }
   }

   public static class c extends hds<bzj.k, bzj.k.e, hms> {
      private final fwz a;

      protected c(hee.a $$0) {
         super($$0);
         this.a = $$0.j();
      }

      public hms a() {
         return new hms();
      }

      public void a(bzj.k $$0, hms $$1, float $$2) {
         super.a($$0, $$1, $$2);
         $$1.a = $$0.l();
         $$1.f = $$0.a(this::a);
      }

      private bzj.k.b a(xo $$0, int $$1) {
         List<bbm> $$2 = this.a.c($$0, $$1);
         List<bzj.k.c> $$3 = new ArrayList<>($$2.size());
         int $$4 = 0;

         for (bbm $$5 : $$2) {
            int $$6 = this.a.a($$5);
            $$4 = Math.max($$4, $$6);
            $$3.add(new bzj.k.c($$5, $$6));
         }

         return new bzj.k.b($$3, $$4);
      }

      public void a(hms $$0, fod $$1, gxn $$2, int $$3, float $$4) {
         bzj.k.e $$5 = $$0.a;
         byte $$6 = $$5.e();
         boolean $$7 = ($$6 & 2) != 0;
         boolean $$8 = ($$6 & 4) != 0;
         boolean $$9 = ($$6 & 1) != 0;
         bzj.k.a $$10 = bzj.k.a($$6);
         byte $$11 = (byte)$$5.c().get($$4);
         int $$13;
         if ($$8) {
            float $$12 = fue.R().n.a(0.25F);
            $$13 = (int)($$12 * 255.0F) << 24;
         } else {
            $$13 = $$5.d().get($$4);
         }

         float $$15 = 0.0F;
         Matrix4f $$16 = $$1.c().a();
         $$16.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
         $$16.scale(-0.025F, -0.025F, -0.025F);
         bzj.k.b $$17 = $$0.f;
         int $$18 = 1;
         int $$19 = 9 + 1;
         int $$20 = $$17.b();
         int $$21 = $$17.a().size() * $$19 - 1;
         $$16.translate(1.0F - $$20 / 2.0F, -$$21, 0.0F);
         if ($$13 != 0) {
            fog $$22 = $$2.getBuffer($$7 ? gxz.o() : gxz.n());
            $$22.a($$16, -1.0F, -1.0F, 0.0F).a($$13).c($$3);
            $$22.a($$16, -1.0F, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, (float)$$21, 0.0F).a($$13).c($$3);
            $$22.a($$16, (float)$$20, -1.0F, 0.0F).a($$13).c($$3);
         }

         for (bzj.k.c $$23 : $$17.a()) {
            float $$24 = switch ($$10) {
               case b -> 0.0F;
               case c -> $$20 - $$23.b();
               case a -> $$20 / 2.0F - $$23.b() / 2.0F;
            };
            this.a.a($$23.a(), $$24, $$15, $$11 << 24 | 16777215, $$9, $$16, $$2, $$7 ? fwz.a.b : fwz.a.c, 0, $$3);
            $$15 += $$19;
         }
      }
   }
}
