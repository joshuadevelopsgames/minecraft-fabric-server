import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ffc extends few {
   public static final MapCodec<ffc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(ffc.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c)))
         .apply($$0, ffc::new)
   );
   private final List<ffc.b> b;
   private final boolean c;

   ffc(List<fgs> $$0, List<ffc.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fey<ffc> b() {
      return fez.o;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if (this.c) {
         $$0.b(kq.o, this.a($$1, dfm.a));
      } else {
         $$0.a(kq.o, dfm.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dfm a(fdj $$0, dfm $$1) {
      bck $$2 = $$0.b();

      for (ffc.b $$3 : this.b) {
         bzx $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new cbq($$3.b, $$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static ffc.c a(ame $$0, jl<cbn> $$1, cbq.a $$2, fho $$3) {
      return new ffc.c($$0, $$1, $$2, $$3);
   }

   public static ffc.a c() {
      return new ffc.a();
   }

   public static class a extends few.a<ffc.a> {
      private final boolean a;
      private final List<ffc.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected ffc.a a() {
         return this;
      }

      public ffc.a a(ffc.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fex b() {
         return new ffc(this.g(), this.b, this.a);
      }
   }

   record b(ame b, jl<cbn> c, cbq.a d, fho e, List<bzx> f) {
      private static final Codec<List<bzx>> g = bbi.b(bbi.a(bzx.m));
      public static final Codec<ffc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ame.a.fieldOf("id").forGetter(ffc.b::a),
               cbn.a.fieldOf("attribute").forGetter(ffc.b::b),
               cbq.a.f.fieldOf("operation").forGetter(ffc.b::c),
               fhp.a.fieldOf("amount").forGetter(ffc.b::d),
               g.fieldOf("slot").forGetter(ffc.b::e)
            )
            .apply($$0, ffc.b::new)
      );

      public ame a() {
         return this.b;
      }

      public jl<cbn> b() {
         return this.c;
      }

      public cbq.a c() {
         return this.d;
      }

      public fho d() {
         return this.e;
      }

      public List<bzx> e() {
         return this.f;
      }
   }

   public static class c {
      private final ame a;
      private final jl<cbn> b;
      private final cbq.a c;
      private final fho d;
      private final Set<bzx> e = EnumSet.noneOf(bzx.class);

      public c(ame $$0, jl<cbn> $$1, cbq.a $$2, fho $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ffc.c a(bzx $$0) {
         this.e.add($$0);
         return this;
      }

      public ffc.b a() {
         return new ffc.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
