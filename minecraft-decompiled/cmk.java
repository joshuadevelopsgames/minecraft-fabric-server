import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cmk(cwu<cmk.a> e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<cmk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwu.a(cmk.a.c, cmk.a.a).forGetter(cmk::b), cxa.b.fieldOf("spawn_conditions").forGetter(cmk::c)).apply($$0, cmk::new)
   );
   public static final Codec<cmk> b = RecordCodecBuilder.create($$0 -> $$0.group(cwu.a(cmk.a.c, cmk.a.a).forGetter(cmk::b)).apply($$0, cmk::new));
   public static final Codec<jl<cmk>> c = amb.a(mn.aN);
   public static final zm<wx, jl<cmk>> d = zk.b(mn.aN);

   private cmk(cwu<cmk.a> $$0) {
      this($$0, cxa.a);
   }

   @Override
   public List<cww.a<cwz, cwx>> a() {
      return this.f.a();
   }

   public cwu<cmk.a> b() {
      return this.e;
   }

   public cxa c() {
      return this.f;
   }

   public static enum a implements bda {
      a("normal"),
      b("cold");

      public static final Codec<cmk.a> c = bda.a(cmk.a::values);
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
