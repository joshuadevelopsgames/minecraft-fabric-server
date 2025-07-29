import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class cag extends bzm implements bzf, cbj {
   private static final alh<Float> a = all.a(cag.class, alj.d);
   private static final alh<Float> b = all.a(cag.class, alj.d);
   private static final alh<Boolean> c = all.a(cag.class, alj.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   private static final float i = 1.0F;
   private static final float j = 1.0F;
   private static final boolean k = false;
   @Nullable
   private cag.a l;
   @Nullable
   private cag.a m;

   public cag(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
      this.aq = true;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(a, 1.0F);
      $$0.a(b, 1.0F);
      $$0.a(c, false);
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.a("width", 1.0F));
      this.b($$0.a("height", 1.0F));
      this.l = $$0.<cag.a>a("attack", cag.a.a).orElse(null);
      this.m = $$0.<cag.a>a("interaction", cag.a.a).orElse(null);
      this.a($$0.a("response", false));
      this.a(this.ax());
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("width", this.f());
      $$0.a("height", this.i());
      $$0.b("attack", cag.a.a, this.l);
      $$0.b("interaction", cag.a.a, this.m);
      $$0.a("response", this.l());
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (b.equals($$0) || a.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public boolean bJ() {
      return false;
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public faq k_() {
      return faq.d;
   }

   @Override
   public boolean n_() {
      return true;
   }

   @Override
   public boolean w(bzm $$0) {
      if ($$0 instanceof cut $$1) {
         this.l = new cag.a($$1.cK(), this.ai().ae());
         if ($$1 instanceof auc $$2) {
            aq.h.a($$2, this, $$1.ea().p(), 1.0F, 1.0F, false);
         }

         return !this.l();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      if (this.ai().C) {
         return this.l() ? bxj.a : bxj.c;
      } else {
         this.m = new cag.a($$0.cK(), this.ai().ae());
         return bxj.c;
      }
   }

   @Override
   public void g() {
   }

   @Nullable
   @Override
   public cam ak() {
      return this.l != null ? this.ai().a(this.l.a()) : null;
   }

   @Nullable
   @Override
   public cam e() {
      return this.m != null ? this.ai().a(this.m.a()) : null;
   }

   private void a(float $$0) {
      this.ay.a(a, $$0);
   }

   private float f() {
      return this.ay.a(a);
   }

   private void b(float $$0) {
      this.ay.a(b, $$0);
   }

   private float i() {
      return this.ay.a(b);
   }

   private void a(boolean $$0) {
      this.ay.a(c, $$0);
   }

   private boolean l() {
      return this.ay.a(c);
   }

   private bzp m() {
      return bzp.b(this.f(), this.i());
   }

   @Override
   public bzp a(cay $$0) {
      return this.m();
   }

   @Override
   protected fin c(fis $$0) {
      return this.m().a($$0);
   }

   record a(UUID b, long c) {
      public static final Codec<cag.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.a.fieldOf("player").forGetter(cag.a::a), Codec.LONG.fieldOf("timestamp").forGetter(cag.a::b)).apply($$0, cag.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
