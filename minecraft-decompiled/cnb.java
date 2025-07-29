import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cnb(cwu<cnb.a> e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<cnb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwu.a(cnb.a.c, cnb.a.a).forGetter(cnb::b), cxa.b.fieldOf("spawn_conditions").forGetter(cnb::c)).apply($$0, cnb::new)
   );
   public static final Codec<cnb> b = RecordCodecBuilder.create($$0 -> $$0.group(cwu.a(cnb.a.c, cnb.a.a).forGetter(cnb::b)).apply($$0, cnb::new));
   public static final Codec<jl<cnb>> c = amb.a(mn.bf);
   public static final zm<wx, jl<cnb>> d = zk.b(mn.bf);

   private cnb(cwu<cnb.a> $$0) {
      this($$0, cxa.a);
   }

   @Override
   public List<cww.a<cwz, cwx>> a() {
      return this.f.a();
   }

   public cwu<cnb.a> b() {
      return this.e;
   }

   public cxa c() {
      return this.f;
   }

   public static enum a implements bda {
      a("normal"),
      b("cold");

      public static final Codec<cnb.a> c = bda.a(cnb.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
