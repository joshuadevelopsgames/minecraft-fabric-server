import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dfa(float d, dcx e, jl<ayy> f, boolean g, List<dgj> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dfa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.q.optionalFieldOf("consume_seconds", 1.6F).forGetter(dfa::c),
            dcx.l.optionalFieldOf("animation", dcx.b).forGetter(dfa::d),
            ayy.b.optionalFieldOf("sound", ayz.kQ).forGetter(dfa::e),
            Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dfa::f),
            dgj.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dfa::g)
         )
         .apply($$0, dfa::new)
   );
   public static final zm<wx, dfa> c = zm.a(zk.l, dfa::c, dcx.m, dfa::d, ayy.d, dfa::e, zk.b, dfa::f, dgj.e.a(zk.a()), dfa::g, dfa::new);

   public bxj a(cam $$0, dcv $$1, bxi $$2) {
      if (!this.a($$0, $$1)) {
         return bxj.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bxj.c;
         } else {
            dcv $$4 = this.a($$0.ai(), $$0, $$1);
            return bxj.c.a($$4);
         }
      }
   }

   public dcv a(dmu $$0, cam $$1, dcv $$2) {
      bck $$3 = $$1.ec();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof auc $$4) {
         $$4.b(azj.c.b($$2.h()));
         aq.A.a($$4, $$2);
      }

      $$2.a(dfb.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.c(this.e == dcx.c ? ejb.l : ejb.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(cam $$0, dcv $$1) {
      cyj $$2 = $$1.a(kq.v);
      return $$2 != null && $$0 instanceof cut $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bck $$0, cam $$1, dcv $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = bcb.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == dcx.c ? 0.5F : $$4;
      float $$9 = this.e == dcx.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      ayy $$11 = $$1 instanceof dfa.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)(this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dfa.a b() {
      return new dfa.a();
   }

   public float c() {
      return this.d;
   }

   public dcx d() {
      return this.e;
   }

   public jl<ayy> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dgj> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private dcx b;
      private jl<ayy> c;
      private boolean d;
      private final List<dgj> e;

      a() {
         this.b = dcx.b;
         this.c = ayz.kQ;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dfa.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dfa.a a(dcx $$0) {
         this.b = $$0;
         return this;
      }

      public dfa.a a(jl<ayy> $$0) {
         this.c = $$0;
         return this;
      }

      public dfa.a b(jl<ayy> $$0) {
         return this.a(new dgk($$0));
      }

      public dfa.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dfa.a a(dgj $$0) {
         this.e.add($$0);
         return this;
      }

      public dfa a() {
         return new dfa(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      ayy j(dcv var1);
   }
}
