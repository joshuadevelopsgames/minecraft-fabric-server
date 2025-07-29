import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dia implements dhb {
   final dib d;
   final dcv e;
   final String f;
   final dgz g;
   final boolean h;
   @Nullable
   private dhl i;

   public dia(String $$0, dgz $$1, dib $$2, dcv $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public dia(String $$0, dgz $$1, dib $$2, dcv $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dhw<? extends dia> a() {
      return dhw.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public dgz c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<dhi>> f() {
      return this.d.c();
   }

   @Override
   public dhl ao_() {
      if (this.i == null) {
         this.i = dhl.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(dha $$0, dmu $$1) {
      return this.d.a($$0);
   }

   public dcv a(dha $$0, jn.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dis> g() {
      return List.of(
         new diw(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<diy>map(dhi::c).orElse(diy.c.c)).toList(), new diy.f(this.e), new diy.d(dcz.fi))
      );
   }

   public static class a implements dhw<dia> {
      public static final MapCodec<dia> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
               dgz.e.fieldOf("category").orElse(dgz.d).forGetter($$0x -> $$0x.g),
               dib.b.forGetter($$0x -> $$0x.d),
               dcv.d.fieldOf("result").forGetter($$0x -> $$0x.e),
               Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dia::new)
      );
      public static final zm<wx, dia> x = zm.a(dia.a::a, dia.a::a);

      @Override
      public MapCodec<dia> a() {
         return w;
      }

      @Override
      public zm<wx, dia> b() {
         return x;
      }

      private static dia a(wx $$0) {
         String $$1 = $$0.p();
         dgz $$2 = $$0.b(dgz.class);
         dib $$3 = dib.c.decode($$0);
         dcv $$4 = dcv.j.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dia($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wx $$0, dia $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         dib.c.encode($$0, $$1.d);
         dcv.j.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
